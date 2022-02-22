import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Random rand = new Random();
    	int int_random = rand.nextInt(101); // el numero aleatorio
    	
        Scanner teclado = new Scanner(System.in);
        System.out.println("I¿En qué número entre 1 y 100 estoy pensando?");
        int cantidad = -1;
        
        
        while(cantidad != int_random) {
        	
        	//int cantidad = teclado.nextInt();
            while (true) {
                try {
                    cantidad = teclado.nextInt();
                    break;
                } catch (InputMismatchException e) {
                	System.out.println("Eso no es un numero, vuelva a intentar:");
                    teclado.next();
                }
            }
        	
        	
        	if(cantidad < int_random) {
        		System.out.println("Mayor");
        	}
        	if(cantidad > int_random) {
        		System.out.println("Menor");
        	}
        }
        teclado.close();
        System.out.println("Bravo, lo ha encontrado");
        


    }
}
