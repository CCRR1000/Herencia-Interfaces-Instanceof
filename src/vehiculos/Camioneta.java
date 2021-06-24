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
        System.out.println("\n  Voy hacia la derecha");
        
    }

    @Override
    public void irHaciaIzquierda() {
        System.out.println("\n  Voy hacia la izquierda");
        
    }

    @Override
    public void transportacion() {
        System.out.println("\n  Transporto personas");
        
    }

    @Override
    public void acelerar() {
        System.out.println("\n  Mi aceleracion normal");
        
    }


}
