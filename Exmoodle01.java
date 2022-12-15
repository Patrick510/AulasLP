
/**Aluno: Patrick Dias
 * Materia: Contrução de Algoritmo
* 1) Dados dois números naturais X e Y, quais os múltiplos de X menores que Y, em ordem DECRESCENTE?

*/

import java.util.Scanner;

public class Exmoodle01 {
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
