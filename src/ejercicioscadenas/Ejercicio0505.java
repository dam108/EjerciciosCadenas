package ejercicioscadenas;
//import java.util.Scanner;
public class Ejercicio0505 {
    public static void main(String[] args) {
       String letras = "abcdefghij";// Scanner teclado = new Scanner(System.in);
       String password = ""; // cadena con las letras a usar
       int longitud = letras.length(); // longitud de la cadena
       int num = (int)(Math.random()*6 + 5); // generamos un numeo aleatorio entre 5 y 10
       int pos;
       char caracter;
       
       for ( int i = 0 ;i < num; i++){

           do { // minetras el caracter este en la cadena password 
               caracter = letras.charAt( (int)(Math.random() * longitud));// en cada vuelta de la iteración cogemos un caracter de la cadena.
               pos = password.indexOf(caracter); // con esa letra comprobamos si esta en en la cadena password
               
           } while (pos != -1);
           
           password = password + caracter;
           
       }
       System.out.print(password);
    }
}