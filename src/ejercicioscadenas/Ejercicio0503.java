package ejercicios;
import java.util.Scanner;
public class Ejercicio0503 {
    public static void main(String[] args) {
        String cadena;
        char caracter;
        int contador = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una frase o palabra: ");
        cadena = teclado.nextLine();
        System.out.println("Introduce una letra: ");
        caracter = teclado.next().charAt(0);
        
        for ( int i=0; i < cadena.length(); i++){
            char letrasCadena = cadena.charAt(i);
            
            if (caracter == letrasCadena ) contador++;
        }
        
        System.out.println("La frase "+cadena+" contiene "+contador+" letras iguales que la letra introducida. ");
    }
}
