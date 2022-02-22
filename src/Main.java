import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

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
