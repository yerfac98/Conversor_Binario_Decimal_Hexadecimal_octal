
package hexadecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gerardo Fac
 */
public class HexaDecimalToDecimal {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el valor en Hexadecimal:");

        System.out.println();

        String str = bf.readLine();

        int convertir = Integer.parseInt(str, 16);

        System.out.println();

        System.out.println("El valor en Decimal es: " + convertir);

        System.out.println();

    }

}


