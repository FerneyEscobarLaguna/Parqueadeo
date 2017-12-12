package co.ceiba.service;

import java.sql.ResultSet;

import co.ceiba.domain.RegistroParqueadero;
import co.ceiba.domain.Vehiculo;

public interface RepositorioRegistroParqueadero {
	/**
	 * Permite obtener vehiculo que se encuentre en el parqueadero
	 * @param placa
	 */
	Vehiculo obtenerVehiculoParqueadoPlaca(String placa);
	
	/**
	 * Permite registrar el ingreso de un vehiculo al parqueadero
	 * @param registroParqueadero
	 */
	void registrarIngreso(RegistroParqueadero registroParqueadero);
	
	/**
	 * Permite registrar la salida de un vehiculo del parqueadero
	 * @param registroParqueadero
	 */
	void registraSalida(RegistroParqueadero registroParqueadero);
	
	/**
	 * Permite consultar los vehiculos e nel parqueadero
	 * @param registroParqueadero
	 */
	ResultSet obtenerVehiculosParqueados();
}
