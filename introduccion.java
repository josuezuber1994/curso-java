
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class introduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Entrada y salida de datos joptionpane
        String cadena;
        int entero;
        char letra;
        double decimal;

        // ventanas Etrada de Datos joptionpane
        cadena = JOptionPane.showInputDialog("Digite su nombre");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));//para numero entero
        letra = JOptionPane.showInputDialog("Digite un caracter").charAt(0);//Declaracion de char
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));//para numero decimal

        //Salida de datos por ventanas emergentes
        JOptionPane.showMessageDialog(null, "La Cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El Numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El Caraceter es: " + letra);
        JOptionPane.showMessageDialog(null, "El Decimal es: " + decimal);
    }

}

