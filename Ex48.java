/**
EXERCÍCIO 1 SIMULADO
*/


import java.util.Random;
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {

      Random r = new Random(1);
      Scanner in = new Scanner(System.in);


  int i,x,t;
  int j = 0;

        System.out.print("Digite o tamanho do vetor: ");
         t = in.nextInt();
        System.out.println(" ");
      
  int[] vetor = new int [t];
      
      for(i = 0; i < vetor.length; i++){
        vetor[i] = r.nextInt(100);
      } System.out.println(" ");

        System.out.println("Digite o valor que quer verificar?");
         x = in.nextInt();
        System.out.println(" ");
      
      for(i=0;i<vetor.length;i++){
        System.out.println("Na posição ("+i+") -> ["+vetor[i]+"]");
      } System.out.println(" ");

      System.out.println(" ");

      for(i=0;i<vetor.length;i++){
        if(vetor[i] == x){
          j = j + 1;
        }
      }

      if(j > 1){
       System.out.println("O número "+x+" se repete: "+j+" vezes"); 
      } else {
        System.out.println("O número "+x+" se repete: "+j+" vez"); 
      }
 }
}
  