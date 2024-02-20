package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	 public int cantidadAsientos() {
		int cantidad_asientos=0;
		for (Asiento asiento: asientos) {
			if (asiento!= null) {
				cantidad_asientos++;
			}
		}
		return cantidad_asientos;
	}
	 public String verificarIntegridad() {
	        if (registro == motor.registro) {
	            for (Asiento asiento : asientos) {
	                if (asiento != null && asiento.registro!=registro) {
	                    return "Las piezas no son originales";
	                }
	            }
	            return "Auto original";
	        } else {
	            return "Auto original";
	        }
	    }
	}