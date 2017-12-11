package dominio.unitaria;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import co.ceiba.domain.RegistroParqueadero;
import co.ceiba.testDataBuilder.RegistroParqueaderoTestDataBuilder;

public class RegistroParqueaderoTest {
	private final Date FECHAINGRESO = new Date();
	private final Date FECHASALIDA = new Date();
	private final double COSTOPARQUEADERO = 500;
	@Test
	public void crearRegistroParqueadero(){
		// arrange
		RegistroParqueaderoTestDataBuilder registroParqueaderoTDB = new RegistroParqueaderoTestDataBuilder();	
		// act 
		RegistroParqueadero registroParqueadero = registroParqueaderoTDB.
													conFechaIngreso(FECHAINGRESO).
													conFechaSalida(FECHASALIDA).
													conCostoParqueadero(COSTOPARQUEADERO).
													build();
		//assert
		assertEquals(registroParqueadero.getFechaIngreso(),FECHAINGRESO);
		assertEquals(registroParqueadero.getFechaSalida(),FECHASALIDA);
		assertEquals(registroParqueadero.getCostoParqueadero(),COSTOPARQUEADERO,0);
	}
}
