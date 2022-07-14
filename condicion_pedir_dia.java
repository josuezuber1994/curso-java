
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class condicion_pedir_dia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //PEDIR EL DIA MES Y AÃ‘O DE UNA FECHA E INDICAR SI LA FECHA ES CORRECTA
        //SUPONIENDO QUE TODOS LOS MESES SON 30 DIAS
        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el aÃ±o"));
        
        if ((dia>=1 && dia<=30)) {// SI EL DIA ES CORRECTO
            if ((mes>=1 && mes<=12)) {//SI EL MES ES CORRECTO
                if ((año != 0)) {//SI EL AÃ‘O ES CORRERCTO
                     JOptionPane.showMessageDialog(null, "Fecha es correcta ");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta,El mes es incorrecto ");
                }
            }
            else{
                 JOptionPane.showMessageDialog(null, "Fecha incorrecta, El mes es incorrecto ");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "La Fecha es incorrecta,dia incorrecto. ");
        }
                
    }
    
}
