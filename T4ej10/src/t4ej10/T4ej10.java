/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4ej10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mehtz
 */
public class T4ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anchura = 0;
        String caracter;
        int altura=0;
        System.out.println("¿Anchura?");
        try {
            anchura = teclado.nextInt();
        } catch (InputMismatchException e) {
            teclado.next();
        }
        System.out.println("¿Altura?");
        try{
            altura=teclado.nextInt();
        }catch(InputMismatchException e){
            teclado.next();
        }
        System.out.println("¿Carácter?");
        caracter = teclado.next();
      int contador=0;
      while(contador<altura){
        for(int i=0;i<anchura;i++){
            System.out.print(caracter);
        }
          System.out.println();
      contador++;
      }
      

    }

}
