
package src;

import java.util.Scanner;

import src.vehiculos.*;

public class Principal {

    public static void main(String[] args) {

        Principal p = new Principal();
    }

    private Scanner scan = new Scanner(System.in);
    private Menu menu = new Menu();

    Vehiculo[] autos = { new Carga(), new Carga(), new Carga(), new Carga(), new Carga(), new Carga(), new Carrera(),
            new Carrera(), new Carrera(), new Carrera(), new Carrera(), new Carrera(), new Camioneta(), new Camioneta(),
            new Camioneta(), new Camioneta(), new Camioneta(), new Camioneta(), new Carga(), new Carrera() };

    public Principal() {

        iniciarMenu();

    }

    public void iniciarMenu() {

        boolean salir = false;
        do {
            System.out.println("\n\n  VEHICULOS");
            System.out.println("\n  MENU:");
            System.out.println("\n  1. Mostrar Autos");
            System.out.println("  2. Ver Autos por Tipo Especifico");
            System.out.println("  3. Salir");
            System.out.print("\n  Escriba el numero de la opcion: ");
            int opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {
                case 1:
                    menu.imprimirAutos(autos);
                    break;
                case 2:
                    menu.submenuTipoEspecifico(autos);
                    break;
                case 3:
                    System.out.println("\n    Presentacion de vehiculos finalizada\n");
                    salir = true;
                    break;
                default:
                    System.out.println("\n    Opcion incorrecta.\n");
                    break;
            }
        } while (!salir);

    }

}
