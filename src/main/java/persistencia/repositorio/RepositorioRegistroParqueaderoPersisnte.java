package persistencia.repositorio;

import java.sql.ResultSet;

import co.ceiba.conection.Conection;
import co.ceiba.domain.RegistroParqueadero;
import co.ceiba.domain.Vehiculo;
import co.ceiba.service.RepositorioRegistroParqueadero;

public class RepositorioRegistroParqueaderoPersisnte implements RepositorioRegistroParqueadero{

	public Vehiculo obtenerVehiculoParqueadoPlaca(String placa){
		return null;
	}
	
	public void registrarIngreso(RegistroParqueadero registroParqueadero) {
	}
	
	public void registraSalida(RegistroParqueadero registroParqueadero) {
	}

	public ResultSet obtenerVehiculosParqueados() {
		Conection con= new Conection();
		String query = "SELECT PLACA,TIPO_VEHICULO,FECHA_INGRESO FROM REGISTRO_PARQUEADERO";
		ResultSet rs = con.executeQuery(query);
		return rs;
	}
}
