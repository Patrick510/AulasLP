/** 

Dados dois números m e n, qual a soma dos números inteiros entre o intervalo exclusivo de m e n? 
Exemplo, para m=2 e n=6, a soma dos números entre 2 e 6 exclusivos é soma=3+4+5=12

*/
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

  int m = in.nextInt();    
  int n = in.nextInt();
      
  int soma = 0;
  int i = m+1; 
      
 while(i < n){ 
  soma = soma + i;  
  System.out.print(i+" ");  
  i++;
 }  
  System.out.println(" = "+soma);
  System.out.println(" ");
 }
}
