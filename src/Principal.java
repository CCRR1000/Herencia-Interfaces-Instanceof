
package src;

import src.vehiculos.*;

public class Principal {
    public static void main(String[] args) {

        Principal p = new Principal();
    }

    public Principal() {

        Vehiculo[] autos = {new Carga(), new Carga(), new Carga(),new Carga(),
            new Carga(), new Carga(), new Carrera(), new Carrera(), 
            new Carrera(),  new Carrera(),  new Carrera(),  new Carrera(),
            new Camioneta(), new Camioneta(), new Camioneta(), new Camioneta(),
            new Camioneta(), new Camioneta(), new Carga(), new Carrera()};

        imprimirAutos(autos);

    }

    public void iniciarMenu() {

        System.out.println("\n\n  VEHICULOS");
        System.out.println("\n  MENU:");
        System.out.println("\n  1. Mostrar Autos");
        System.out.println(  "  2. Utilidades Autos");

    }

    public String tipoInstancia(Vehiculo auto) {

        if (auto instanceof Camioneta) {
            return " es una camioneta";
        } else if (auto instanceof Carga) {
            return " es un vehiculo de carga";
        } else {
            return " es un auto de carreras";
        }

    }

    public void imprimirAutos(Vehiculo[] autos) {

        for (int i = 0; i < autos.length; i++) {
            System.out.print("\n  El auto " + (i+1) + tipoInstancia(autos[i]));
            System.out.println(autos[i].toString());
            
        }
    }

}
