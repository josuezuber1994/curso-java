
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class condici_dosnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // HACER UN PROGRAMA QUE TOME DOS NUMEROSY DIGA SI AMBOS SON PARES E IMPARES
        int numero1,numero2;
        
        JOptionPane.showMessageDialog(null,"Este programa le dira si los numeros ingresados son Par o Impar");
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        
        if(numero2%2==0&&numero1%2==0){
            JOptionPane.showMessageDialog(null, "Ambos son numeros Par");
        }
        else if(numero1%2==0){
            JOptionPane.showMessageDialog(null,"El numero "+numero1+" es Par y el numero "+numero2+" es Impar");
        }
        else if(numero2%2==0){
            JOptionPane.showMessageDialog(null,"El numero "+numero2+" es Par y el numero "+numero1+" es Impar");
        }
        else{
           JOptionPane.showMessageDialog(null,"Ambos numeros son Impar");
        
        }

        
    }
    
}

