package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0507 {
    public static void main(String[] args) {
        int pos, num;
        char letra = ' ';
        String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String mezclaletras = "CEHKMOÑTUWZYAIBDFJLNPSQGRVX";
        
        Scanner teclado = new Scanner(System.in);
        // leer una cadena.
        System.out.println("Introduce una frase mezcla mayusculas con minusculas");
        StringBuilder cadena = new StringBuilder(teclado.nextLine());
        
        // cambiar las letras por otras letras
         for ( int i = 0 ; i < cadena.length(); i++){ // recorrer la cadena letra a letra
             //System.out.println(cadena.charAt(i));
             pos = mayusculas.indexOf(cadena.charAt(i));// comprobar si es mayuscula 
                         
             if (pos != -1){ // si es mayuscula cambiarla por otra letra
                 num = pos;
                 letra = mezclaletras.charAt(num);
                // System.out.println("caracter despues de cambiar "+ letra);
                cadena.setCharAt(i, letra);
             }
         }// fin de for
         System.out.println(cadena);
    }
}