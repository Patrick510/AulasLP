/** 

Dado um número natural, quais seus divisores? 
Por exemplo, os divisores de 90 são 1, 2, 3, 5, 6, 9, 10, 15, 18, 30, 45, 90 

*/
import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

  int m = in.nextInt();    
      
  int i = 1; 

System.out.print(" Os divisores de "+m+" são: ");
      
 while(i <= m){

if(m % i == 0){
  System.out.print(i+" ");   
} 
  i++;
 }  
  System.out.println(" ");
 }
}
