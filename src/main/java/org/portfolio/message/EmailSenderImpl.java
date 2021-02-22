package org.portfolio.message;

import org.portfolio.util.email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderImpl implements EmailSender {

	@Autowired
	private JavaMailSender emailSender;
	
	@Value("${app.mail.to}")
	private String to;
	
	@Value("${app.mail.subject}")
	private String subject;
	
	@Override
	public void sendMessager(email Email) {
		// TODO Auto-generated method stub
		SimpleMailMessage mensaje = new SimpleMailMessage();
		mensaje.setTo(to);
		mensaje.setSubject(subject);
		mensaje.setText(Email.getMensaje() + "\n \n" + "Enviado por: " + Email.getNombre() + " " + Email.getApellido()
				+ "\n" + "Correo: " + Email.getEmail());
		emailSender.send(mensaje);

	}

}
