
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class horas_laboradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //REALIZAR UN PORGRAMA QUE CALCULE E IMPRIMA EL SALARIO SEMANAL DE UN EMPLEADO A PARTIR DE SUS HORAS SEMANALES
     //TRABAJADAS Y DE SU SALARIO POR HORA
     Scanner entrada = new Scanner (System.in);
     float salario, horaLaborada, total;
     
      System.out.print("Escribe el salario por hora y la cantidad de horas laboradas: ");
      
      salario = entrada.nextFloat();
      horaLaborada = entrada.nextFloat();
      total = salario * horaLaborada;
      System.out.print("\n El salario que se le debe es: " + total);
    }
    
}
