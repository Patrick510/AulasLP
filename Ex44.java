/**  

Ler um vetor de n elementos. Escrever os n elementos normalmente em uma linha e do último para o primeiro em outra linha.

*/
import java.util.Random;
import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {

      Random r = new Random(1);
      Scanner in = new Scanner(System.in);

  System.out.printf("Quantos elementos serão armazenados: ");    
    int n = in.nextInt();
    int[] vetor = new int [n];
    int i = 0;

  for(i = 0; i < n; i++){
    vetor[i] = r.nextInt(10);
  }
      System.out.print("Vetor normal: ");
    for(i = 0; i < n; i++){
      System.out.print("["+vetor[i]+"]");
    }
      System.out.println(" ");
      System.out.print("Ao contrário: ");
    for(i = n-1; i >= 0;i--){
      System.out.print("["+vetor[i]+"]");
    }
 }    
}