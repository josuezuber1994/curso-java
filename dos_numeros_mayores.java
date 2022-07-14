
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class dos_numeros_mayores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //PEDIR DOS NUMEROS Y DECIR CUAL ES EL MAYOR O SI SON IGUALES
        int numero1 ;
        int numero2 ;
        
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        
       if (numero1 == numero2) {            

            JOptionPane.showMessageDialog(null, "Los nÃºmeros son iguales");            

        }
       
       else{            
          if (numero1 > numero2) {
          JOptionPane.showMessageDialog(null, "El nÃºmero "+numero1+", es mayor que el nÃºmero "+numero2);
          
         }else{                
         JOptionPane.showMessageDialog(null, "El nÃºmero "+numero2+", es mayor que el nÃºmero "+numero1);    
         
         }
            
    }
       
    }
    
}

