package ejercicios;
import java.util.Scanner;
public class Ejercicio0501f {
    public static void main(String[] args) {
        String cadena;
        char primeraLetra, ultimaLetra;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        cadena = teclado.nextLine();
        
        primeraLetra = cadena.charAt(0); // guardamos el primer caracter
        ultimaLetra = cadena.charAt(cadena.length()-1); // guardamos el ultimo caracter
        
        // utilizamos subString para sacar la parte del medio de la frase
        String nuevaCadena = ultimaLetra + cadena.substring(1,cadena.length()-1) + primeraLetra; // creamos una nueva cadena con 
                                                                        // ultimo caracter + parte del medio + primer caracter
        
        System.out.println("La primera y la ultima letra estan cambiadas: "+nuevaCadena);
        
    }
}