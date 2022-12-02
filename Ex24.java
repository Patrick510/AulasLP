/** Dado um inteiro n, gerar três inteiros aleatórios entre 0 e n. */

import java.util.Scanner;
import java.util.Random;

public class Ex24 {
    public static void main(String[] args) {

        Random r = new Random(1);      
        Scanner in = new Scanner(System.in);

  int i = in.nextInt();

   System.out.println(r.nextInt(i)); 
   System.out.println(r.nextInt(i)); 
   System.out.println(r.nextInt(i)); 
   
 }
}