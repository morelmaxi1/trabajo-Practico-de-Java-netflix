package edu.unlz.core;

import java.util.Date;
import java.util.Set;

public class Persona extends Usuario{
	
	/*Persona: nombre, apellido, fecha de nacimiento, medio de pago, contenido visto(colección de
contenido visto). Comportamiento: agregarContenido(Contenido unContenido),
quitarContenido(Contenido unContenido), reproducir(Contenido unContenido)*/
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private MedioDePago unMedioDePago;
	private Set<Contenido>contenidoVisto;
	
	/**
	 * @param nombreDeUsuario
	 * @param contrasenia
	 * @param nombre
	 * @param apellido
	 * @param fechaDeNacimiento
	 * @param unMedioDePago
	 * @param contenidoVisto
	 */
	public Persona(String nombreDeUsuario, String contrasenia, String nombre, String apellido, Date fechaDeNacimiento,
			MedioDePago unMedioDePago, Set<Contenido> contenidoVisto) {
		super(nombreDeUsuario, contrasenia);
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.unMedioDePago = unMedioDePago;
		this.contenidoVisto = contenidoVisto;
	}

	// Comportamientos
	
	/**
	 * Agrega un contenido a la lista de vistos
	 * @param contenido
	 */
	public void agregarContenido(Contenido contenido) {
		if(!contenidoVisto.contains(contenido)) {
			contenidoVisto.add(contenido);
			System.out.println("Pelicula "+ contenido.getNombre() +" agregada exitosamente.");
		}else {
			System.out.println("La pelicula ya se encuentra en la lista.");
		}
		
		
	}

	/**
	 * Elimina contenido de la lista de vistos
	 * @param contenido
	 */
	public void quitarContenido(Contenido contenido) {
		if(!contenidoVisto.contains(contenido)) {
			System.out.println("No se encuentra la pelicula "+ contenido.getNombre() +" en la lista.");
		}else {
			contenidoVisto.remove(contenido);
			System.out.println("Pelicula "+ contenido.getNombre() +" fue eliminada de la lista exitosamente.");
		}
	}
	
	/**
	 * Muestra los datos del contenido a reproducir
	 * @param contenido
	 */
	public void reproducirContenido(Contenido contenido) {
		if(!contenidoVisto.contains(contenido)) {
			System.out.println("No se puede reproducir la pelicula "+ contenido.getNombre());
		}else {
			contenido.reproducir();			
		}
	}
		

	@Override
	public void loguear(String nombre, String contrasenia) {
		
		if(nombre == null && contrasenia == null) {
			System.out.println("Datos incompletos");
		}else {
			System.out.println("Login exitoso, bienvenido usuario : "+ this.nombre+" !!");
		}
		
	}

	@Override
	public void desloguearse() {
		System.out.println("Usted ha salido de su cuenta de usuario.");
	}
	
	@Override
	public void imprimir() {
		if (getNombreDeUsuario() != null) {
			System.out.println("Usuario: " + getNombreDeUsuario());
		} else {
			System.err.println("Nombre de usuario inexistente.");
		}
		if (getContrasenia() != null) {
			System.out.println("Contraseña: " + getContrasenia());
		} else {
			System.err.println("Contraseña inexistente.");
		}

		if (this.nombre != null && this.apellido != null) {
			System.out.println("Nombre y Apellido: " + nombre + " " + apellido);
		} else {
			System.err.println("Nombre/Apellido Erroneos");
		}
		if (this.fechaDeNacimiento != null) {
			System.out.println("Fecha de Nacimiento: " + fechaDeNacimiento);
		} else {
			System.err.println("Fecha inexistente");
		}

		if (unMedioDePago.getNombre() != null) {
			System.out.println("Medio de Pago: " + unMedioDePago.getNombre());
		} else {
			System.out.println("Medio de pago inexistente.");
		}

		System.out.println("Contenido visto: " + contenidoVisto.toString());

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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the fechaDeNacimiento
	 */
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/**
	 * @param fechaDeNacimiento the fechaDeNacimiento to set
	 */
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	/**
	 * @return the unMedioDePago
	 */
	public MedioDePago getUnMedioDePago() {
		return unMedioDePago;
	}

	/**
	 * @param unMedioDePago the unMedioDePago to set
	 */
	public void setUnMedioDePago(MedioDePago unMedioDePago) {
		this.unMedioDePago = unMedioDePago;
	}

	/**
	 * @return the contenidoVisto
	 */
	public Set<Contenido> getContenidoVisto() {
		return contenidoVisto;
	}

	/**
	 * @param contenidoVisto the contenidoVisto to set
	 */
	public void setContenidoVisto(Set<Contenido> contenidoVisto) {
		this.contenidoVisto = contenidoVisto;
	}


}
