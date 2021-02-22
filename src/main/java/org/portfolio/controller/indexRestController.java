package org.portfolio.controller;

import org.portfolio.service.EmailMessage;
import org.portfolio.util.email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexRestController {
	
	@Autowired
	private EmailMessage mensaje;
	
	@PostMapping("/enviar")
	public HttpStatus enviar(@RequestBody email Email){
		mensaje.enviarMensaje(Email);
		return HttpStatus.OK;
	}
}
