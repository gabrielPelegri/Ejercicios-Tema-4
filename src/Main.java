

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	int numero = 1;
    	
    	
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un multiplo de 3:");
        do {
        	numero= teclado.nextInt();
        	if(numero%3!=0) {
        		System.out.println("Error "+numero+" no es un multiplo de 3");
        	}
        	
        }while(numero%3!=0);
        	
        teclado.close();
        System.out.println("Ok: "+numero+" es un multiplo de 3");
        


    }
}
