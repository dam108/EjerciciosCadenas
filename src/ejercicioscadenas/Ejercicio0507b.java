package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0507b {
    public static void main(String[] args) {
        int posMayu, posMinu;
        String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnñopqrstuvwxyz";
        String mezclaletrasMayu = "CEHKMOÑTUWZYAIBDFJLNPSQGRVX";
        String mezclaletrasMinu = "cehkmoñtuwzyaibdfjlnpsqgrvx";
        
        Scanner teclado = new Scanner(System.in);
        
        //pedir una cadena
        System.out.println("Introduce una frase con mayusculas y minusculas: ");
        StringBuilder cadena = new StringBuilder(teclado.nextLine());

        // cambiar las letras por otras letras
        for ( int i = 0 ; i < cadena.length(); i++){ // recorrer la cadena letra a letra
             //System.out.println(cadena.charAt(i));
             
             // parte para cambiar mayusculas
            posMayu = mayusculas.indexOf(cadena.charAt(i));// comprobar si es mayuscula 
            
            if (posMayu != -1){ // si es mayuscula cambiarla por otra letra
                int num = posMayu;
                char letra = mezclaletrasMayu.charAt(num);
                // System.out.println("caracter despues de cambiar "+ letra);
                cadena.setCharAt(i, letra);
            }
             
             // parte para cambiar minusculas
             
            posMinu = minusculas.indexOf(cadena.charAt(i));// comprobar si es mayuscula 
            
            if (posMinu != -1){ // si es mayuscula cambiarla por otra letra
                int num = posMinu;
                char letra = mezclaletrasMinu.charAt(num);
                // System.out.println("caracter despues de cambiar "+ letra);
                cadena.setCharAt(i, letra);
            }
        }
        System.out.println(cadena);
    }
    
}
