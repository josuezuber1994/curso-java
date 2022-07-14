
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class ciclo_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //CICLO FOR INICIALIZACION; CONDICION; AUMENTO O DECREMENTO
        Scanner entrada = new Scanner(System.in);
        int  contador;
        System.out.println("Digite la cantidad de terminos: ");
        contador= entrada.nextInt();
        
        for (int i=1; i<=contador; i++){
            System.out.println(i);
            
        }
    }
    
}
