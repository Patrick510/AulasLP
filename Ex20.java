/** 

 Dado o salário bruto, escrever salário líquido. 
  Sendo que o salário líquido é o salário bruto menos os descontos de INSS e IR, seguindo as regras:
    – Para salários menores que $1.500,00, não se deve descontar IR, mas se desconta 8% de INSS;
    – Para salários a partir $1.500,00, se desconta 5% de IR e 9% de INSS.


*/

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite o seu salário: ");    
  double a =in.nextDouble();

  if(a < 1500){
    double desc = a*0.8;
    System.out.println("Seu salario: "+String.format("%.0f", a)+"\nDesconto de 8%(INSS) e Não é descontado o IR");
    System.out.printf("Seu salario descontado: %.0f", desc);
    System.out.println("");
  } else {
    double desc = (a * 0.5)*0.9;
    System.out.println("Seu salario: "+String.format("%.0f", a)+"\nDesconto de 9%(INSS) e 5%(IR)");
    System.out.printf("Seu salario descontado: %.0f", desc);
    System.out.println("");
  }      
      
 }
}