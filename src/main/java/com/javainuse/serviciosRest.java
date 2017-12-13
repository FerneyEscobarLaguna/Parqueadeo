package com.javainuse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.ceiba.domain.Vigilante;

@RestController
public class serviciosRest {
	@CrossOrigin
	@RequestMapping("/consultarVehiculos")
	public String consultarVehiculos() throws Exception{
		return new Vigilante().consultarVehiculos();
	}
}
