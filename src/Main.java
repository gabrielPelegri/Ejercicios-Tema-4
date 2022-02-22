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
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        char tecla = teclado.next().charAt(0);
        int minimo = 0;
        int maximo = 100;
        
        while(tecla != '=') {
        	
        	int_random = rand.nextInt(minimo, maximo);
        	System.out.println("Pruebo con" +int_random+", ¿es mayor, menor o es el número (+/-/=)?");
        	
            while (true) {
                try {
                    tecla = teclado.next().charAt(0);
                    break;
                } catch (InputMismatchException e) {
                	System.out.println("Vuelva a intentar:");
                    teclado.next();
                }
            }
        	
        	
        	if(tecla == '+') {
        		minimo = int_random +1;
        	}
        	else if(tecla == '-') {
        		maximo = int_random -1;
        	}
        	else if(tecla != '='){
        		System.out.println("Vuelva a intentar:");
        	}
        }
        teclado.close();
        System.out.println("Bravo, lo he encontrado!");
        


    }
}
