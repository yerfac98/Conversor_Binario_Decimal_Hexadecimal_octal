
package binario;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class BinarioToHexadecimal {
    public static void main(String[] args) {
        
    
    String Resultado;
        int numeroDec;
        Scanner t=new Scanner(System.in);
        System.out.println("Ingrese un numero binario");
        numeroDec=t.nextInt();
        
        Resultado=Integer.toHexString(numeroDec);
        System.out.println("El numero en hexadecimal es "+ Resultado);
    
}
}