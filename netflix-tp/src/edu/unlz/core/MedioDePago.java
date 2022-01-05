package edu.unlz.core;

public abstract class MedioDePago implements Imprimible {
	
	private String nombre;
	
	// Constructor
	public MedioDePago(String nombre) {
		this.nombre = nombre;
	}
		
	// Metodo para realizar el pago
	/**
	 * 
	 * @param total
	 */
	public abstract void pagar();

	
	// Getters y Setters
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
