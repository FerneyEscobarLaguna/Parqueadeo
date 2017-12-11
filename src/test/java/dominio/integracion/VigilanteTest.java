package dominio.integracion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.ceiba.domain.Carro;
import co.ceiba.domain.Moto;
import co.ceiba.domain.Vigilante;
import co.ceiba.testDataBuilder.CarroTestDataBuilder;
import co.ceiba.testDataBuilder.MotoTestDataBuilder;

public class VigilanteTest {
	@Test
	public void registrarIngresoMotosSimultaneasTest(){
		// arrange
		MotoTestDataBuilder motoTestDataBuilder = new MotoTestDataBuilder();
		Moto moto;
		Vigilante vigilante = new Vigilante();
		// act 
		for(int i=1;i<=9;i++){
			moto = motoTestDataBuilder.conPlaca("MOTO-0"+i).build();
		}
		moto = motoTestDataBuilder.conPlaca("MOTO-010").build();
		String mensaje = vigilante.registrarIngresoVehiculo(moto);
		//assert
		assertEquals(mensaje,Vigilante.PARQUEADERO_LLENO);
	}
	
	@Test
	public void registrarIngresoCarrosSimultaneasTest(){
		// arrange
		CarroTestDataBuilder carroTestDataBuilder = new CarroTestDataBuilder();
		Carro carro;
		Vigilante vigilante = new Vigilante();
		// act 
		for(int i=1;i<=19;i++){
			carro = carroTestDataBuilder.conPlaca("CARR-0"+i).build();
		}
		carro = carroTestDataBuilder.conPlaca("CARR-020").build();
		String mensaje = vigilante.registrarIngresoVehiculo(carro);
		//assert
		assertEquals(mensaje,Vigilante.PARQUEADERO_LLENO);
	}
	
	@Test
	public void registrarIngresoPlacaATest(){
		// arrange
		String placaConA = "AAA-123";
		CarroTestDataBuilder carroTestDataBuilder = new CarroTestDataBuilder();
		Carro carro = carroTestDataBuilder.conPlaca(placaConA).build();;
		Vigilante vigilante = new Vigilante();
		// act
		String mensaje = vigilante.registrarIngresoVehiculo(carro);
		//assert
		assertEquals(mensaje,Vigilante.PLACA_NO_HABIL);
	}
}
