/**  

Ler um vetor de n números, e dois índices x e y. Escrever a soma dos elementos nos índices x e y

*/
import java.util.Random;
import java.util.Scanner;

public class Ex45 {
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
    System.out.println("Na posição "+i+" ["+vetor[i]+"] ");
  } System.out.println(" ");

  System.out.printf("Escolha de 0 até "+n+": ");   
    int x = in.nextInt();

  System.out.printf("Escolha de 0 até "+n+": ");   
    int y = in.nextInt();

  int soma = vetor[x]+vetor[y];   

  System.out.println("A soma de "+vetor[x]+" + "+vetor[y]+" = "+soma);   
 }    
}