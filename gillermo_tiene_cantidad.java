
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class gillermo_tiene_cantidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //GUILLERMO TIENE N DE DOLARES,LUIS TIENE LA MITAD DE LO QUE POSSE GUILERMO,JUAN TIENE LA MITAD
        //DE LO QUE POSEE LUIS Y LO QUE POSEE JUNTOS, HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CANTIDAD DE DINERO 
        //QUE TIENE LOS TRES.
       
        Scanner entrada = new Scanner (System.in);
        
        float guillermo,juan,luis,total;
        System.out.println("Digite la cantidad de dinero que tiene guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis =guillermo/2;
        juan =(guillermo+luis)/2;
        
        //PROCEDIMIENTO
        total=guillermo+juan+luis;
        
        //Resulatdo por pantalla
        System.out.println("\n La cantidad de dinero "+total);
    }
    
}

