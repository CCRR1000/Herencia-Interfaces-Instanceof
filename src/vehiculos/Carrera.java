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
        System.out.println("\n  El vehiculo giro hacia la derecha");
        
    }

    @Override
    public void irHaciaIzquierda() {
        System.out.println("\n  El vehiculo giro hacia la izquierda");
        
    }

    @Override
    public String acelerar() {
        return ("\n  Tiene turbo y puede triplicar la aceleracion base");
        
    }

    @Override
    public double getAceleracion() {
        return 3 * super.aceleracionBase;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Descripcion: " + acelerar();
        
    }
   
    
}
