package src.vehiculos;

import src.interfaces.*;

public class Carrera extends Vehiculo implements MovimientoLados, Aceleracion {

    public Carrera() {
    }
 
    public Carrera(int cantGalones, int cantPasajeros, int velocidadMaxima, double aceleracion, boolean esGasolina) {
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
    public void acelerar() {
        System.out.println("\n  Mi aceleracion es el triple de la aceleracion base");
        
    }

    @Override
    public double getAceleracion() {
        return 3 * super.aceleracionBase;
    }
   
    
}
