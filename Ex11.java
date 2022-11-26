/** 

Dado o valor do saque realizado pelo cliente de um banco, quantas notas de cada 
valor serão necessárias para atender ao saque com a menor quantidade de notas possível? 
Podem ser utilizadas notas de $100, $50, $20, $10, $5, $2 e $1. 

*/

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
  System.out.printf("Qual o valor do saque: ");    
  int a =in.nextInt();

  int rs = 0;

  System.out.println("");

  if (a % 100 == 0){
    rs = (a/100);
    System.out.println("Para fazer o saque de "+a+"\nVai ser preciso "+rs+" notas de R$100");

    System.out.println("--------------------------------------------------");
  }else{
    rs = 0;
  }
      
  if (a % 50 == 0){
    rs = (a/50);
    System.out.println("Para fazer o saque de "+a+"\nVai ser preciso "+rs+" notas de R$50");

    System.out.println("--------------------------------------------------");
  }else{
    rs = 0;
  }   

  if (a % 20 == 0){
    rs = (a/20);
    System.out.println("Para fazer o saque de "+a+"\nVai ser preciso "+rs+" notas de R$20");

      System.out.println("--------------------------------------------------");
  }else{
    rs = 0;
  }
      
  if (a % 10 == 0){
    rs = (a/10);
    System.out.println("Para fazer o saque de "+a+"\nVai ser preciso "+rs+" notas de R$10");

        System.out.println("--------------------------------------------------");
  }else{
    rs = 0;
  }

  if (a % 5 == 0){
    rs = (a/5);
    System.out.println("Para fazer o saque de "+a+"\nVai ser preciso "+rs+" notas de R$5");

    
    System.out.println("--------------------------------------------------");
  }else{
    rs = 0;
  }
      
  if (a % 2 == 0){
    rs = (a/2);
    System.out.println("Para fazer o saque de "+a+"\nVai ser preciso "+rs+" notas de R$2");

    System.out.println("--------------------------------------------------");
  }else{
    rs = 0;
  }

  if (a % 1 == 0){
    rs = (a/1);
    System.out.println("Para fazer o saque de "+a+"\nVai ser preciso "+rs+" notas de R$1");

    System.out.println("--------------------------------------------------");
  }else{
    rs = 0;
  }
      
  }
 }