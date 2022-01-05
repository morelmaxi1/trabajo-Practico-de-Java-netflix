package edu.unlz.core;

import java.util.Set;

import edu.unlz.exception.NoSePudoBorrarException;
import edu.unlz.exception.YaExisteContenidoException;

public class Servidor implements Imprimible{
/*Servidor: colección de todo los contenidos sin repetidos. Comportamientos: agregar y quitar
contenidos.
*/
	Set<Contenido> listaPeliculas ;
	
	
	public Servidor(Set<Contenido> listaPeliculas) {
	this.listaPeliculas = listaPeliculas;
}

	/**
	 * Agrega una pelicula a la coleccion de netflix
	 * @param contenido
	 * @throws YaExisteContenidoException 
	 */
	public void agregar(Contenido contenido) throws YaExisteContenidoException {
	
		if(listaPeliculas.contains(contenido)) {
			throw new YaExisteContenidoException("Error, Ya existe la pelicula: " + contenido.getNombre() + ".\n");
		}else {
			listaPeliculas.add(contenido);
			System.out.println("Pelicula "+ contenido.getNombre() +" agregada exitosamente.\n");
			//System.out.println("La pelicula ya se encuentra en la lista.\n");
		}
	}
	
	/**
	 * Elimina una pelicula de la coleccion de netflix
	 * @param contenido
	 * @throws NoSePudoBorrarException 
	 */
	public void quitar(Contenido contenido) throws NoSePudoBorrarException {
	
		if(!listaPeliculas.contains(contenido)) {
			throw new NoSePudoBorrarException("No se encuentra la pelicula "+ contenido.getNombre() +" en la lista.\n");
		}else {
			listaPeliculas.remove(contenido);
			System.out.println("Pelicula "+ contenido.getNombre() +" fue eliminada de la lista exitosamente.\n");
		}
	}

	@Override
	public void imprimir() {
		
		if(!listaPeliculas.isEmpty() ) {
			System.out.println("ListaPeliculas: " + listaPeliculas + ".\n");
		}else {
			System.out.println("No exiten peliculas en la lista.\n");
		}
	}


	/**
	 * @return the listaPeliculas
	 */
	public Set<Contenido> getListaPeliculas() {
		return listaPeliculas;
	}

	/**
	 * @param listaPeliculas the listaPeliculas to set
	 */
	public void setListaPeliculas(Set<Contenido> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}
	
	
	
}
