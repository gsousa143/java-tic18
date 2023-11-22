	class Carro{
        private:
		String cor;
        String modelo;
		int ano;
        public:
		void acelerar() {}
		void frear() {}
	};

	class Cama{
        private:
		String colchao;
		String tamanho;
        public:
		void arrumar() {}
		void dessarumar() {}
	};
	
	class Professor{
        private:
		String nome;
		String diciplina;
        public:
		void ensinar() {}
		void corrigirLista() {}
	};
	
	class Livro{
        private:
		String titulo;
		String autor;
	};
	
	class Garrafa{
        private:
		float capacidade;
		String material;
        public:
		void encher() {}
		void esvaziar() {}
	};
	
	//03
	class Pessoa{
        protected:
		String nome;
		String dataNascimento;
		String cpf;
	};
	class Empregado : Pessoa{
        private:
		String cargo;
	};
	class Estudante : Pessoa{
        private:
		String matricula;
	};
	
	
	class Veiculo{
        protected:
		String modelo;
		String tipo;
	};
	class AutoMovel : Veiculo{
        public:
		void dirigir() {}
	};
	class Navio : Veiculo{
        public:
		void navegar() {}
	};
	class Aviao : Veiculo{
        public:
		void voar() {}
	};
	
	
	class Doce{
        protected:
		String nome;
		double preco;
	};
	class Bolo : Doce{
        private:
		String massa;
		String recheio;
		String cobertura;
	};
	class Bombom : Doce{
        private:
		String sabor;
		String recheio;
	};
	
	class Movel{
        protected:
		String tipo;
	};
	class Armario : Movel{
        public:
		void abrir() {};
		void fechar() {};
	};
	class Mesa : Movel{
	};
	
	
	class Celular{
        protected:
		String modelo;
		String marca;
        public:
		void ligar() {}
	};
	class Smartphone : Celular{
        public:
		void mardarZap() {}
		void tirarFoto() {}
	};
	class Tijolao : Celular{};