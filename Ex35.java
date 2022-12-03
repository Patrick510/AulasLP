/** 

Dados dois números m e n, qual a soma dos números ímpares entre o intervalo inclusivo de m e n? 
Exemplo, para m=6 e n=15, a soma dos números ímpares entre 6 e 15 é soma=7+ 9+11+13+15=55.

*/
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

  int m = in.nextInt();    
  int n = in.nextInt();
      
  int soma = 0;
  int i = m+1; 
      
 while(i <= n){

if(i % 2 == 1){
  soma = soma + i;  
  System.out.print(i+" ");  
  
}
  i++;
 }  
  System.out.println(" = "+soma);
  System.out.println(" ");
 }
}
