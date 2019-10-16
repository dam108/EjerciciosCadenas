package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0508 {
    public static void main(String[] args) {
             // version String 
             // hacer que en la cadena introducida en la posicion que se indica se susbtituya el caracter que hay por la letra introducida 
             
        String cadena;
        int pos;
        char letra;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");// solicitar una cadena
        cadena = teclado.nextLine();
        
        System.out.println("Introduce posicion desde 0 hasta "+ (cadena.length()-1) +" : ");// solicitar una posicion
        pos = teclado.nextInt();
        
        while (cadena.charAt(pos) == ' '){
            System.out.println("has introducido la posiscion de un espacio prueba con otro posicion:");
            
            System.out.println("Introduce posicion desde 0 hasta "+ (cadena.length()-1) +" : ");// solicitar una posicion
            pos = teclado.nextInt();
        }

        System.out.println("Introduce una letra: ");// solicitar una letra
        letra = teclado.next().charAt(0);

        if (pos != 0 && pos != cadena.length() - 1){ // si la posicion es diferente a la primera letra o a la ultima entonces
           cadena = cadena.substring(0, pos) + letra + cadena.substring(pos + 1, cadena.length()); // concatena la el primer substring + la letra + el segundo substring
            System.out.println(cadena);  // imprime la frase
        }
        else {
            if (pos == 0 ){ // si la posicion es la de la primera letra
                cadena = letra + cadena.substring(pos + 1, cadena.length()); // concatena la nueva letra con el substring que contiene el resto de la frase
                System.out.println(cadena); 
            }
            else { // si la posicion es la ultima letra de la frase
                cadena = cadena.substring(0, cadena.length()-1) + letra; // concatena la frase menos la ultima letra + la nueva letra
                System.out.println(cadena); 
            }
        }
    }
}