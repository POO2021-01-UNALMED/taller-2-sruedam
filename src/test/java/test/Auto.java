package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos = new Asiento[50];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int numAsientos = 0;
		for (int cont = 0; cont < this.asientos.length; cont++ ) {
			if (this.asientos[cont] != null) {
				numAsientos++;
			}
		}
		return numAsientos;
	}
	
	String verificarIntegridad() {
		
		boolean esOriginal = true;
		
		if (this.registro != this.motor.registro) {
			esOriginal = false;
		}
		
		else {
			for (int cont = 0; cont < this.asientos.length && esOriginal; cont++ ) {
				if (asientos[cont] != null) {
					if (this.registro != this.asientos[cont].registro) {
						esOriginal = false;
					}
				}
			}
		}
		if (esOriginal) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}
