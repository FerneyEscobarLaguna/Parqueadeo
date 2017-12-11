package dominio.unitaria;

import org.junit.Test;

import co.ceiba.domain.Carro;
import co.ceiba.domain.Vigilante;
//import co.ceiba.servie.RepositorioRegistroParqueadero;
//import co.ceiba.servie.RepositorioVehiculo;
import co.ceiba.testDataBuilder.CarroTestDataBuilder;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;

public class VigilanteTest {
	@Test
	public void registrarIngresoVehiculoTest(){
		// arrange
		String placaHabil="HABI-123";
		CarroTestDataBuilder carroTestDataBuilder = new CarroTestDataBuilder();
		Carro carro = carroTestDataBuilder.conPlaca(placaHabil).build();
		
		//RepositorioRegistroParqueadero repositorioParqueadero = mock(RepositorioRegistroParqueadero.class);
		
		//RepositorioVehiculo repositorioVehiculo = mock(RepositorioVehiculo.class);		
		
		//Vigilante vigilante = new Vigilante(repositorioParqueadero,repositorioVehiculo);
		Vigilante vigilante = new Vigilante();
		// act 
		String mensaje = vigilante.registrarIngresoVehiculo(carro);
		//assert
		assertEquals(mensaje,Vigilante.VEHICULO_INGRESADO);
	}
	
	@Test
	public void vehiculoParqueadoTest(){
		// arrange
		CarroTestDataBuilder carroTestDataBuilder = new CarroTestDataBuilder();
		Carro carro = carroTestDataBuilder.build();
		
		//RepositorioRegistroParqueadero repositorioParqueadero = mock(RepositorioRegistroParqueadero.class);
		//when(repositorioParqueadero.obtenerVehiculoParqueadoPlaca(carro.getPlaca())).thenReturn(carro);
		
		//RepositorioVehiculo repositorioVehiculo = mock(RepositorioVehiculo.class);		
		
		//Vigilante vigilante = new Vigilante(repositorioParqueadero,repositorioVehiculo);
		Vigilante vigilante = new Vigilante();
		// act 
		boolean estaParqueado = vigilante.vehiculoParqueado(carro.getPlaca());
		//assert
		assertTrue(estaParqueado);
	}
}
