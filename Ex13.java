/**  Dado um número, ele é par ou ímpar? */

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite um valor: ");    
  int a =in.nextInt();

  if (a % 2 == 0){
    System.out.println("O valor "+a+" é par");
    System.out.println(""); 
  }else{
    System.out.println("O valor "+a+" é ímpar");
    System.out.println(""); 
  }
 }
}