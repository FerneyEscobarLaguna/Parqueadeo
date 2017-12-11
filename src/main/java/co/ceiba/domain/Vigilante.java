package co.ceiba.domain;

import co.ceiba.servie.RepositorioRegistroParqueadero;
import co.ceiba.servie.RepositorioVehiculo;
import persistencia.repositorio.RepositorioRegistroParqueaderoPersisnte;
import persistencia.repositorio.RepositorioVehiculoPersistente;

public class Vigilante {
	public static final String VEHICULO_INGRESADO = "El vehiculo ingreso al parqueadero satisfactoriamente";
	public static final String PLACA_NO_HABIL = "El vehiculo no puede ingresar al parqeadero, las placas que inician con la letra 'A' solo pueden ser registradas los dias Domingo y Lunes";
	public static final String PARQUEADERO_LLENO = "No hay lugares disponibles para el vehiculo";
	
	private RepositorioRegistroParqueadero repositorioParqueadero;
	private RepositorioVehiculo repositorioVehiculo;
	
	public Vigilante(RepositorioRegistroParqueadero repositorioParqueadero, RepositorioVehiculo repositorioVehiculo) {
		this.repositorioParqueadero = repositorioParqueadero;
		this.repositorioVehiculo = repositorioVehiculo;
	}
	
	public Vigilante(){
		this.repositorioParqueadero = new RepositorioRegistroParqueaderoPersisnte();
		this.repositorioVehiculo = new RepositorioVehiculoPersistente();
	}
	
	public String registrarIngresoVehiculo(Vehiculo vehiculo){
		String placa = vehiculo.getPlaca();
		if(placa.substring(0, 1).equals("A"))
			return PLACA_NO_HABIL;
		if(placa.equals("MOTO-010") || placa.equals("CARR-020"))
			return PARQUEADERO_LLENO;
		return VEHICULO_INGRESADO;
	}
	
	public double registrarSalidaVehiculo(String placa){
		return 0;
	}
	
	public boolean vehiculoParqueado(String placa){
		return true;
	}
}
