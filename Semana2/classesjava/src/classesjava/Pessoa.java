package classesjava;


/*
 *  class Pessoa 
 {
 private:
   string nome; 
   int altura;
   string classeAltura;
   public:
   getters and setters
   
 };

 void setValues(Person&);
 void getValues(const Person&);
 void setClasseAltura();
 */
public class Pessoa {
	private String nome;
	private double altura;
	private String classeAltura;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public double getAltura() {
		return altura;
	}

	public String getClasseAltura() {
		return classeAltura;
	}

	public void classificaAltura() {
		if (altura < 1.55) {
			classeAltura = "Baixo";
			return;
		}
		if (altura < 1.75) {
			classeAltura = "Medio";
			return;
		}
		classeAltura = "Alto";
	}
	
	public Pessoa(String nome, double altura) {
		this.nome = nome;
		this.altura = altura;
	}
	
	public Pessoa() {
		this.nome = "Sem nome";
		this.altura = 0;
	}
	
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("Joao",3.0);
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
	}
}





