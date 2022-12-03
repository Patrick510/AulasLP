/** 

Escrever cada intervalo de números inteiros a seguir em uma linha:
 a) [0, 10[
 b) ]10, 0]
 c) [-10, 10]
 d) [100, 1]

*/

public class Ex28S {
    public static void main(String[] args) {

System.out.println(" [0, 10[ ");
  int i = 0;    
      
while(i <= 10){
  System.out.print(i+" ");
  i = i+1;
  }                 

  System.out.println(" ");

  System.out.println(" ]10, 0[ ");
   i = 0;
   int c = 10;
      
while(i <= 10){
  System.out.print(c+" ");
  i = i+1;
  c = c - 1;
  }          

  System.out.println(" ");

System.out.println(" ]-10, 10[ ");
   i = -10;
      
while(i <= 10){
  System.out.print(i+" ");
  i = i+1;
  }          

  System.out.println(" ");

  
System.out.println(" ]100, 1[ ");
   i = 0;
   c = 100;
      
while(i <= 100){
  System.out.print(c+" ");
  i = i+1;
  c = c - 1;
  }            
    
 }
}
