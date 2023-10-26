package Abstrata;

public class Onibus extends Vehicles {

	public Onibus(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}
	
	@Override
	public void acelerar() {
		System.out.println("O onibus esta acelerando");
	}
	
	@Override
	public void frear() {
		System.out.println("O onibus esta freando");
	}
	
	@Override
	public void virar() {
		System.out.println("O carros esta virando");
	}
	
	@Override
	public void ligar() {
		System.out.println("O carros esta ligando");
	}
}
