package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0501a {
    public static void main(String[] args) {
        String cadena, mayusculas, minusculas;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Intoduce una frase: ");
        cadena = teclado.nextLine();
    
        mayusculas = cadena.toUpperCase();
        minusculas = cadena.toLowerCase();
        
        System.out.println(mayusculas);
        System.out.println(minusculas);
    }
    
}