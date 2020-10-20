
package decimal;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class DecimalToOctal {
    public static void main(String[] args) {
        String Resultado;
        int numeroDec;
        Scanner t=new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        numeroDec=t.nextInt();
        
        Resultado=Integer.toOctalString(numeroDec);
        System.out.println("El numero en octal es "+ Resultado);
        
        
    }
    
}
/**
 public static void octal(int N){       
        if(N < 8) System.out.print(N);
        else {
            octal(N/8);
           System.out.print(N%8);
        }       
    }
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
   
        System.out.print("Ingrese una cifra: ");
        int cifra = leer.nextInt();
        
        System.out.print("\noctal:\t\t");
        octal(cifra);
       
       
    }
}
*/
    