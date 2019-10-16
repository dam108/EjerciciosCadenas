package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0510 {
    public static void main(String[] args) {
        String cadenaSalida = "", cadena;
        Scanner teclado = new Scanner(System.in);
    
        for (int i = 1; i <=10; i++){ // solicitar 10 cadenas

            System.out.println("Introduce una palabra o frase:" );
            cadena = teclado.nextLine();
            
            cadenaSalida = cadenaSalida + cadena.charAt(0); // contruir otra cadena con el primer caracter de cada cadena
            
        }
        System.out.println(cadenaSalida);
    }
}