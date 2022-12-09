/**  

Ler um vetor de n números. 
Escrever os números menores que a média aritmética em uma linha e os maiores em outra linha

*/
import java.util.Random;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {

      Random r = new Random(1);
      Scanner in = new Scanner(System.in);

  int i,j = 0;
  double soma = 0;
  double m = 0;
      
        System.out.print("Digite o tamanho do vetor: ");
         double t = in.nextDouble();

      double[] vetor = new double [(int) t];      
      
      for(i = 0; i < vetor.length; i++){
        vetor[i] = r.nextDouble(10);
      } 
      
      System.out.println(" ");
      
      for(i = 0; i < vetor.length; i++){
        System.out.printf("Nota do aluno ("+i+") -> [%.2f]\n",vetor[i]);
      } 
      
       System.out.println(" ");
      for(i = 0; i<vetor.length; i++){
        soma += vetor[i];
      m = soma/vetor.length;   
    }
      System.out.printf("MÉDIA:  %.2f",m);
      System.out.println(" ");
      System.out.println("ACIMA DA MÉDIA ");
       for(i=0; i <vetor.length; i++){
          if(vetor[i] > m){
              System.out.printf("("+i+") -> [%.2f] \n",vetor[i]); 
        }
      }
       System.out.println(" ");
      System.out.println("ABAIXO DA MÉDIA ");
      for(i=0; i <vetor.length; i++){
          if(vetor[i] < m){
          System.out.printf("("+i+") -> [%.2f] \n",vetor[i]);
        }
    }
 }
}
  