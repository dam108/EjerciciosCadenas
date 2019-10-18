package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0506 {
    public static void main(String[] args) {
        String email;
        Scanner teclado = new Scanner(System.in);
        int posArroba, posCom;
        
        System.out.println("Introduce un email: "); // leer un email
        email = teclado.nextLine(); 
        
        //tendriamos problemas si el dominio es .es o .net o otro que no sea .com
        
        posArroba = email.indexOf('@'); // guardamos la posicion de la @
        posCom = email.indexOf(".com"); // guardamos la posision del .com
        
        String dominio = email.substring(posArroba + 1,posCom); // sacamos una subcadena desde la posicion de la arroba + 1 hasta la posicion del .com
         
        System.out.println(dominio); // imprimimos la subcadena con el dominio
    }
}