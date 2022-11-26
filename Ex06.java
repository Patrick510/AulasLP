/**Dados um número inteiro, qual o seu quadrado e seu cubo? Por exemplo, 
    se o número for 3, a resposta deve ser 9 e 27.
*/
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite um valor: ");    
  int a =in.nextInt();

  int qua = a + a + a + a;
  int cubo = a*a*a;

    System.out.println("O quadrado do valor "+a+" é: "+qua);
      System.out.println("O cubo do valor "+a+" é: "+cubo);

  }
 }