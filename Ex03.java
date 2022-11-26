/** Dados três número inteiros, qual a soma deles?
*/
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

  int a =in.nextInt();
  int b =in.nextInt();
  int c =in.nextInt();
  int soma = a + b + c;

    System.out.println("Valores: "+a+","+b+","+c);
    System.out.println("A soma destes valores é: "+soma);

  }
 }