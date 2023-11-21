package exercicios;

import java.text.*;
import java.util.Date;

public class Estudante {
private String nome;
private Date dataNascimento = new Date();
private String cpf;


public Estudante(String nome, String cpf) {
	this.nome = nome;
	//this.dataNascimento = dataNascimento;
	this.cpf = cpf;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}


public Date getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento = dataNascimento;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public Date stringParaData(String stringData) {
	SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
	Date data = new Date();
	try {
		data = sdf1.parse(stringData);
	}catch (ParseException e){
		System.out.println("erro");
	}
	
			return data;
}


public static void main(String[] args) {
	Estudante e1 = new Estudante("joka","00000000");
	Date novaData = new Date();
	novaData = stringParaData("14/03/2000");
	e1.setDataNascimento( novaData );
	System.out.println(e1.getDataNascimento());
}

}
