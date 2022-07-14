
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class pedir_un_numero_0a_99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // PEDIR UN NUMERO ENTRE 0 Y 99 999 Y DECIR CUANTAS CIFRAS TIENE
        
    int numero;
     
     numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero entre 0 y 99999"));
     
     if(numero <=9)
     {
         
       JOptionPane.showMessageDialog(null,"El numero tiene una cifra");
         
     } 
     
     else if(numero >=10 && numero <=99)
     {
         
       JOptionPane.showMessageDialog(null,"El numero tiene dos cifras");
         
     }
     
     else if(numero >=100 && numero <=999)
     {
         
       JOptionPane.showMessageDialog(null,"El numero tiene tres cifras");
         
     }
     
     else if(numero >=1000 && numero <=9999)
     {
         
       JOptionPane.showMessageDialog(null,"El numero tiene cuatro cifras");
         
     }
     
     else if(numero >=10000 && numero <=99999)
     {
         
       JOptionPane.showMessageDialog(null,"El numero tiene cinco cifras");
         
     }
     
     else{
         
        JOptionPane.showMessageDialog(null,"No esta en el rango"); 
         
  }
     
     }
    
    }

