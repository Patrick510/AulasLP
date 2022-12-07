/**  

Dados dois números inteiros, multiplicá-los usando somas repetidas. 
Não pode usar o operador de multiplicação "*". 
Sugestão: usar um laço e o operador de soma (+). 

*/
import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);

  int n = in.nextInt();
  int m = in.nextInt();
      
  int i = 0;
  int ma = n;
  int na = m;
  int soma = 0;

if(n > m){
   for(i = 1; i <= m; i++){
     soma = ma + soma;
   }
   System.out.println(n+" x "+m+" = "+soma); 
  } else if(m > n){
   for(i = 1; i <= n; i++){
     soma = na + soma;
   } 
   System.out.println(n+" x "+m+" = "+soma); 
  }
 }
}