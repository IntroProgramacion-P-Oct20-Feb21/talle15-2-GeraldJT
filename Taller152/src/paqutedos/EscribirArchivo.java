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
   public static void ejercicios(String datos) {
        try {
            Formatter out = new Formatter("data/Problema02");
            out.format("%s\n", datos);
            out.close();
        } catch (Exception e) {
            System.err.println("Error al crear el archivo");
            System.exit(1);
        }
    }

}
