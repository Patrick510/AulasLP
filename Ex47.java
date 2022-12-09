/**  Ler um vetor de n números. Escrever os elementos ímpares do vetor. */
import java.util.Random;
import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {

      Random r = new Random(0);
      Scanner in = new Scanner(System.in);

      System.out.printf("Quantos elementos serão armazenados: ");    
      int n = in.nextInt();
      int[] vetor = new int [n];
      int i = 0;
    
      for(i = 0; i < n; i++){
        vetor[i] = r.nextInt(10);
      }

       for(i = 0; i < n; i++){ 
         if(vetor[i]%2==1){
            System.out.println("Ímpares na posição ("+i+") -> ["+vetor[i]+"]"); 
          } 
      }
   }    
}