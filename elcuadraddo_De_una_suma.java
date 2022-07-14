
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class elcuadraddo_De_una_suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //HACER UN PROGRAMA QUE EL CUADRADO DE UNA SUMA
       //(A +B)2 =A2 + B2 +2AB
       Scanner entrada = new Scanner(System.in);
         int num1, num2,resultado;
         
       System.out.println("introduce el primer digito: ");
       num1 = entrada.nextInt();
       System.out.println("Introduce el segundo numero: ");
       num2 = entrada.nextInt();
  
       num1 *= 2;
       num2 *= 2;
  
       resultado = (num1 + num2)*2;
  
     System.out.println(" el resultado de la suma al cuadraro es "+resultado);



    }
    
}

