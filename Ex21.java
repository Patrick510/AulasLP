/** 

Uma empresa vende o mesmo produto para quatro diferentes estados. 
Cada estado possui uma taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS 8%). 
Dado o valor e o estado destino do produto, qual o preço final do produto acrescido do imposto do estado em que ele será vendido? 
Se o estado digitado não for válido, escrever uma mensagem de erro

*/

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite o valor do produto: ");    
  double a = in.nextDouble();
  System.out.println("");        

  System.out.println("Digite o estado: ");    
  System.out.println(" 07% <- (MG) [1]  ");   
  System.out.println(" 12% <- (SP) [2] ");    
  System.out.println(" 15% <- (RJ) [3] ");    
  System.out.println(" 08% <- (MS) [4] ");    
  System.out.printf("=> ");
  int e = in.nextInt();

  double result;    
  double cont1;
      
   if(e == 1){
     cont1 = (a*0.7)/10;
     result = a+cont1;
     System.out.println("O produto com valor "+String.format("%.0f", a)+" teve um aumento de 7% \nO que resulta em: "+String.format("%.0f", result));
   } else if(e == 2){
      result = a*1.2;
     System.out.println("O produto com valor "+String.format("%.0f", a)+" teve um aumento de 7% \nO que resulta em: "+String.format("%.0f", result));
   } else if(e == 3){
      result = a*1.5;
     System.out.println("O produto com valor "+String.format("%.0f", a)+" teve um aumento de 7% \nO que resulta em: "+String.format("%.0f", result));
   } else if(e == 4){
     cont1 = (a*0.8)/10;
     result = a+cont1;
     System.out.println("O produto com valor "+String.format("%.0f", a)+" teve um aumento de 7% \nO que resulta em: "+String.format("%.0f", result));
   }
  
 }
}