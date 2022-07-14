
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class char_letra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula
       
       char letra;
       letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
       
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra es mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null, "La letra es minuscula");
        }
       
    }
    
}

