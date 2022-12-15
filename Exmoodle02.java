
/**Aluno: Patrick Dias
 * Materia: Contrução de Algoritmo
 *2)Dado um número natural N, seguido por N números decimais, qual a soma dos números lidos, 
a quantidade de números lidos, o maior e o menor número lido e a média aritmética dos números lidos?
O número N não deve ser considerado. Se N=0, então não haverá outros números a serem lidos, 
logo, a resposta deve ser zero para cada saída solicitada.
*/

import java.util.Scanner;

public class Exmoodle02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Quantos numeros deseja informar?");

        int n = in.nextInt();
        double maior = 0;
        double menor = 99999;
        double soma = 0;
        double i = 0;
        while ((i < n)) {
            System.out.print("Informe o numero: ");

            double m = in.nextDouble();

            soma += m;

            if (m > maior) {
                maior = m;
            }
            if (m < menor) {
                menor = m;
            }
            i++;

        }
        double media = soma / i;
        if (n == 0) {
            maior = 0;
            menor = 0;
            soma = 0;
            i = 0;
            media = 0;

        }
        System.out.println("maior " + maior + "\n menor " + menor + "\n soma " + soma + "\n numeros lidos " + i);
        System.out.println("media " + media);
    }

}
