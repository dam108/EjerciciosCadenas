package ejercicioscadenas;
import java.util.*;
public class Ejercicio0504 {
    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
        
        String letras = "abcdefghij";
        int num;
        String cade = "";
        num = (int)(Math.random()*6 + 5 );
  
        for (int i = 0; i < num; i++){
            
            int longitud = letras.length();
            int letraRandom = (int)(Math.random()* longitud );
            char caracter = letras.charAt(letraRandom);
            
            cade  = cade + caracter;
            
            
        }
        System.out.print(cade);
        System.out.println("");
    }
    
}

// generar numeros aleatorios Math.random()
// ramdom nos da numeros decimales entre 0 ~0.999999, hay que adaptarlo a lo que queremos , si lo multiplicamos por 10 nos da un numero entre 0 y  9.99999999
// si lo hacemos int se nos quedaa entre 0 y 9 (int) Math.randon ()  * 10
// si queremos un numero entre 1 y 6 por ejemplo los lados de un dado (int) Math.random ()* 5 + 1;
// para 
