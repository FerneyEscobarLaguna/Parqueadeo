package dominio.integracion;

import static org.junit.Assert.*;

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
			vigilante.registrarIngresoVehiculo(moto);
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
			vigilante.registrarIngresoVehiculo(carro);
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
		Carro carro = carroTestDataBuilder.conPlaca(placaConA).build();
		Vigilante vigilante = new Vigilante();
		// act
		String mensaje = vigilante.registrarIngresoVehiculo(carro);
		//assert
		assertEquals(mensaje,Vigilante.PLACA_NO_HABIL);
	}
	
	@Test
	public void registrarSalidaCarroTest(){
		Vigilante vigilante = new Vigilante();
		double costo = vigilante.registrarSalidaVehiculo("C08");
		assertEquals(costo,8000,0);
	}
	
	@Test
	public void registrarSalidaCarroDiasTest(){
		Vigilante vigilante = new Vigilante();
		double costo = vigilante.registrarSalidaVehiculo("C27");
		assertEquals(costo,11000,0);
	}
	
	@Test
	public void registrarSalidaMotoTest(){
		Vigilante vigilante = new Vigilante();
		double costo = vigilante.registrarSalidaVehiculo("M08110");
		assertEquals(costo,4000,0);
	}
	
	@Test
	public void registrarSalidaMotoDiasTest(){
		Vigilante vigilante = new Vigilante();
		double costo = vigilante.registrarSalidaVehiculo("M27110");
		assertEquals(costo,2100,0);
	}
	
	@Test
	public void registrarSalidaMotoCilindrajeTest(){
		Vigilante vigilante = new Vigilante();
		double costo = vigilante.registrarSalidaVehiculo("M27600");
		assertEquals(costo,4100,0);
	}
}
