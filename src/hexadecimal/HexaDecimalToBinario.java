package hexadecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gerardo Fac
 */
public class HexaDecimalToBinario {
    
public static void main(String[] args) throws IOException

    {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el valor Hexadecimal: ");

        String hex = bf.readLine();

        int i = Integer.parseInt(hex,16);

        String bin = Integer.toBinaryString(i);

        System.out.println("El valor en Binario es: " + bin);

    }

} 
