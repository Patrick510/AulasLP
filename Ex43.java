/**  

Dada uma sequência de inteiros, que termina com 10 números ou com um múltiplo de 6. Qual a soma dos múltiplos de 3 e a soma dos múltiplos de 2? 
O múltiplo de 6 não deve ser contabilizado na soma

*/
import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

  int i = 0;
  int cont = 0;

for(i = 1; i <= 10 || i == 6; i++){ 
  if(6 % i == 0){
    cont = cont + 0; 
  } else{
   cont = cont + i;
    System.out.println(i); 
  }
}      
  System.out.println(cont); 
 }
}
