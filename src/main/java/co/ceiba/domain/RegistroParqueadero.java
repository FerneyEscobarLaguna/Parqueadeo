package co.ceiba.domain;

import java.util.Date;

public class RegistroParqueadero {
	private Vehiculo vehiculo;
	private Date fechaIngreso;
	private Date fechaSalida;
	private double costoParqueadero;
	private int registro_vehiculo_id;
	
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
	
	public RegistroParqueadero(int registro_vehiculo_id,Vehiculo vehiculo, Date fechaIngreso, Date fechaSalida, double costoParqueadero) {
		this.vehiculo = vehiculo;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.costoParqueadero = costoParqueadero;
		this.registro_vehiculo_id = registro_vehiculo_id;
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

	public int getRegistro_vehiculo_id() {
		return registro_vehiculo_id;
	}

	public void setRegistro_vehiculo_id(int registro_vehiculo_id) {
		this.registro_vehiculo_id = registro_vehiculo_id;
	}	
	
}
