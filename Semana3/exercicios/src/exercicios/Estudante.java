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

static public Date stringParaData(String stringData) throws ParseException {
	SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
	Date data = new Date();
	data = sdf1.parse(stringData);
	
	return data;
}


public static void main(String[] args) throws ParseException {
	Estudante e1 = new Estudante("joka","00000000");
	Date novaData = new Date();
	novaData = Estudante.stringParaData("14/03/2000");
	e1.setDataNascimento( Estudante.stringParaData("14/03/2000") );
	System.out.println(e1.getDataNascimento());
}

}
