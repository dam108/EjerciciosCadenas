package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0508b {
    public static void main(String[] args) {
        
        // version StringBuilder 
        //  hacer que en la cadena introducida en la posicion que se indica se susbtituya el caracter que hay por la letra introducida 
        int pos;
        char letra;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");// solicitar una cadena
        StringBuilder cadena = new StringBuilder(teclado.nextLine()); //instanciamos el metodo string builder y le asignamos la cadana que acabamos de meter por teclado como valor
        
        System.out.println("Introduce posicion desde 0 hasta "+ (cadena.length()-1) +" : ");// solicitar una posicion
        pos = teclado.nextInt();
        
        while (cadena.charAt(pos) == ' '){
            System.out.println("has introducido la posiscion de un espacio prueba con otro posicion:");
            
            System.out.println("Introduce posicion desde 0 hasta "+ (cadena.length()-1) +" : ");// solicitar una posicion
            pos = teclado.nextInt();
        }

        System.out.println("Introduce una letra: ");// solicitar una letra
        letra = teclado.next().charAt(0);
        
        cadena.setCharAt(pos, letra); // utilizamos el metodo seCharAt para cambiar la letra de la posicion por la latra introducida
        
        System.out.println(cadena); // imprimimos
    }
}