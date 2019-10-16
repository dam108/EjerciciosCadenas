package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0512 {
    public static void main(String[] args) {
        String cadena;
        int longitud, pos;
        String digitos = "0123456789";
        boolean allDigitos = false;
        boolean noRepetirse = false;
        
        Scanner teclado = new Scanner(System.in);
        
        // pedir por una cadena de 6 posiciones, que todos sean digitos y sin repetirse
        do {
            System.out.println("Introduce una frase que tenga 6 posiciones de largo, todos sean digitos y no se repita ninguno numero.");
            cadena = teclado.nextLine();
            
            longitud = cadena.length();
            
            System.out.println(longitud);
            
            for (int i = 0 ; i < longitud ; i++){
                Character.isDigit( cadena.charAt(i));
                if (Character.isDigit( cadena.charAt(i))){
                    allDigitos = true;
                    System.out.println(Character.isDigit( cadena.charAt(i)));
                } else {
                    allDigitos = false;
                    System.out.println(Character.isDigit( cadena.charAt(i)));
                }
            }

            
        } while (/*longitud != 6 && */allDigitos != true /* && noRepetirse != false*/); // ejecutar bucle mientras la longitud sea diferente de 6 y mientras que todos los caracteres no sean digitos y mientras que se repita algun numero.

    }
}