package ejercicios;
import java.util.Scanner;
public class Ejercicio0501e {
    public static void main(String[] args) {
        String cadena;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Intoduce una frase con un numero hexadecimal: ");
        cadena = teclado.nextLine();
        
        int numeroEntero = Integer.parseInt(cadena, 16); // parseamos la frase a numero indicando 16 para hexadecimal
        System.out.println("Tu frase hexadecimal ahora es un numero entero : "+numeroEntero);
    }
}