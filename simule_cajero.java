
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class simule_cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hacer un programa que simule un cajero automatico con un saldo inicial de 1000
        //dolares con las siguientes menu de opciones:
        //ingresar dinero a la cuenta,//retirar el dinero a la cuenta, // salir
        
        final int saldo_inicial=1000;
        int opcion;
        float ingreso,saldoactual,retiro;
        
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
        +"1.Ingrese dinero a la cuenta\n"
        +"2.Retirar el dinero a la cuenta\n"
        +"3.Salir"));
        
        switch(opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta: "));
            saldoactual = saldo_inicial+ingreso;
            JOptionPane.showMessageDialog(null, "Dinero actual"+saldoactual);
            break;
            
            case 2: retiro = ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desee retirar: "));
            
                if (retiro>saldo_inicial) {
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para este retiro");
                }
                else {
                    saldoactual = saldo_inicial-retiro;
                    JOptionPane.showMessageDialog(null, "Dinero actual: "+saldoactual);
                }
                break;
            case 3: break;
            
            default: JOptionPane.showMessageDialog(null, "Se equivoco de opcion en menu: ");break;
            
                
            
        }
        
    }
    
}

