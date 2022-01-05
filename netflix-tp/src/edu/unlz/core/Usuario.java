package edu.unlz.core;

public abstract class Usuario implements Imprimible{
	//Usuario (abstracta): nombre de usuario, contraseña. Comportamiento loguear y desloguear
	private String nombreDeUsuario;
	private String contrasenia;
	
	/**
	 * 
	 * @param nombreDeUsuario
	 * @param contrasenia
	 */
	public Usuario(String nombreDeUsuario, String contrasenia) {
		this.nombreDeUsuario = nombreDeUsuario;
		this.contrasenia = contrasenia;
	}
	
	//Metodos
	// Simula el login de la app
	/**
	 * 
	 * @param nombre
	 * @param contraseña
	 */
	public abstract void loguear(String nombre,String contraseña);

	// Simula el deslogueado de la app
	public abstract void desloguearse();

	// Gatters y Setters
	/**
	 * @return the nombreDeUsuario
	 */
	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	/**
	 * @param nombreDeUsuario the nombreDeUsuario to set
	 */
	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	

	
	
	
	

}
