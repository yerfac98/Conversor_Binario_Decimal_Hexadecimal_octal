
package decimal;

import java.util.Scanner;


/**
 *
 * @author Gerardo Fac
 */
public class DecimalToBinario {

   public static void binario(int N) {
        
        if (N == 1) {
            System.out.print("1");
        } else {
            binario(N / 2);
            System.out.print(N % 2);
            
        }
    }
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una cifra: ");
        System.out.println();
        int cifra = leer.nextInt();
        System.out.print("\nbinario:" );
        System.out.println();
        binario(cifra);
        System.out.println();
        System.out.println("------------FIN DEL PROGRAMA-------------");
       
    }
}
