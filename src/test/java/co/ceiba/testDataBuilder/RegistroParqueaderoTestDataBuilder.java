package co.ceiba.testDataBuilder;

import java.util.Date;

import co.ceiba.domain.RegistroParqueadero;
import co.ceiba.domain.Vehiculo;

public class RegistroParqueaderoTestDataBuilder {
	private final Vehiculo VEHICULO = new CarroTestDataBuilder().build();
	private final Date FECHAINGRESO = new Date();
	private final Date FECHASALIDA = new Date();
	private final double COSTOPARQUEADERO = 0;

	private Vehiculo vehiculo;
	private Date fechaIngreso;
	private Date fechaSalida;
	private double costoParqueadero;
	
	public RegistroParqueaderoTestDataBuilder(){
		this.vehiculo=VEHICULO;
		this.fechaIngreso=FECHAINGRESO;
		this.fechaSalida = FECHASALIDA;
		this.costoParqueadero = COSTOPARQUEADERO;
	}
	
	public RegistroParqueaderoTestDataBuilder conVehiculo(Vehiculo vehiculo){
		this.vehiculo=vehiculo;
		return this;
	} 
	
	public RegistroParqueaderoTestDataBuilder conFechaIngreso(Date fechaIngreso){
		this.fechaIngreso=fechaIngreso;
		return this;
	}
	
	public RegistroParqueaderoTestDataBuilder conFechaSalida(Date fechaSalida){
		this.fechaSalida=fechaSalida;
		return this;
	}
	
	public RegistroParqueaderoTestDataBuilder conCostoParqueadero(double costoParqueadero){
		this.costoParqueadero=costoParqueadero;
		return this;
	}
	
	public RegistroParqueadero build(){
		return new RegistroParqueadero(this.vehiculo,this.fechaIngreso,this.fechaSalida,this.costoParqueadero);
	}
}
