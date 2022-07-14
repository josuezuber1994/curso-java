
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class condicionales_salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // UN OBRERO NECESITA CALCULAR UN SALARIO SEMANAL, EL CUAL OBTIENE
        //DE LA SIGUIENTE MANERA: SI TRABAJA 40 HORAS O MENOS SE LE PAGA $16 POR HORA
        //SI TRABAJA MAS DE 40 HORAS SE LE PAGA $16 POR CADA UNA DE LAS PRIMERAS 40 HORAS
        // Y $20 POR CADA HORA EXTRA
        
        int horastrabajadas;
        float salariototal;
        
        horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas"));
        
        if (horastrabajadas<=40) {
            
            salariototal=horastrabajadas*16;
        }
        else{
            salariototal =(40*16)+ ((horastrabajadas-40)*20);
        }
        
        JOptionPane.showMessageDialog(null, "El sueldo total es: "+salariototal);
    }
    
}
