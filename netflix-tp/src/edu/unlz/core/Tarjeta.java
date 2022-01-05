package edu.unlz.core;

public class Tarjeta extends MedioDePago{
	double total;

	public Tarjeta(String nombre,double total) {
		super(nombre);
		this.total = total;
	}

	@Override
	public void pagar() {
		if(getNombre() != null && this.total != 0) {
			System.out.println("Pago Realizado.");			
		}else {
			System.out.println("No se puede realizar el pago.");
		}
	}

	@Override
	public void imprimir() {
		if (getNombre() != null && this.total != 0) {
			System.out.println("Medio de pago: " + getNombre() + ", Total : $" + total);
		} else {
			System.out.println("Hay algun dato erroneo.\n");
		}
	}

}
