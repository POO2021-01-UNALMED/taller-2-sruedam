package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String NuevoColor) {
		if (NuevoColor.equals("amarillo") || NuevoColor.equals("negro") || NuevoColor.equals("rojo") ||
			NuevoColor.equals("verde") || NuevoColor.equals("blanco")) {
			this.color = NuevoColor;
		}
	}
}
