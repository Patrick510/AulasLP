/** Dados três números inteiros, qual o resultado do primeiro multiplicado pelo segundo, somado ao terceiro?
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

  System.out.println("Digite");    
  int a =in.nextInt();
  int b =in.nextInt();
  int c =in.nextInt();
  int soma = (a * b) + c;

    System.out.println("Valores: "+a+","+b+","+c);
    System.out.println("A soma destes valores é: "+soma);

  }
 }