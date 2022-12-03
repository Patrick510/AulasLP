/** 

Dado um número inteiro n, seguido por n números inteiros, para cada um deles, qual seu antecessor e 
sucessor?

*/
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

  int n = in.nextInt();    
  int m = n;
  int i = 0;
      
     while(i <= n){
       System.out.print(m+" ");
       i++;
       m = n-i;

     }   
      System.out.println("");
      
   for(i=0; i<=n; i++){
     m = n-i;   
     System.out.println("");
     System.out.println("Sucessor   "+m+" = "+(m+1));
     System.out.println("Antecessor "+m+" = "+(m-1));  
   }

  System.out.println(" ");
 }
}
