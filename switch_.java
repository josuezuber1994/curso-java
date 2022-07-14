
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class switch_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SENTENCIA SWITCH
        int dato;
        dato= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero entre 1-5"));
        
        switch (dato) {
            case 1: JOptionPane.showMessageDialog(null, "Digite el numero 1");
                break;
            case 2:JOptionPane.showMessageDialog(null, "Digite el numero 2");
                break;
            case 3:JOptionPane.showMessageDialog(null, "Digite el numero 3");
                break;    
            case 4:JOptionPane.showMessageDialog(null, "Digite el numero 4");
                break;
            case 5:JOptionPane.showMessageDialog(null, "Digite el numero 5");
                break;    
                
            //Caso Contrario
            default: JOptionPane.showMessageDialog(null, "El numero no esta en el rango del 1 al 5 ");
                
        }
        
        
    }
    
}

