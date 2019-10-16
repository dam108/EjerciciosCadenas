package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0502 {
    public static void main(String[] args) {
        String letrasNif = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni, resultado;
        char letra;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero del DNI: ");
        dni = teclado.nextInt();
        
        resultado = dni % 23;
        
        letra = letrasNif.charAt(resultado);
        
        System.out.println(letra);
    }
}