package ejercicioscadenas;
import java.util.Scanner;
public class prueba {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        // retiramos la string cadena = teclado.nextLine(); por que no nos hace falta, ya grabamos la cadena directamente en la variable cadenaSB
        StringBuilder cadenaSB = new StringBuilder(teclado.nextLine());
        int pos;

        for (int i = 0; i < cadenaSB.length(); i++){
            pos = cadenaSB.indexOf(" ");
            if (pos !=-1) {
                cadenaSB.deleteCharAt(pos);
            }
        }

        System.out.println(cadenaSB);

    } // fin main
} // fin class