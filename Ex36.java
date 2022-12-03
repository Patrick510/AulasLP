/** Dado um número n, qual a tabuada de n? */
import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

  int m = in.nextInt();    
      
  int mult = 0;
  int i = 0; 
      
 while(i <= 10){

  System.out.println(m+" x "+i+" = "+mult);  
  i++;
  mult = m * i;
 }  
  System.out.println(" ");
 }
}
