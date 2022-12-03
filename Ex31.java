/** 

Dado um número inteiro positivo n, qual a soma dos números de 1 até n? 
Exemplo, para n=5, soma=1+2+3+4+5=15. 

*/
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

  int n = in.nextInt();
      
  int i = 1;
  int soma = 0;
      
while(i <= n){
  soma = soma + i;
  System.out.print(i+" ");
  i = i+1;
  }                 
 System.out.print("= "+soma);
  System.out.println(" ");
 }
}
