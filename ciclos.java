
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // LERR UN NUMERO Y MOSTRAR SU CUADRADO, REPETIR EL PROCESO HASTA
        //QYE SE INTRODUZCA UN NUMERO NEGATIVO
        int numero,cuadrado;
        //PIDO AL USUARIO QUE DIGITE UN NUMERO
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while (numero>=0){//MIENTRAS EL NUMERO SEA 0 O POSITIVO
            cuadrado = (int)Math.pow(numero,2);//Lo convierto a int
            JOptionPane.showMessageDialog(null, "El numero: " +numero+ " Elevado al cuadrado es: " +cuadrado);
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
            
        }
    }
    
}
