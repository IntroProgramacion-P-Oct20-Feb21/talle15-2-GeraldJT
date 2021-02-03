/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqutedos;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EscribirArchivo {
    public static void ejercicio() throws FileNotFoundException {
        
        Formatter mensaje = null;
        
            mensaje = new Formatter("data/archivo2.txt");
            Scanner entrada = new Scanner(System.in);
            boolean bandera = true;
            while (bandera = true){
                String ruta = "/data/archivo2.txt";
                String nombre;
                double presupuesto;
                String estado;
                entrada.nextLine();
                System.out.println("Ingrese el nombre del jugador a contratar");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el presupuesto planteado");
                presupuesto = entrada.nextDouble();
                entrada.nextLine();
                System.out.println("Ingrese el nombre del estado");
                estado = entrada.nextLine();
                mensaje.format("%s, presupuesto %.2f, estado %s", nombre,
                     presupuesto, estado);
                System.out.println("Escribe si para salir del ciclo");
                String salida = entrada.nextLine();
                if (salida.equals("si")){
                    bandera = true;
                
                }
            
            }
            mensaje.close();
       }
    
}
