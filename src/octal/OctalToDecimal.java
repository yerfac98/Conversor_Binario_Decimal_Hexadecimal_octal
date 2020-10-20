/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octal;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class OctalToDecimal {

     public static void main(String args[]) {
        try {
            int octnum, decnum = 0, i = 0, orig;
            Scanner scan = new Scanner(System.in);

            System.out.print("Introduce un numero octal :\n ");
            octnum = scan.nextInt();

            orig = octnum;

            while (octnum != 0) {
                decnum = decnum + (octnum % 10) * (int) Math.pow(8, i);
                i++;
                octnum = octnum / 10;
            }

            System.out.print("El valor en decimal de " + orig + " es :\n");
            System.out.print(decnum);
            System.out.println();

        } catch (Exception e) {

        }
    }
}
