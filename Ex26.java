/** Dados dois inteiros m e n, gerar três inteiros aleatórios entre m e n. */

import java.util.Scanner;
import java.util.Random;

public class Ex26 {
    public static void main(String[] args) {


      
        Scanner in = new Scanner(System.in);

    int m = in.nextInt();  
    int n = in.nextInt();  

                Random r = new Random(m);
      
      System.out.println(r.nextInt(n)); 
      System.out.println(r.nextInt(n)); 
      System.out.println(r.nextInt(n)); 
 }
}