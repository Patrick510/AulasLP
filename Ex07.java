/** Dado um número inteiro, qual o seu antecessor e o seu sucessor? */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite um valor: ");    
  int a =in.nextInt();

  int ante = a-1;
  int suce = a+1;

    System.out.println("O antecessor do valor "+a+" é: "+ante);
      System.out.println("O sucessor do valor "+a+" é: "+suce);

  }
 }