/** Gerar três inteiros aleatórios com a data atual como semente. */

import java.util.Scanner;
import java.util.Random;

public class Ex23 {
    public static void main(String[] args) {

        Random r = new Random(1);      
        Scanner in = new Scanner(System.in);

   System.out.print(r.nextInt(30)+"/"); 
   System.out.print(r.nextInt(12)+"/"); 
   System.out.print(r.nextInt(2022)); 
   
 }
}