/**  Ler um vetor de n elementos. Há elementos repetidos no vetor? */
import java.util.Random;
import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {

      Random r = new Random(1);
      Scanner in = new Scanner(System.in);

  int i,j,rep = 0; 
      
        System.out.print("Digite o tamanho do vetor: ");
         int t = in.nextInt();

  int[] vetor = new int [t];
    int[] pos = new int[t];
      
      for(i = 0; i < vetor.length; i++){
        vetor[i] = r.nextInt(10);
      } 
      
      System.out.println(" ");
      
      for(i = 0; i < vetor.length; i++){
        System.out.println("Na posição ("+i+") -> ["+vetor[i]+"]");
      } 
      
      System.out.println(" ");
      
      for(i = 0; i < vetor.length; i++){
        for(j = i+1; j < vetor.length; j++){
          if (vetor[i] == vetor[j]) {
                rep = 1;
                pos[j] = i;
          } 
        } 
      }

      if(rep == 0){
        System.out.println("Não há repetidos");
      } else if(rep == 1){
        System.out.println("Há repetidos na posição");
        for(i=0;i<pos.length;i++){
           if(pos[i] > 0){
        System.out.printf("("+pos[i]+") ");
          }   
         }
      }
System.out.println(" ");
      
 }
}
  