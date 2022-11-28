/**   Dados três números, o primeiro é maior que os outros dois juntos? */

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite um valor: ");    
  int a =in.nextInt();

  System.out.printf("Digite outro valor: ");    
  int a2 =in.nextInt();

  System.out.printf("Digite mais um valor: ");    
  int a3 =in.nextInt();

  int soma = a2 + a3;
      
  if (soma >= a){
    System.out.println("A soma de "+a2+" + "+a3+" = "+soma+"\nO que significa que é maior que: "+a);
    System.out.println(""); 
  }
 }
}