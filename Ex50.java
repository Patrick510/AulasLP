/**  

Ler um vetor de n números. Escrever o índice do maior e do menor elemento. 
Caso haja mais de um elemento que seja o menor, ou que seja o maior, escrever o de menor índice. 
(Obs.: Qual seria a alteração para escrever o de maior índice?)

*/
import java.util.Random;
import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {

      Random r = new Random(1);
      Scanner in = new Scanner(System.in);

  int i=0;
  int j = 0;
  int ma = 0; 
  int me = 0;
      
        System.out.print("Digite o tamanho do vetor: ");
         int t = in.nextInt();
      
  int[] vetor = new int [t];
      
      for(i = 0; i < vetor.length; i++){
        vetor[i] = r.nextInt(10);

      if(vetor[i] > vetor[ma]){
        ma = ma+i;
      } else if(vetor[i] < vetor[me]){
        me = me+i;
      }
      } System.out.println(" ");
      
      for(i=0;i<vetor.length;i++){
        System.out.println("Na posição ("+i+") -> ["+vetor[i]+"]");
      } System.out.println(" ");

      System.out.println("O maior valor está na posição ("+ma+") -> "+vetor[ma]);
      System.out.println("O menor valor está na posição ("+me+") -> "+vetor[me]);
      
 }
} 