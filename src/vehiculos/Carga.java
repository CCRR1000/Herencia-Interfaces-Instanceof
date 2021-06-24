package src.vehiculos;

import src.interfaces.*;

public class Carga extends Vehiculo implements MovimientoLados, Transporte, Aceleracion {

    public Carga() {
        super.cantPasajeros=2;
        super.esGasolina=false;
    }
    
    public Carga(int cantGalones, int velocidadMaxima, double aceleracion) {
        super(cantGalones, 2, velocidadMaxima, aceleracion, false);
    }

    @Override
    public void irHaciaDerecha() {
        System.out.println("\n    El vehiculo giro hacia la derecha");
        
    }

    @Override
    public void irHaciaIzquierda() {
        System.out.println("\n    El vehiculo giro hacia la izquierda");
        
    }

    @Override
    public String transportacion() {
        return ("\n      - Permite transportar materiales");
        
    }

    @Override
    public String acelerar() {
        return ("\n      - Su aceleracion es baja");
        
    }

    @Override
    public String toString() {
        return super.toString() + "\n\n    * Descripcion: " + transportacion() + acelerar();
        
    }
}
