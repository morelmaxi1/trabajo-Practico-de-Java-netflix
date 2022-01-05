package edu.unlz.core;

public class Operador extends Usuario{
	

	public Operador(String nombreDeUsuario, String contrasenia) {
		super(nombreDeUsuario, contrasenia);
	}

	@Override
	public void imprimir() {
		if(getNombreDeUsuario() != null && getContrasenia() != null) {
			System.out.println("Administrador: " + getNombreDeUsuario() +"\nContraseña: "+ getContrasenia());			
		}else {
			System.err.println("Los datos ingresados son erroneos!");
		}
	}

	@Override
	public void loguear(String nombre, String contrasenia) {
		
		if(nombre == null || contrasenia == null) {
			System.out.println("Datos Incorrectos");
		}else {
			System.out.println("Login exitoso, bienvenido administrador "+ nombre +" !!");
		}
	}

	@Override
	public void desloguearse() {
		System.out.println("Usted a salido correctamente del perfil de administrador.");
	}
	
	public void ClasificacionDePelicula(Contenido contenido) {	
		
		if(contenido.getValoracion() > 7) {
			System.out.println("la pelicula" + " "+contenido.getNombre() +" "+ "se clasifica como buena.");
		}else {
			System.out.println("la pelicula se clasifica como mala.");
		}
	}
}
