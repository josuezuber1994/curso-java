
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //CONSTRUIR UN PROGRAMA QUE SIMULE EL FUNCIONAMIENTO DE UNA CALCULADORA QUE PUEDA REALIZAR LAS 
        //4 OPERACIONES ARITMETICAS BASICAS (SUMA,RESTA,MULTIPLICACION,DIVISION) CON VALORES NUMERICOS ENTEROS
        //EL USUARIO DEBE ESPECIFICAR LA OPERACION CON EL PRIMER CARACTER DEL PRIMER PARAMETRO DE LA LINEA DE COMANDOS
        //S O S PARA LA SUMA ,R O r PARA LA RESTA, P,p,M o m PARA EL PRODUCTO y D o d PARA LA DIVISION
        
        int numero1,numero2,suma,resta,multi,division;
        char operacion;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        operacion = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        
        switch (operacion){
            
            case 's':
            case 'S': suma=numero1+numero2;
            JOptionPane.showMessageDialog(null, "La suma es: "+suma);
            break;
            
            case 'r':
            case 'R': resta=numero1-numero2;
            JOptionPane.showMessageDialog(null, "La resta es: "+resta);
            break;
            
            case 'p':
            case 'P':
            case 'M': multi=numero1*numero2;
            JOptionPane.showMessageDialog(null, "La multiplicacion es: "+multi);
            break;
            
            case 'd':
            case 'D': division=numero1/numero2;
            JOptionPane.showInputDialog(null, "La Division es: "+division);
            break;
            
            default:JOptionPane.showInputDialog(null, "Esta incorrecta la operacion: "); break;
                
              
            
        }
         
        
    }
    
}

