/**  

Dada uma sequência de 10 inteiros, qual a soma dos múltiplos de 3 e a soma dos múltiplos de 2? 
Entretanto, múltiplos de 6 não devem ser contabilizados na soma.

*/
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

  int i = 0;
  int cont = 0;

for(i = 1; i <= 10; i++){ 
  if(6 % i == 0){
    cont = cont + 0;
       System.out.println(i);  
  } else{
   cont = cont + i;
  }
}      
  System.out.println(cont); 
 }
}