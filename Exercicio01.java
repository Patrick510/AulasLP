
/**Aluna: Franciele Almeida de Araujo
 * Materia: Contrução de Algoritmo
 * Curso: Tecnologia em Analise e Desenvolvimento de Sistemas
 * Docente: Pedro Siqueira
* 1) Dados dois números naturais X e Y, quais os múltiplos de X menores que Y, em ordem DECRESCENTE?

*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe dois numeros");

        int x = in.nextInt();
        int y = in.nextInt();

        for (int i = y; i > x; i -= x) {
            System.out.printf(" " + i);
        }

    }
}