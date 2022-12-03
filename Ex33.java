/** 

Dados dois números m e n, qual a soma dos números inteiros entre o intervalo inclusivo de m e n? 
Exemplo, para m=2 e n=6, a soma dos números inteiros entre 2 e 6 inclusivos é soma=2+3+4+5+6=20.

*/
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

  int m = in.nextInt();    
  int n = in.nextInt();
      
  int i = m;
  int soma = 0;

 while(i <= n){

soma = soma + i;   
  System.out.print(i+" ");     
i = i+1;
 }  
  System.out.println(" = "+soma);
  System.out.println(" ");
 }
}
