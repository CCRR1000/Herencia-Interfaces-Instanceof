package src.vehiculos;

import src.interfaces.*;

public class Camioneta extends Vehiculo implements MovimientoLados, Transporte, Aceleracion {

    public Camioneta() {
        super.cantPasajeros=40;
        super.esGasolina=false;
    }

    public Camioneta(int cantGalones, int velocidadMaxima, double aceleracion) {
        super(cantGalones, 40, velocidadMaxima, aceleracion, false);
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
        return "\n      - Permite transportar personas";
        
    }

    @Override
    public String acelerar() {
        return "\n      - Su aceleracion es normal";
        
    }

    @Override
    public String toString() {
        return super.toString() + "\n\n    * Descripcion: " + transportacion() + acelerar();
        
    }


}
