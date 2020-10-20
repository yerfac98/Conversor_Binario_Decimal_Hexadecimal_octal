
package binario;

import static decimal.DecimalToBinario.binario;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo Fac
 */
public class BinarioToOctal {
public static void main(String args[])
    {
        int binnum, rem, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Ingresa numero binario : ");
        binnum = scan.nextInt();
		
        quot = binnum;
		
        while(quot != 0)
        {
            octnum[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Valor octal equivalente de " +binnum+ " es :\n");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
    }
}
