
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class pedir_3_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // PEDIR 3 NUMEROS Y MOSTRARLOS Y ORDENARLOS DE MAYOR A MENOR POR PANTALLA
        int n1,n2,n3;
        //Datos que INGRESA EL USUARIO
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));;
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));;
        
        //PROCESO
        if ((n1>n2)&&(n2>n3)) {
            JOptionPane.showMessageDialog(null, "Orden: "+n1+ " - "+n2+ " - "+n3);  
        }
        else if ((n1>n3)&&(n3>n2)){
            JOptionPane.showMessageDialog(null, "Orden: "+n1+ " - "+n3+ " - "+n2);  
        }
         else if ((n2>n1)&&(n1>n3)){
            JOptionPane.showMessageDialog(null, "Orden: "+n2+ " - "+n1+ " - "+n3);  
        }
        else if ((n2>n3)&&(n3>n1)){
            JOptionPane.showMessageDialog(null, "Orden: "+n2+ " - "+n1+ " - "+n3);  
        }
        else if ((n3>n1)&&(n1>n2)){
            JOptionPane.showMessageDialog(null, "Orden: "+n3+ " - "+n1+ " - "+n2);  
        }
        else{
            JOptionPane.showMessageDialog(null, "Orden: "+n3+ " - "+n2+ " - "+n1); 
        }
    }
    
}
