package co.ceiba.testDataBuilder;

import co.ceiba.domain.Moto;

public class MotoTestDataBuilder {
	private final String PLACA = "FALS-123";
	private final int CILINDRAJE = 600;
	
	private String placa;
	private int cilindraje;
	
	public MotoTestDataBuilder(){
		this.placa=PLACA;
		this.cilindraje=CILINDRAJE;
	}
	
	public MotoTestDataBuilder conPlaca(String placa){
		this.placa=placa;
		return this;
	}
	
	public MotoTestDataBuilder conCilindraje(int cilindraje){
		this.cilindraje=cilindraje;
		return this;
	}
	
	public Moto build(){
		return new Moto(this.placa,this.cilindraje);
	}
}
