
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // OPERADORES ARITMETICOS 
        Scanner entrada = new Scanner(System.in);

        //DIGITA AL USUARIO DOS NUMEROS
        float numero1, numero2, suma, resta, multi, divi, resto;
        System.out.print("Digite dos numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        //OPERACION
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        divi = numero1 / numero2;
        resto = numero1 % numero2;
        
        //presentacion del resultado
        System.out.println("La suma es: "+suma);
        System.err.println("La resta es: "+resta);
        System.out.println("La Multiplicacion es: "+multi);
        System.out.println("La division es: "+divi);
        System.out.println("El residuo es: "+resto);

    }

}
