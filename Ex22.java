/** Dado um inteiro como semente, gerar três inteiros aleatórios. */

import java.util.Scanner;
import java.util.Random;

public class Ex22 {
    public static void main(String[] args) {

        Random r = new Random(1);      
        Scanner in = new Scanner(System.in);

   System.out.println(r.nextInt(10)); 
   System.out.println(r.nextInt(10)); 
   System.out.println(r.nextInt(10)); 
   
 }
}