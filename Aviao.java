package Aviao;

public class Aviao {

	String modelo;
	String cor;
	int passageiros;
	boolean voar;
	private boolean decolar;
	
	void status() {
		System.out.println("Aviao do modelo: " + this.modelo);
		System.out.println("Aviao da cor: " + this.cor);
		System.out.println("Quantidade de passageiro: " + this.passageiros);
		System.out.println("Está voando ?"  + this.voar);
	
	}
		void voando() {
			
		}
	void decolar() {
		this.voar = true;
		System.out.println("O Aviao esta voando!");
	}
	void pousado() {
		this.voar = false;
		 System.out.println("O aviao esta pousando!");
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}

