package src.vehiculos;

import src.interfaces.*;

public class Carrera extends Vehiculo implements MovimientoLados, Aceleracion {

    public Carrera() {
        super.cantPasajeros=1;
        super.esGasolina=true;
    }
 
    public Carrera(int cantGalones, int velocidadMaxima, double aceleracion) {
        super(cantGalones, 1, velocidadMaxima, aceleracion, true);
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
    public String acelerar() {
        return ("\n      - Tiene turbo y puede triplicar la aceleracion base");
        
    }

    @Override
    public double getAceleracionBase() {
        return 3 * super.aceleracionBase;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\n    * Descripcion: " + acelerar();
        
    }
   
    
}
