/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {
     public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int x; 
        int z;
        String cadenaf = "";
        String[] libros = {"El camino a un mejor programador",
            "Scrum & eXtreme Programming",
            "Lógica de programación",
            "Metodología programación orientada a objetos",
            "Java Como Programar",
            "Python 3 al descubierto"};

        String[] autores = {"Anónimo",
            "Eugenia Bahit",
            "Omar Iván Trejos Buriticá",
            "López Román Leobardo",
            "Dietel, P. y Dietel, H",
            "Fernández Arturo"};

        int[] clave1 = {2, 1, 0, 2, 0, 1};

        int[] clave2 = {1, 1, 1, 2, 2, 0};

        int[][] identificativoLibro = {
            {8761, 12334, 34567},
            {65431, 43211, 7890},
            {123890, 12344, 2345}};
        System.out.printf("Libros a prestar:\n"
                + "\n"
                + "El camino a un mejor programador opción 0\n"
                + "Scrum & eXtreme Programming  opción 1\n"
                + "Lógica de programación opción 2\n"
                + "Metodología programación orientada a objetos opción 3\n"
                + "Java Como Programar opción 4 \n"
                + "Python 3 al descubierto opción 5\n");

        x = e.nextInt();
        if (x >= 0 && x <= 5) {
            System.out.println("Seleccione el identificaivo(entre 0 - 2): ");
            z = e.nextInt();
            if (z >= 0 && z <= 2) {
                cadenaf = String.format("Se le presenta el libro %s, cuyo autor"
                        + " es %s y tiene un identificativo de %d", libros[x], 
                        autores[x], identificativoLibro[z][z]);
            } else {
                System.out.println("Error: valor fuera de rango");
            }
        } else {
            System.out.println("Error: valor fuera de rango");
        }
        EscribirArchivo.mensajef(cadenaf);
    }

}
    

