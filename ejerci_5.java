
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class ejerci_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //entrada de datos
        Scanner entrada = new Scanner(System.in);
        //declaracion de la variable
        char letra;
        //el usuario pueda introducir y presentacion de mensaje
        System.out.print("Digite una letra: ");
        //para que el usuario pueda introducir datos
        letra = entrada.next().charAt(0);
        //presentacion por pantalla 
        System.out.print("La cadena es: " + letra);
    }

}

