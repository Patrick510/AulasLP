/** Dada uma sequência de números naturais, seguida por um número negativo, qual o maior deles? */
import java.util.Scanner;
import java.util.Random;

public class Ex39 {
    public static void main(String[] args) {

      Random r = new Random(-10);
      
      Scanner in = new Scanner(System.in);
    
  int i = 0;
  int ma = 0;
  int n = 0;
      
   for(i=0; i<=10; i++){
       n = in.nextInt();

     if(n > ma){
       ma = n;
     }
   }
  System.out.println("O maior valor deles é: "+ma);
  System.out.println(" ");
 }
}