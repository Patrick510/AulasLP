/**  

Ler um vetor de n números e um número m. 
Escrever os números do vetor que são menores que m em uma linha, e os maiores que m em outra linha.

*/
import java.util.Random;
import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {

      Random r = new Random(1);
      Scanner in = new Scanner(System.in);

  int i,j = 0; 
      
        System.out.print("Digite o tamanho do vetor: ");
         int t = in.nextInt();

        System.out.print("Digite um número aleatório: (0 até "+t+")\n");
         int m = in.nextInt();  
      
  int[] vetor = new int [t];
      
      for(i = 0; i < vetor.length; i++){
        vetor[i] = r.nextInt(10);
      } 
      
      System.out.println(" ");
      
      for(i = 0; i < vetor.length; i++){
        System.out.println("Na posição ("+i+") -> ["+vetor[i]+"]");
      } 
      
      System.out.println(" ");

      for(i = 0; i<vetor.length; i++){
        if(vetor[i] > m){
          System.out.print("["+vetor[i]+"] > "+m+"\n");
        } 
      }
       System.out.println(" ");
      for(i=0; i <vetor.length; i++){
        if(vetor[i] < m){
          System.out.print("["+vetor[i]+"] < "+m+"\n");
        }
      }
 }
}
  