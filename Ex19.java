/** 

Dadas duas notas de um aluno, qual a média destas notas? 
Entretanto se alguma nota for inválida (valor menor que 0 
ou maior que 10), escrever a nota inválida e não escrever a média.

*/

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

  float a,a2;
      
  System.out.printf("Digite um valor: ");    
  a =in.nextFloat();

  System.out.printf("Digite outro valor: ");    
  a2 =in.nextFloat();

if ((a < 0) || (a2 < 0)) {
  System.out.println("Nota invalida!");
  System.out.println("");
  
  System.out.printf("Digite um valor válido: ");
  a = in.nextFloat();

  System.out.printf("Digite outro valor válido: ");
  a2 = in.nextFloat();

  float media = (a+a2)/3;   
  System.out.println("A media é "+media);
} else{
  
  float media = (a+a2)/3;   
  System.out.println("A media é "+media);
  
  }  
 }
}