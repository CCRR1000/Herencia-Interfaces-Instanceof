
package src;

import java.util.Scanner;

import src.vehiculos.*;

public class Principal {

    public static void main(String[] args) {

        Principal p = new Principal();
    }

    private Scanner scan = new Scanner(System.in);

    Vehiculo[] autos = { new Carga(), new Carga(), new Carga(), new Carga(), new Carga(), new Carga(), new Carrera(),
            new Carrera(), new Carrera(), new Carrera(), new Carrera(), new Carrera(), new Camioneta(), new Camioneta(),
            new Camioneta(), new Camioneta(), new Camioneta(), new Camioneta(), new Carga(), new Carrera() };

    public Principal() {

        imprimirAutos(autos);

    }

    public void iniciarMenu() {

        System.out.println("\n\n  VEHICULOS");
        System.out.println("\n  MENU:");
        System.out.println("\n  1. Mostrar Autos");
        System.out.println("  2. Mover Autos");
        System.out.println("  3. Ver Autos por Categoria Especifica");
        int opcion = Integer.parseInt(scan.nextLine());

        switch (opcion) {
            case 1:
                imprimirAutos(autos);
                break;
            case 2:
                // moverAutos(autos);
                break;
            case 3:
                // ver por categoria Autos(autos);
                break;
            case 4:
                System.out.println("\n  Presentacion finalizada");
                break;
            default:
                System.out.println("\n  Opcion incorrecta.");
                break;
        }

    }

    public String tipoInstancia(Vehiculo auto) {

        if (auto instanceof Camioneta) {
            return "es una CAMIONETA";
        } else if (auto instanceof Carga) {
            return "es un vehiculo de CARGA";
        } else {
            return "es un auto de CARRERAS";
        }

    }

    public void imprimirAutos(Vehiculo[] autos) {

        for (int i = 0; i < autos.length; i++) {
            System.out.print("\n  Auto " + (i + 1) + " - " + tipoInstancia(autos[i]));
            System.out.println(autos[i].toString());

        }
    }

}
