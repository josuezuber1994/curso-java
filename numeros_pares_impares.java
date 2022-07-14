
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class numeros_pares_impares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //LEER NUMEROS HASTA QUE SE INTRODUZCA UN 0, PARA CADA UNO INDICAR
        //SI ES PAR O IMPAR
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while(numero!=0){//mientras el numero sea distinto de 0
            if (numero%2==0) {//el numero es par
            System.out.println("El numero " + numero + " Es par");
            
        }
            else{
                System.out.println("El numero es "+ numero + " impar");
                
            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        
          }      
                   
    }
    
}
