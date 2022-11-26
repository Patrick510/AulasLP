/** A família Silva vai passar as férias na Europa e quer saber quantos 
    euros vale o dinheiro em real que ela levará. 
    Dados um valor na moeda real e a cotação do euro, qual o valor correspondente em euros? */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Digite quanto você possui em reais: ");    
  double r =in.nextDouble();

  double conv = (r * 5.67);
      
    System.out.println("Como você possui o valor de R$ "+r+"\nIsso corresponde á: "+conv+" euros");

  }
 }