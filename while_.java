
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class while_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ciclos while
        Scanner entrada=new Scanner (System.in);
        int i=0,contador;
        
        System.out.print("Cuantos numeros quiere en pantalla:");
        contador=entrada.nextInt();
        
        while(i<=contador){
            System.out.println(i);
            i+=2;
        }
    }
    
}

