package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0512 {
    public static void main(String[] args) {
        String cadena;
        char caracter;
        int longitud, pos;
        String digitos = "0123456789";
        boolean allDigitos = false;
        boolean noRepetirse = true;
        
        Scanner teclado = new Scanner(System.in);
        
        // pedir por una cadena de 6 posiciones, que todos sean digitos y sin repetirse
        do {
            System.out.println("Introduce una frase que tenga 6 posiciones de largo, todos sean digitos y no se repita ninguno numero.");
            cadena = teclado.nextLine();
            
            longitud = cadena.length();
            
            System.out.println(longitud);
            
            for (int i = 0 ; i < longitud ; i++){
                // comprobamos si son todo digitos y si no cortamos y que pida la cadena denuevo
                Character.isDigit(cadena.charAt(i));
                if (Character.isDigit( cadena.charAt(i))){
                    allDigitos = true;
                    System.out.println(Character.isDigit( cadena.charAt(i)));
                } else {
                    allDigitos = false;
                    System.out.println(Character.isDigit( cadena.charAt(i)));
                    break; // lo siento tenia que usarlo
                }
                // comprobamos que no se repiten no me sale esta parte
               /* for (int j = 0 ; j <= i; j++){
                    pos = cadena.charAt(i);
                    System.out.println("j"+j);
                    if (pos != -1){
                        System.out.println("se repite un numero");
                        break;
                    }
                }*/
                
            }// fin for
        } while (longitud != 6 || !allDigitos /*|| !noRepetirse*/); // ejecutar bucle mientras la longitud sea diferente de 6 o mientras que todos los caracteres no sean digitos o mientras que se repita algun numero.
        System.out.println("Has introducido los numeros correctamente!");
    }
}