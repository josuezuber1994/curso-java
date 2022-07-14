
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class condicionales_if_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONDICIONALES IF O ELSS
      int numero, dato=5;
      
      numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        if (numero >= dato) {
            JOptionPane.showMessageDialog(null,"El numero es 5 o mayor");
            
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero es menor a 5");
        }
    }
    
}
