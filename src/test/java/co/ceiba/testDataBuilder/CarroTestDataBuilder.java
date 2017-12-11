package co.ceiba.testDataBuilder;

import co.ceiba.domain.Carro;;

public class CarroTestDataBuilder {
	private final String PLACA = "FALS-123";
	
	private String placa;
	
	public CarroTestDataBuilder(){
		this.placa=PLACA;
	}
	
	public CarroTestDataBuilder conPlaca(String placa){
		this.placa=placa;
		return this;
	}
	
	public Carro build(){
		return new Carro(this.placa);
	}
}
