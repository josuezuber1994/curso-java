
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class numeropositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LEER UN NUMERO E INDICAR SI ES POSITIVO O NEGATIVO,
        //EL PROCESO SE REPETIRA HASTA QUE SE INTRODUZCA EL 0 
        
         int numero;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       while(numero != 0){
           if(numero >=1){
               JOptionPane.showMessageDialog(null,"El numero ingresado es positivo.");
           }
           else if(numero <=-1){
               JOptionPane.showMessageDialog(null,"El numero ingresado es negativo.");
           }
           
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
       }
    }
    
}

