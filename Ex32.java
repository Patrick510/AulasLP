/** 

Modificar o programa anterior, de tal modo que apenas múltiplos de três ou cinco são consideradas na soma. 
Exemplo, para n = 17, soma = 3+ 5+ 6+ 9+ 10+ 12+ 15.


*/
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

  int n = in.nextInt();
      
  int i = 1;
  int soma = 0;
      

  soma = soma + i;

 while(i <= n){

if (i % 3 == 0){
  System.out.print(i+" ");  
}  else if((i % 5 == 0)){
  System.out.print(i+" ");  
}
 i = i+1;   
}  
                
  System.out.println(" ");
 }
}