package ejercicios;
import java.util.Scanner;
public class Ejercicio0501b {
    public static void main(String[] args) {
        int contador = 0;
        String cadena;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Intoduce una frase: ");
        cadena = teclado.nextLine();
        
        for (int i=0; i < cadena.length(); i++){ //hacemos un bucle que empiece en 0 mientras la cadena tenga letras
            char letra = cadena.charAt(i); //cada posicion del bucle se combierte a caracter 
            if (Character.isDigit(letra)) contador++; // si el caracter es numero incrementa el contador
        }
        
        System.out.println("La frase tiene "+contador+" numeros.");
    }
    
}