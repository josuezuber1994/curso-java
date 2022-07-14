
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class pedir_una_nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //PEDIR UNA NOTA DE 0 A 10 Y MOSTRARLA DE LA FORMA: INSUFICIENTE, SUFICIENTE,BIEN
        //NOTABLE Y SOBRESALIENTE
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero del 1- 10"));
        switch(numero){
            case 1:
            case 2:JOptionPane.showMessageDialog(null, "La nota es INSUFICIENTE");
            break;            
            case 3:
            case 4:JOptionPane.showMessageDialog(null, "La nota es SUFICIENTE");
            break;
            case 5:
            case 6:JOptionPane.showMessageDialog(null, "La nota es BIEN");   
            break;          
            case 7:
            case 8:JOptionPane.showMessageDialog(null, "La nota es NOTABLE"); 
            break;          
            case 9:
            case 10:JOptionPane.showMessageDialog(null, "La nota es SOBRESALIENTE"); 
            break;
            default:JOptionPane.showMessageDialog(null, "La nota tiene que ser del 1 - 10");
        }
        
        
    }
    
}

