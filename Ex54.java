/**  
Ler um natural n seguido por n números. Escrever os n números em ordem crescente.
*/
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ex54 {
    public static void main(String[] args) {

      Random r = new Random(1);
      Scanner in = new Scanner(System.in);

  int i,j,copia,troca = 0;
      
        System.out.print("Digite o tamanho do vetor: ");
         int t = in.nextInt();
      
      int[] vetor = new int [t];      
      
      for(i = 0; i < vetor.length; i++){
        vetor[i] = r.nextInt(10);
      } 
      
      System.out.println(" ");
      
      for(i = 0; i < vetor.length; i++){
        System.out.printf("Posição ("+i+") -> ["+vetor[i]+"] \n");
      } 

      System.out.println(" ");

   //   Arrays.sort(vetor); // 0 0 0 0 0 13 40 57 90 99   
      
      System.out.println(" ");
      for(i = 0; i < vetor.length; i++){
        for(j = i+1; j < vetor.length; j++){
         if(vetor[i] > vetor[j]){
           copia = vetor[i];
           vetor[i] = vetor[j];
           vetor[j] = copia;
           }
        } 
      }

      for(i = 0; i < vetor.length; i++){
        System.out.printf("Posição ("+i+") -> ["+vetor[i]+"] \n");
      }

      
 }
}
  