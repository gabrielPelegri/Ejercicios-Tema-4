/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class T4ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        while (true) {
            System.out.println("\n");
            System.out.println("1: La Ciudad del Miedo");
            System.out.println("2: James Bond");
            System.out.println("3: La Vida es un Largo Río Tranquilo");
            System.out.println("4: Star Wars");
            System.out.println("5: Salir de esta magnífica aplicación");
            try {
                eleccion = teclado.nextInt();
            } catch (InputMismatchException e) {
                teclado.next();
            }
            switch (eleccion) {
                case 1:
                    System.out.println("Rech.proj.pr.proj.priv.self-def.dem.brut.poss.S'adr.à.hôt.Mart");
                    break;
                case 2:
                    System.out.println("Mi nombre es Bond.... James Bond");
                    break;
                case 3:
                    System.out.println("Frase de La Vida es un Largo Río Tranquilo");
                    break;
                case 4:
                    System.out.println("Luke, yo soy tu padre");
                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

}
