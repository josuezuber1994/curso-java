
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class tecleeumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pedir numeros hasta que se teclee uno negativo,
       //y mostrar cuantos numeros se han introducido
       
     int numero, cont = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while(numero >= 0){
            JOptionPane.showMessageDialog(null,"Ha ingresado el numero: "+numero);
            cont++;
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        JOptionPane.showMessageDialog(null,"Numero no vÃ¡lido. IngresÃ³ un total de "+cont+" numeros.");
    }
}
