/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4ej11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mehtz
 */
public class T4ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anchura = 0;
        String caracter;

        System.out.println("¿Tamaño?");
        try {
            anchura = teclado.nextInt();
        } catch (InputMismatchException e) {
            teclado.next();
        }

        System.out.println("¿Carácter?");
        caracter = teclado.next();

        int eleccion = 0;
        while (true) {
            System.out.println("¿Qué forma quieres?");
            System.out.println("1: Rectángulo relleno");
            System.out.println("2: Rectángulo hueco");
            System.out.println("3: Cruz de San Andrés");
            System.out.println("4: Triángulo rectángulo");
            System.out.println("5: Rombo");
            int contador;
            try {
                eleccion = teclado.nextInt();
            } catch (InputMismatchException e) {
                teclado.next();
            }
            switch (eleccion) {
                case 1:
                    System.out.println();
                    contador = 0;
                    while (contador < anchura) {
                        for (int i = 0; i < anchura; i++) {
                            System.out.print(caracter);
                        }
                        System.out.println();
                        contador++;
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    for (int j = 1; j <= anchura; j++) {
                        for (int i = 1; i <= anchura; i++) {
                            if (j == 1 || j == anchura || i == 1 || i == anchura) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    for (int i = 0; i < anchura; i++) {
                        for (int j = 0; j < anchura; j++) {
                            if (i == j || anchura == (i + j + 1)) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    for (int i = 1; i <= anchura; i++) {
                        for (int j = 1; j <= i; j++) {

                            if (j == 1 || j == i || i == anchura) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    for (int j = 1; j <= anchura; j++) {

                        for (int i = anchura; i >= j; i--) { 

                            System.out.print(" ");

                        }

                        for (int k = 1; k <= j; k++) {
                            if (k == 1 || k == j) {
                                System.out.print(caracter);
                            } else {
                                System.out.print("  ");
                            }
                        }

                        System.out.println();
                    }
                    for (int j = 1; j <= anchura; j++) {

                        for (int i = 1; i <= j; i++) {

                            System.out.print(" ");

                        }

                        for (int k = anchura; k >= j; k--) { 
                            if (k == anchura || k == j) {
                                System.out.print(caracter);
                            } else {
                                System.out.print("  ");
                            }
                        }

                        System.out.println();

                    }
            }

        }
    }

}
