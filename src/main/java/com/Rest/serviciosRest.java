package com.Rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.ceiba.domain.Carro;
import co.ceiba.domain.Moto;
import co.ceiba.domain.Vehiculo;
import co.ceiba.domain.Vigilant;

@RestController
public class serviciosRest {
	@CrossOrigin
	@RequestMapping(value = "/consultarVehiculos", method=RequestMethod.GET)
	public String consultarVehiculos() throws Exception{
		String vehiculosJson = new Vigilant().consultarVehiculos();
		System.out.println(vehiculosJson);
		return vehiculosJson;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/consultarVehiculo/placa={placa}", method=RequestMethod.GET)
	public Boolean consultarVehiculo(@PathVariable("placa") String placa) throws Exception{
		return new Vigilant().vehiculoParqueado(placa);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/registrarSalida/placa={placa}", method=RequestMethod.GET)
	public Double registrarSalida(@PathVariable("placa") String placa) throws Exception{
		return new Vigilant().registrarSalidaVehiculo(placa);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/registrarIngreso/placa={placa}&tipo={tipo}&cilindraje={cilindraje}", method=RequestMethod.GET)
	public String registrarIngreso(@PathVariable("placa") String placa, @PathVariable("tipo") String tipo, @PathVariable("cilindraje") String cilindraje) throws Exception{
		Vehiculo vehiculo;
		int cilindrajeInt=0;
		if(tipo.equals("C"))
			vehiculo = new Carro(placa);
		else{
			if(!cilindraje.isEmpty())
				cilindrajeInt=Integer.parseInt(cilindraje);
			vehiculo = new Moto(placa,cilindrajeInt);	
		}
		String respuesta = "{\"res\":\"";
		respuesta=new Vigilant().registrarIngresoVehiculo(vehiculo)+"\"}";
		return respuesta;
	}
}
