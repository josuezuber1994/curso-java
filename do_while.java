
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // HACER UNA APLICACION QUE PIDA AL USUARIO QUE INGRESE 10 NUMEROS Y QUE DE RESULTADO POR PANTALLA 
        
         Scanner entrada=new Scanner (System.in);
        int i=1,contador;
        System.out.print("Cuantos numeros quiere en pantalla: ");
        contador=entrada.nextInt();
        do{
            System.out.println(i);
            i++;
            
        }while(i<=contador);
        
      
        }
    }
    


