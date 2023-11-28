package p001;

public class Classe {
	
	//01
	/**
	 * Uma classe é um tipo definido pelo usuário que contém o molde,
	 * a especificação para os objetos, algo mais ou menos como o tipo
	 * inteiro contém o molde para as variáveis declaradas como inteiros.
	 * A classe envolve, associa, funções e dados, controlando o acesso
	 * a estes, definí-la implica em especificar os seus atributos (dados)
	 * e seus métodos (funções).
	 */
	public class Carro{
		private String cor;
		private String modelo;
		private int ano;
		public void acelerar() {}
		public void frear() {}
	}
	public class Cama{
		private String colchao;
		private String tamanho;
		public void arrumar() {}
		public void dessarumar() {}
	}
	
	public class Professor{
		private String nome;
		private String diciplina;
		public void ensinar() {}
		public void corrigirLista() {}
	}
	
	public class Livro{
		private String titulo;
		private String autor;
	}
	
	public class Garrafa{
		private float capacidade;
		private String material;
		public void encher() {}
		public void esvaziar() {}
	}
	
	//03
	/**
	 * A herança é um dos conceitos fundamentais da Programação Orientada a 
	 * Objetos (POO), permitindo que as classes compartilhem características
	 * e comportamentos comuns enquanto estendem ou modificam esses atributos
	 * para atender a requisitos específicos. Em Java, a herança é uma pedra angular
	 * da linguagem, possibilitando a criação de hierarquias de classes poderosas 
	 * e facilitando a reutilização de código.
	 */
	public class Pessoa{
		protected String nome;
		protected String dataNascimento;
		protected String cpf;
	}
	public class Empregado extends Pessoa{
		private String cargo;
	}
	public class Estudante extends Pessoa{
		private String matricula;
	}
	
	
	public class Veiculo{
		protected String modelo;
		protected String tipo;
	}
	public class AutoMovel extends Veiculo{
		public void dirigir() {}
	}
	public class Navio extends Veiculo{
		public void navegar() {}
	}
	public class Aviao extends Veiculo{
		public void voar() {}
	}
	
	
	public class Doce{
		protected String nome;
		protected double preco;
	}
	public class Bolo extends Doce{
		private String massa;
		private String recheio;
		private String cobertura;
	}
	public class Bombom extends Doce{
		private String sabor;
		private String recheio;
	}
	
	public class Movel{
		protected String tipo;
	}
	public class Armario extends Movel{
		public void abrir() {};
		public void fechar() {};
	}
	public class Mesa extends Movel{
	}
	
	
	public class Celular{
		protected String modelo;
		protected String marca;
		public void ligar() {}
	}
	public class Smartphone extends Celular{
		public void mardarZap() {}
		public void tirarFoto() {}
	}
	public class Tijolao extends Celular{}
	
	public static void main(String[] args) {
		//02
		/**
		 * As variaveis mais utilizadas em Java são semelhantes as variaveis em C/C++, onde temos: 
		 * int, que representa numeros inteiros. 
		 * char que representa um caracter. 
		 * double que representa um numero de ponto fltuante (real)
		 * boolean que representa verdadeiro ou falso.
		 */
		int Inteiro = 3;
		char Caracter  = 'G';
		double Real = 3.1415;
		boolean VerdadeiroFalso = true;
		
		//04
		/**
		 * Como em java as variavies são ponteiros algumas aplicações sao diferentes do que temos em C++. 
		 * Quando declaramos uma variavel em C++ o espaco da memoria do tamanho da variavel é armazenado e 
		 * atribuido a variavel declarada, enquanto em java ao declarar uma variavel ou objeto, o mesmo 
		 * apenas criar um ponteiro que aponta para o espaco de memoria que foi reservado na inicializacao do codigo.
		 */
		
	}
	
}
