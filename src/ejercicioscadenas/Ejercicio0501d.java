package ejercicios;
import java.util.Scanner;
public class Ejercicio0501d {
    public static void main(String[] args) {
        String cadena;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Intoduce una frase solo con numeros: ");
        cadena = teclado.nextLine();
        
        int numeroEntero = Integer.parseInt(cadena); // parseamos la frase a numero
        System.out.println("Tu frase con numeros ahora son numeros enteros: "+numeroEntero);
    }
}