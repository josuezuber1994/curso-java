
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //HACER UN PROGRAMA QUE CALCULE LA SUMA DE 3 CALIFICACIONES de un estudiante
       Scanner entrada = new Scanner(System.in);
       
       //INGRESO DE VARIABLES
       float  nota1,nota2,nota3,suma;
       
       //EL USUARIO DIGITE SUS TRES CALIFICACIONES
        System.out.println("Digite las 3 calificaciones: ");
        nota1= entrada.nextFloat();
        nota2= entrada.nextFloat();
        nota3= entrada.nextFloat();
        
        //La suma de las tres notas
        suma = nota1+nota2+nota3;
        
        //RESULTADO QUE IMPRIMA  LAS 3 NOTAS
        System.out.println("\n La suma es: " +suma);
        
        
        
    }
    
}
 