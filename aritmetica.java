
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //OPERACIONES ARITMETICAS
        Scanner entrada = new Scanner(System.in);

        //INGRESO DE VARIABLES
        Float numero1, numero2, suma, resta, multiplicacion, division, resto;

        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero 1: "));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero 2: "));

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;

        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "La division es: " + division);
        JOptionPane.showMessageDialog(null, "La resto es: " + resto);

    }

}
