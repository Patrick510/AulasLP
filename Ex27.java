/** Gerar dois inteiros aleatórios cuja soma esteja entre 0 e 99 */

import java.util.Scanner;
import java.util.Random;

public class Ex27 {
    public static void main(String[] args) {

      Random r = new Random(0); 
        Scanner in = new Scanner(System.in);

    int m = r.nextInt(99);  
    int n = r.nextInt(99);     
                
      System.out.println(m); 
      System.out.println(n);
 }
}