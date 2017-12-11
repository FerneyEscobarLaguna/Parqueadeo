package co.ceiba.servie;

import co.ceiba.domain.Vehiculo;

public interface RepositorioVehiculo {
	/**
	 * Permite obtener un vehiculo por su placa
	 * @param placa
	 */
	Vehiculo obtenerPorPlaca(String placa);
	
	/**
	 * Permite registrar un nuevo vehiculo
	 * @param vehiculo
	 */
	void agregar(Vehiculo vehiculo);
}
