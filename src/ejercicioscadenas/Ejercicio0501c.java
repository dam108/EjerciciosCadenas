package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0501c {
    public static void main(String[] args) {
        String cadena;
        boolean palindromo = true;
        char letra, letra2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Intoduce una frase: ");
        cadena = teclado.nextLine();
      
        for (int i = 0 ; i < cadena.length(); i++){ // recorremos la frase
            letra = cadena.charAt(i); // en cada vuelta guradamos la primera letra
            letra2 =cadena.charAt(cadena.length()- (1 +  i)  ); // en cada vuelta guradamos la ultima letra.
           // System.out.println("primera letra: " + letra);
           // System.out.println("ultima letra: " + letra2);
           if (letra != letra2 ){ // comprobamos en cada posicion que los caracterers sean iguales y si no pues actualizamos la bandera a falso
               palindromo = false;
           } 
        }
        if (!palindromo){
            System.out.println("Esta frase no es un palindromo");
        }
        else System.out.println("Esta frase si es un palindromo");
    }
}