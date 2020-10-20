package decimal;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class DecimalToHexaDecimal {

    public static void main(String[] args) {
        String Resultado;
        int numeroDec;
        try {
            Scanner t = new Scanner(System.in);
            System.out.println("Ingrese un numero decimal");
            numeroDec = t.nextInt();

            Resultado = Integer.toHexString(numeroDec).toUpperCase();
            System.out.println("El numero en hexadecimal es : " + "\n" + Resultado);

        } catch (Exception e) {
        }
    }

}
