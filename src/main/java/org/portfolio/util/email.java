package org.portfolio.util;

public class email {
	
	private String nombre;
	private String apellido;
	private String email;
	private String mensaje;
	
	public email() {
		
	}

	public email(String nombre, String apellido, String email, String mensaje) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.mensaje = mensaje;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
