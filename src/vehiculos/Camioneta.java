package src.vehiculos;

import src.interfaces.*;

public class Camioneta extends Vehiculo implements MovimientoLados, Transporte, Aceleracion {

    public Camioneta() {
    }

    public Camioneta(int cantGalones, int cantPasajeros, int velocidadMaxima, double aceleracion, boolean esGasolina) {
        super(cantGalones, cantPasajeros, velocidadMaxima, aceleracion, esGasolina);
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
