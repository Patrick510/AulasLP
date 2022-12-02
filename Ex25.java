/** Gerar três inteiros aleatórios entre -10 e 10. */

import java.util.Scanner;
import java.util.Random;

public class Ex25 {
    public static void main(String[] args) {

        Random r = new Random(-10);      
        Scanner in = new Scanner(System.in);

   System.out.println(r.nextInt(10)); 
   System.out.println(r.nextInt(10)); 
   System.out.println(r.nextInt(10)); 
   
 }
}