package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int NuevoRegistro) {
		this.registro = NuevoRegistro;
	}
	
	void asignarTipo(String NuevoTipo) {
		if (NuevoTipo.equals("electrico") || NuevoTipo.equals("gasolina")) {
			this.tipo = NuevoTipo;
		}
	}
}
