/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4ej8;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class T4ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r=new Random();
        int frase;
         String starWars[]=new String[3];
        String ciudad[]=new String[3];
        String jamesBond[]=new String[3];
        String vida[]=new String[3];
        vida[0]="\nFrase vida 1";
        vida[1]="\nFrase vida 2";
        vida[2]="\nFrase vida 3";
        starWars[0]="\nLuke, yo soy tu padre";
        starWars[1]="\nNo me gusta la arena";
        starWars[2]="\n!Poder ilimitado!";
        jamesBond[0]="\nMi nombre es Bond... James Bond";
        jamesBond[1]="\nPonga las dos manos en el volante, soy un pasajero muy nervioso";
        jamesBond[2]="\nUn martini con hielo, mezclado, no agitado";
        Scanner teclado = new Scanner(System.in);
        ciudad[0]="\nRech.proj.pr.proj.priv.self-def.dem.brut.poss.S'adr.à.hôt.Mart";
        ciudad[1]="\nFrase de La ciudad del miedo nª2";
        ciudad[2]="\nFrase de La ciudad del miedo nª3";
        int eleccion = 0;
        while (true) {
            frase=r.nextInt(3);
            
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
                case 1:System.out.println(ciudad[frase]);
                    break;
                case 2:
                    System.out.println(jamesBond[frase]);
                    break;
                case 3: System.out.println(vida[frase]);
                    break;
                case 4:
                    System.out.println(starWars[frase]);
                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

}
    
    

