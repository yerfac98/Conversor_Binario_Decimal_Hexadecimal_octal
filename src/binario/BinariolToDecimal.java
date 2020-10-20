package binario;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo Fac
 */
public class BinariolToDecimal {

    public static void main(String[] args) {
        try{
            
        //convertir de binario a decimal
        String binario = JOptionPane.showInputDialog(null, "Ingresa un número en binario"); //pedir numero
        int numero = Integer.parseInt(binario, 2);
         //Declara entero cualquier variable
        //Le decimos la variable binario que convierta base 2 a base 10
        //convierte de base 2 a base 10
        JOptionPane.showMessageDialog(null, " El número en decimal es " + numero);
        JOptionPane.showInputDialog(null, " Desea continuar?\n 1 si \n 2 no ");
        
        

    } catch (Exception e) {

}
}
}