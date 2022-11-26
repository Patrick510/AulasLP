/** Dados três números decimais, qual sua média aritmética? */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite o 1° valor: ");    
  double a =in.nextDouble();

  System.out.printf("Digite o 2° valor: ");    
  double b =in.nextDouble();

  System.out.printf("Digite o 3° valor: ");    
  double c =in.nextDouble();
      
  System.out.println("");
      
  double media = (a+b+c)/3;
      
    System.out.printf("A média desses 3 valores é: %.2f",media);

  }
 }