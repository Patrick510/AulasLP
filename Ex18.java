/** 

Dados três números, qual a mediana? 
(o número do meio, em ordem crescente) 

*/

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite um valor: ");    
  float a =in.nextFloat();

  System.out.printf("Digite outro valor: ");    
  float a2 =in.nextFloat();

  System.out.printf("Digite outro valor: ");    
  float a3 =in.nextFloat();

  float mediana = (a+a2+a3)/3;   
  
  System.out.println(a+", "+a2+", "+a3+"\nA mediana é "+mediana);
 }
}