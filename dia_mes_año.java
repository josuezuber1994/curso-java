
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class dia_mes_año {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // PEDIR EL DIA MES Y AÃ‘O DE UNA FECHA E INDICAR SI LA FECHA ES CORRECTA
        //CON MESES DE 28 30 Y 31 DIAS SIN AÃ‘OS BISIETOS
        
        int dia, mes, año;
  
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dÃ­a: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el aÃ±o: "));

        if (dia >= 1 && dia <= 31) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    if (mes == 2 && dia <= 28) {
                        JOptionPane.showMessageDialog(null, "la fecha: " + dia + " - " + mes + " - " + año + " es correcta");
                    } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                        JOptionPane.showMessageDialog(null, "la fecha: " + dia + " - " + mes + " - " + año + " es correcta");
                    } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                        JOptionPane.showMessageDialog(null, "la fecha: " + dia + " - " + mes + " - " + año + " es correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "Fecha incorrecta, dÃ­a incorrecto");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, aÃ±o incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, dÃ­a incorrecto");
        }

    }

}
