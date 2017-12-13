package co.ceiba.domain;

import co.ceiba.service.RepositorioRegistroParqueadero;
import co.ceiba.service.RepositorioVehiculo;
import co.ceiba.service.Tool;
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
		String tipoVehiculo = placa.substring(0,1);
		int horasEnParqueadero=Integer.parseInt(placa.substring(1,3));
		int diasCobrar=0;
		int horasCobrar=0;
		double valorcobrar=0;
		if(horasEnParqueadero>9){
			if(horasEnParqueadero>24){
				diasCobrar=horasEnParqueadero/24;
				horasCobrar=horasEnParqueadero%24;
			}else{
				diasCobrar=1;
				horasCobrar=0;				
			}
		}else{
			diasCobrar=0;
			horasCobrar=horasEnParqueadero;
		}
		
		if(tipoVehiculo.equals("C")){
			valorcobrar=(diasCobrar*8000) + (horasCobrar*1000);
		}else{
			int cilindraje = Integer.parseInt(placa.substring(3,6));
			valorcobrar=(diasCobrar*600) + (horasCobrar*500);
			if(cilindraje>500)
				valorcobrar+=2000;
		}
		return valorcobrar;
	}
	
	public boolean vehiculoParqueado(String placa){
		return true;
	}
	
	public String consultarVehiculos() throws Exception{
		Tool tool = new Tool();
		return tool.convertToJSON(repositorioParqueadero.obtenerVehiculosParqueados());
	}
}
