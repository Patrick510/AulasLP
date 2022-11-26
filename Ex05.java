/** Dadas a base e a altura de um triângulo, qual sua área?
*/
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

// Calculo da area (b.h /2)
      
  System.out.printf("Digite a altura: ");    
  int a =in.nextInt();
  System.out.printf("Digite a base: ");        
  int b =in.nextInt();
  int area = (b * a) /2;

    System.out.println("A area desse triângulo é: "+area);

  }
 }
