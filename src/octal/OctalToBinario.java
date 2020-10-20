package octal;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class OctalToBinario {
    public static void main(String args[])
    {
        int binnum, rem, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Introduzca numero binario : ");
        binnum = scan.nextInt();
		
        quot = binnum;
		
        while(quot != 0)
        {
            octnum[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Valor Octal Equivalente de " +binnum+ " es :\n");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
            
        }
    }
}
