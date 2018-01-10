package dominio.unitaria;

import org.junit.Test;

import co.ceiba.domain.Carro;
import co.ceiba.domain.Moto;
import co.ceiba.domain.Vigilant;
//import co.ceiba.servie.RepositorioRegistroParqueadero;
//import co.ceiba.servie.RepositorioVehiculo;
import co.ceiba.testDataBuilder.CarroTestDataBuilder;
import co.ceiba.testDataBuilder.MotoTestDataBuilder;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;

public class VigilanteTest {
	@Test
	public void registrarIngresoVehiculoCarroTest(){
		// arrange
		CarroTestDataBuilder carroTestDataBuilder = new CarroTestDataBuilder();
		Carro carro = carroTestDataBuilder.build();
		
		//RepositorioRegistroParqueadero repositorioParqueadero = mock(RepositorioRegistroParqueadero.class);
		
		//RepositorioVehiculo repositorioVehiculo = mock(RepositorioVehiculo.class);		
		
		//Vigilante vigilante = new Vigilante(repositorioParqueadero,repositorioVehiculo);
		Vigilant vigilante = new Vigilant();
		// act 
		String mensaje = vigilante.registrarIngresoVehiculo(carro);
		//assert
		assertEquals(mensaje,Vigilant.VEHICULO_INGRESADO);
	}
	
	@Test
	public void registrarIngresoVehiculoMotoTest(){
		// arrange
		MotoTestDataBuilder motoTestDataBuilder = new MotoTestDataBuilder();
		Moto moto = motoTestDataBuilder.build();
		
		//RepositorioRegistroParqueadero repositorioParqueadero = mock(RepositorioRegistroParqueadero.class);
		
		//RepositorioVehiculo repositorioVehiculo = mock(RepositorioVehiculo.class);		
		
		//Vigilante vigilante = new Vigilante(repositorioParqueadero,repositorioVehiculo);
		Vigilant vigilante = new Vigilant();
		// act 
		String mensaje = vigilante.registrarIngresoVehiculo(moto);
		//assert
		assertEquals(mensaje,Vigilant.VEHICULO_INGRESADO);
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
		Vigilant vigilante = new Vigilant();
		// act 
		boolean estaParqueado = vigilante.vehiculoParqueado(carro.getPlaca());
		//assert
		assertTrue(estaParqueado);
	}
}
