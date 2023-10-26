package Abstrata;

public class Main {
	public static void main(String[] args) {
		Carro ferrari = new Carro("0000","F1","Vermelho",2012);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		Onibus marcopolo = new Onibus ("11111","XB1","Prata",2020);
		marcopolo.acelerar();
		marcopolo.frear();
		marcopolo.virar();
		marcopolo.frear();
}
}