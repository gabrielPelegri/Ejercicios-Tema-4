/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mehtz
 */
public class T4ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de notas");
        int cantidad = 0;
        while (true) {
            try {
                cantidad = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                teclado.next();
            }
        }
        System.out.println("Introduce tus notas");
        double notas = 0;
        for (int i = 0; i < cantidad; i++) {
            while (true) {

                try {
                    notas += teclado.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    teclado.next();
                }
            }

        }
        double media = notas / cantidad;
        System.out.println("Tu media es: " + media);

    }
}
