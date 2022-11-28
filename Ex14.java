/**   Dados dois números, eles são iguais? */

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite um valor: ");    
  int a =in.nextInt();

  System.out.printf("Digite outro valor: ");    
  int a2 =in.nextInt();

  if (a == a2){
    System.out.println("Esses dois valores são iguais");
    System.out.println(""); 
  }else{
    System.out.println("Esses dois valores não são iguais");
    System.out.println(""); 
  }
 }
}