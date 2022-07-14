
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class multiplo_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        if (numero % 10 ==0) {
            JOptionPane.showMessageDialog(null, "El Numero "+numero+ " Si es Multiplo");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero que ingreso no es multiplo de 10");
            
        }
    }
    
}
