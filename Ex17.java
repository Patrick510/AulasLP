/** Dados dois números, a média aritmética deles NÃO é ímpar? */

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite um valor: ");    
  float a =in.nextFloat();

  System.out.printf("Digite outro valor: ");    
  float a2 =in.nextFloat();

  Float media = (a+a2/2);
  
  if (media % 2 == 0){
    System.out.println(a2+" + "+a2+"/2 = "+media+"\nO que significa que a média aritmética deles não é impar");
    System.out.println(""); 
  } else {
    System.out.println(a2+" + "+a2+"/2 = "+media+"\nO que significa que a média aritmética deles não é par");
  }
 }
}