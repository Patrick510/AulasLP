/**Joãozinho fez sua viagem até os Estados Unidos. 
   Porém, chegando lá, descobriu que a temperatura é medida em graus Fahrenheit, e não em Celsius.
   Dada a temperatura em graus Fahrenheit, qual a temperatura correspondente em graus Celsius? */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite a temperatura em Celsius: ");    
  double c =in.nextDouble();
  System.out.println("");
// c x 1,8+32
      
  double conv = (c*1.8)+32;
      
    System.out.printf("%.0f C em Farenheight é: %.0f F",c, conv);

  }
 }