package ejercicioscadenas;
import java.util.Scanner;
public class Ejercicio0509 {
    public static void main(String[] args) {
        String nombre, apellido1, apellido2;
        int edad;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");        //pedir nombre
        nombre = teclado.nextLine();
        System.out.println("Introduce tu primer apellido: ");// pedir apellidos
        apellido1 = teclado.nextLine();
        System.out.println("Introduce tu segundo apellido: ");
        apellido2 = teclado.nextLine();
        System.out.println("Introduce tu edad: ");// pedir edad
        edad = teclado.nextInt();

        // imprimir con la clase format Hola , me llamo "nombre" "apellidos" y tengo "edad" años
        String cadena = String.format("hola mi nombre es %4$s %2$s %3$s y mi edad es %1$d", edad, apellido1, apellido2, nombre);
        System.out.println(cadena);
    }
}