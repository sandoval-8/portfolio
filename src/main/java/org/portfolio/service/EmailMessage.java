package org.portfolio.service;

import org.portfolio.message.EmailSender;
import org.portfolio.util.email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailMessage {
	
	@Autowired
	private EmailSender enviarEmail;
	
	public void enviarMensaje(email Email) {
		enviarEmail.sendMessager(Email);
	}
}
