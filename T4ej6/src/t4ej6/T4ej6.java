/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4ej6;

import java.util.Scanner;

/**
 *
 * @author Mehtz
 */
public class T4ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numIntento = 0;
        String valorIntroducido = "";
        int MAX_INTENTOS = 5;
        

        while (true) {
            System.out.println("¿Cuál es la capital de Francia?");
            valorIntroducido = teclado.next();
            if (valorIntroducido.equals("Paris")) {
                System.out.println("Bravo");
                break;
            } else {
                System.out.println("Respuesta incorrecta");
                numIntento++;
                System.out.println("Quedan " + (MAX_INTENTOS - numIntento) + " intentos");
                if (numIntento == MAX_INTENTOS) {
                    System.out.println("Revise sus conocimientos en geografía");
                    break;
                }
            }
        }

    }

}
