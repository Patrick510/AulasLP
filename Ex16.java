/** Dados dois números, o primeiro é o dobro do segundo? */

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite um valor: ");    
  int a =in.nextInt();

  System.out.printf("Digite outro valor: ");    
  int a2 =in.nextInt();

  int dobro = a2*2;
  
  if (a == dobro){
    System.out.println(a2+" x 2 = "+dobro+"\nO que significa que o primeiro valor é o dobro do segundo");
    System.out.println(""); 
  } else {
    System.out.println(a2+" x 2 = "+dobro+"\nO que significa que o primeiro valor não é o dobro do segundo");
  }
 }
}