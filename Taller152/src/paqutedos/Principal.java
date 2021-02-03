/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqutedos;

//import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Principal {
     public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        e.useLocale(Locale.US);
        boolean bandera = true;
        String equipo;
        String estadio;
        String negacion;
        String mensaje = "";
        char x;
        double presupuesto;
        while (bandera) {

            System.out.println("Ingrese el nombre del equipo: ");
            equipo = e.nextLine();
            System.out.println("Ingrese el presupuesto anual del equipo: ");
            presupuesto = e.nextDouble();
            e.nextLine();
            System.out.println("Ingrese el estadio donde juega el equipo: ");
            estadio = e.nextLine();
            mensaje = String.format("%s%s, presupuesto %.2f, estadio %s\n", mensaje,
                    equipo, presupuesto, estadio);
            System.out.println("¿Desea ingresar otro equipo (n) no?");
            negacion = e.nextLine();
            negacion = negacion.toLowerCase();
            x = negacion.charAt(0);
            if (x == 'n') {
                bandera = false;
            }
        }
        EscribirArchivo.ejercicios(mensaje);
    }
}
