package edu.unlz.core;

public class Contenido implements Imprimible{
/*Contenido: nombre, año, género(Se recomienda usar un enum o constantes), tiempo de
reproducción(en long), valoración (estrellas entero de 1 a 10), reproducir.*/
	private String nombre;
	private int anio;
	Genero unGenero;
	private long tiempoDeReproduccion;
	private int valoracion;
	
	/**
	 * 
	 * @param nombre
	 * @param anio
	 * @param unGenero
	 * @param tiempoDeReproduccion
	 * @param valoracion
	 */
	public Contenido(String nombre, int anio, Genero unGenero, long tiempoDeReproduccion, int valoracion) {
		this.nombre = nombre;
		this.anio = anio;
		this.unGenero = unGenero;
		this.tiempoDeReproduccion = tiempoDeReproduccion;
		this.valoracion = valoracion;
	}

	// Metodo para mostrar los datos del contenido reproducido.
	public void reproducir() {
		if(this.nombre != null) {
			System.out.println("Reproduciendo: " + nombre +".\nDuracion: "+tiempoDeReproduccion+" minutos.\n");			
		}else {
			System.err.println("No se puede repreoducir el contenido.");
		}
	}
	
	@Override
	public void imprimir() {
		if(this.nombre != null) {
			System.out.println("Nombre: " + this.nombre);
		}else {
			System.err.println("Nombre Erroneo");
		}
		
		if(this.getUnGenero() != null) {
			System.out.println("Genero: " + unGenero);
		}else {
			System.err.println("Genero Erroneo");
		}
		
		if(this.tiempoDeReproduccion != 0) {
			System.out.println("Tiempo De Reproduccion: "
					+ this.tiempoDeReproduccion + " minutos.");
		}else {
			System.err.println("tiempo de reproduccion Erroneo");
		}
		
		if(this.valoracion != 0) {
			System.out.println("Valoracion: " + this.valoracion + " Estrellas");
		}else {
			System.err.println("Valoracion erronea");
		}
		
	}
	
	
	@Override
	public String toString() {
		return "\nNombre: " + nombre + ", Genero: " + unGenero + ", Tiempo De Reproduccion:"
				+ tiempoDeReproduccion + " minutos. , Valoracion:" + valoracion + " estrellas.";
	}
	
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

	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return the unGenero
	 */
	public Genero getUnGenero() {
		return unGenero;
	}

	/**
	 * @param unGenero the unGenero to set
	 */
	public void setUnGenero(Genero unGenero) {
		this.unGenero = unGenero;
	}

	/**
	 * @return the tiempoDeReproduccion
	 */
	public long getTiempoDeReproduccion() {
		return tiempoDeReproduccion;
	}

	/**
	 * @param tiempoDeReproduccion the tiempoDeReproduccion to set
	 */
	public void setTiempoDeReproduccion(long tiempoDeReproduccion) {
		this.tiempoDeReproduccion = tiempoDeReproduccion;
	}

	/**
	 * @return the valoracion
	 */
	public int getValoracion() {
		return valoracion;
	}

	/**
	 * @param valoracion the valoracion to set
	 */
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}


	
	
}
