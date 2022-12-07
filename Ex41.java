/**  

Ler vários números até a soma dos números lidos passar de 1000. 
Escrever o maior dos números.

*/
import java.util.Scanner;
import java.util.Random;

public class Ex41 {
    public static void main(String[] args) {

      Random r = new Random(1);
      Scanner in = new Scanner(System.in);
      
  int i = 0;
  int som = 0;
  int ma = 0;

for(i = 0; som < 1000; i++){      
  int n = r.nextInt(100);
  System.out.printf(n+" ");
  som = som + n;
  if (ma < n){
    ma = n;
  }
  }
  System.out.println("");
  System.out.println("Todos os valores somados é igual a: "+som);
  System.out.println("De todos os valores o maior é: "+ma);
 }
}
