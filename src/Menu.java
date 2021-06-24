package src;

import java.util.Scanner;

import src.vehiculos.*;

public class Menu {

    private Scanner scan = new Scanner(System.in);

    public void submenuTipoEspecifico(Vehiculo[] autos) {

        System.out.println("\n  Elija el tipo de vehiculos que desea ver: ");
        System.out.println("    1. Camioneta");
        System.out.println("    2. Vehiculo de Carga");
        System.out.println("    3. Auto de Carrera");
        System.out.print("\n  Escriba el numero de la opcion: ");
        int opcion = Integer.parseInt(scan.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("\n\n   - CAMIONETAS -");
                imprimirTipoEspecifico(autos, 1);
                break;
            case 2:
                System.out.println("\n\n   - VEHICULOS DE CARGA -");
                imprimirTipoEspecifico(autos, 2);
                break;
            case 3:
                System.out.println("\n\n   - AUTOS DE CARRERAS -");
                imprimirTipoEspecifico(autos, 3);
                break;
            default:
                System.out.println("\n\n  Opcion incorrecta\n");
                break;
        }
        System.out.println();
    }

    public void imprimirTipoEspecifico(Vehiculo[] autos, int tipo) {

        for (int i = 0; i < autos.length; i++) {

            if (tipo == 1 && autos[i] instanceof Camioneta) {
                System.out.print("\n\n  Vehiculo No. " + (i + 1));
                System.out.println(autos[i].toString());

            } else if (tipo == 2 && autos[i] instanceof Carga) {
                System.out.print("\n\n  Vehiculo No. " + (i + 1));
                System.out.println(autos[i].toString());

            } else if (tipo == 3 && autos[i] instanceof Carrera) {
                System.out.print("\n\n  Vehiculo No. " + (i + 1));
                System.out.println(autos[i].toString());
            }
        }

    }

    public String tipoInstancia(Vehiculo auto) {

        if (auto instanceof Camioneta) {
            return "CAMIONETA";
        } else if (auto instanceof Carga) {
            return "Vehiculo de CARGA";
        } else {
            return "Auto de CARRERAS";
        }

    }


    public void imprimirAutos(Vehiculo[] autos) {

        for (int i = 0; i < autos.length; i++) {
            System.out.print("\n\n  Vehiculo No. " + (i + 1) + " - Tipo: " + tipoInstancia(autos[i]));
            System.out.println(autos[i].toString());

        }
    }

}
