package edu.unlz.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import edu.unlz.core.*;

import edu.unlz.exception.NoSePudoBorrarException;
import edu.unlz.exception.YaExisteContenidoException;

public class TestPrueba {

	public static void main(String[] args) {
		
		TestMedioDePago();
		//TestUsuario();
		//TestServidor();
	}
	
	public static void TestMedioDePago() {
		
		MedioDePago unMedio =  new MercadoPago("Mercado Pago" ,1580);
		unMedio.pagar();	
		unMedio.imprimir();
		
		System.out.println("");	
		MedioDePago otroMedio = new Paypal("Paypal", 2669);
		otroMedio.pagar();
		otroMedio.imprimir();
		
		System.out.println("");	
		MedioDePago otroMedioMas = new Paypal("Tarjeta Visa", 3249);
		otroMedioMas.pagar();
		otroMedioMas.imprimir();
		
	}
	
	public static void TestUsuario() {
		
		System.out.println(" ..................  EMPIEZA LA PRUEBA LA CLASE PERSONA ..............................");
		
		MedioDePago unMedio =  new MercadoPago("Mercado pago", 1580);
		HashSet<Contenido> miContenido = new HashSet<>();

		Contenido peli1 = new Contenido("Piratas del Caribe", 2010, Genero.COMEDIA, 1541, 9);
		Contenido peli2 = new Contenido("Piratas del Caribe 3", 2017, Genero.COMEDIA, 1737, 7);
		Contenido peli3 = new Contenido("Transformers", 2015, Genero.ACCION, 1269, 8);
		
		String fechaDeNacimiento = "08/03/1991";
		DateFormat formato = new SimpleDateFormat("dd/MM/yy");
		Date fecha = null;
		try {
			fecha = formato.parse(fechaDeNacimiento);
		} catch (ParseException e) {
			System.out.println("Fecha Incorrecta.");
		}
		//System.out.println(fecha);
		
		Persona unUsuario = new Persona("Seba0088","9191Seba","Sebastian", "Allende", fecha, unMedio, miContenido);
		
		System.out.println("---- LOGIN ------");
		unUsuario.loguear(unUsuario.getNombreDeUsuario(), unUsuario.getContrasenia());
		
		// Agregando peliculas a la lista
		unUsuario.agregarContenido(peli1);
		unUsuario.agregarContenido(peli2);
		unUsuario.agregarContenido(peli3);
		
		// Mostrando el elemento reproducido
		unUsuario.reproducirContenido(peli1);
		
		System.out.println("------------------------------------------");
		System.out.println("Imprimiendo datos de usuario: ");
		// imprimiendo datos del usuario
		unUsuario.imprimir();
		System.out.println("------------------------------------------");
		// Eliminando pelicula de la lista de contenidos vistos
		unUsuario.quitarContenido(peli2);
		// Intentando eliminar una pelicula que no se encuentra la lista de contenidos vistos
		unUsuario.quitarContenido(peli2);
		System.out.println("------------------------------------------");
		System.out.println("Imprimiendo: ");
		// imprimiendo datos del usuario para ver si elimino correctamente peliculas de la lista de contenidos vistos
		unUsuario.imprimir();
		System.out.println("------------------------------------------");
		// Intentando agregar una pelicula existente en la lista de contenidos vistos
		unUsuario.agregarContenido(peli1);
		System.out.println("--------Intentando reproducir una pelicula inexitente--------");
		// Intentanto reproducir una pelicula que no se encuentra en la lista de contenidos vistos.
		unUsuario.reproducirContenido(peli2);

		System.out.println("----- desloguearse ----");
		unUsuario.desloguearse();
		
		System.out.println(" .................. TERMINO LA PRUEBA LA CLASE PERSONA ..............................");
		
		System.out.println("---------------------TEST OPERADOR ----------------------");
		Operador unOperador = new Operador("Sebastian", "Seba1991");
		unOperador.loguear(unOperador.getNombreDeUsuario(), unOperador.getContrasenia());
		unOperador.desloguearse();
		unOperador.imprimir();
		
		unOperador.ClasificacionDePelicula(peli2);
		
	}
	
	public static void TestServidor() {
		
		HashSet<Contenido> lista = new HashSet<>();
		Servidor unServidor = new Servidor(lista );
		Contenido p1 = new Contenido("Piratas del Caribe", 2010, Genero.COMEDIA, 1541, 9);
		Contenido p2 = new Contenido("Piratas del Caribe 3", 2017, Genero.COMEDIA, 1737, 7);
		Contenido p3 = new Contenido("Transformers", 2015, Genero.ACCION, 1269, 8);
		Contenido p4 = new Contenido("Terminator", 2010, Genero.ACCION, 1556, 7);
		Contenido p5 = new Contenido("Anabelle", 2020, Genero.TERROR, 1246, 9);
		Contenido p6 = new Contenido("El conjuro", 2017, Genero.TERROR, 1121, 9);
		Contenido p7 = new Contenido("Advengers", 2010, Genero.CIENCIA_FICCION, 1541, 9);
		Contenido p8 = new Contenido("Superman", 2010, Genero.CIENCIA_FICCION, 1541, 9);
		// Imprimiendo la lista vacia
		unServidor.imprimir();
		
		System.out.println("Metodo reproducir");
		p7.reproducir();
		
		// Agregando elementos
		try {
		unServidor.agregar(p1);
		unServidor.agregar(p2);
		unServidor.agregar(p3);
		unServidor.agregar(p4);
		unServidor.agregar(p5);
		unServidor.agregar(p6);
		unServidor.agregar(p7);
		unServidor.agregar(p8);
		//agrego pelicula repetida para probar mi excepcion personalizada.
		unServidor.agregar(p1);
		
		}catch(YaExisteContenidoException e) {
			
			System.out.println(e.getMessage());
		
		}
		
		
		
		try {
			// Agrego otra pelicula repetida
			unServidor.agregar(p6);
		}catch(YaExisteContenidoException e) {
			System.out.println(e.getMessage());
		}

		
		// Imprimiendo elementos
		unServidor.imprimir();

		
		// Probando la clase NoSePudoBorrarException 
		try {
			// Quitando elementos
			unServidor.quitar(p8);
			//borrando la misma pelicula para probar la excepcion.
			unServidor.quitar(p8);
		}catch(NoSePudoBorrarException e) {
			System.out.println(e.getMessage());
		}
		
		// Contando Elementos para comprobar que se borro la ultima pelicula
		System.out.println("Peliculas: "+ lista.size());


	}
	
}
