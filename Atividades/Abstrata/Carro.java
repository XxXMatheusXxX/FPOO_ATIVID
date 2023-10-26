package Abstrata;

public class Carro extends Vehicles {

	public Carro(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}
	
	@Override
	public void acelerar() {
		System.out.println("O carros esta acelerando");
	}
	
	@Override
	public void frear() {
		System.out.println("O carros esta freando");
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
