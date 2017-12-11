package co.ceiba.domain;

import java.util.Date;

public class RegistroParqueadero {
	private Vehiculo vehiculo;
	private Date fechaIngreso;
	private Date fechaSalida;
	private double costoParqueadero;
	
	public RegistroParqueadero(Vehiculo vehiculo){
		this.vehiculo = vehiculo;
		this.fechaIngreso = new Date();
	}
	
	public RegistroParqueadero(Vehiculo vehiculo, Date fechaIngreso, Date fechaSalida, double costoParqueadero) {
		this.vehiculo = vehiculo;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.costoParqueadero = costoParqueadero;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public double getCostoParqueadero() {
		return costoParqueadero;
	}
	public void setCostoParqueadero(double costoParqueadero) {
		this.costoParqueadero = costoParqueadero;
	}	
}
