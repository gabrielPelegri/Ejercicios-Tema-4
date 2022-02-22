/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4ej2;


import java.util.Scanner;

/**
 *
 * @author Mehtz
 */
public class T4ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Nota?(-1 para terminar)");
        double salir = 0;

        double cantidad = 0;
        double nota = 0;
        while (true) {
            salir = teclado.nextDouble();
            if (salir == -1) {
                break;
            } else {
                nota += salir;
                cantidad += 1;
            }
        }
        double media = nota / cantidad;
        System.out.println(cantidad);
        System.out.println("La media es: " + media);
    }
}
