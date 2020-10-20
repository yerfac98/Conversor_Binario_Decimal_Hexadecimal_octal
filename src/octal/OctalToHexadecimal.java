package octal;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class OctalToHexadecimal {

    public static void main(String args[]) {
        try {
            String NumOct, NumHexa;
            int PasDec;
/**
 * Primero, convierte el número octal a número decimal: 
int PasDec = Integer.parseInt (NumOctal, 8);
* 
Segundo, convierta el número decimal en número hexadecimal: 
String NumHexa = Integer.toHexString (PasDec);
            
            */ 
            Scanner scan = new Scanner(System.in);

            System.out.print("Introducir número octal :\n  ");
            NumOct = scan.nextLine();

            PasDec = Integer.parseInt(NumOct, 8);
            NumHexa = Integer.toHexString(PasDec);

            System.out.print("Valor hexadecimal equivalente de " + NumOct + " es :\n");
            System.out.print(NumHexa);
            System.out.println();
        } catch (Exception e) {
        }
    }
}
