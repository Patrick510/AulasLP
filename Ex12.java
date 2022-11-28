/** Dado um número, ele é positivo, negativo ou igual a zero? */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite um valor: ");    
  int a =in.nextInt();

  if (a > 0){
    System.out.println("O valor "+a+" é positivo");
    System.out.println(""); 
  }
  if (a < 0){
    System.out.println("O valor "+a+" é negativo");
  }
  if (a == 0){
    System.out.println("O valor "+a+" é igual a zero");
  }
 }
}