
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class Horas_totales_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //CONSTRUIR UN PROGRAMA QUE DADO UN NUMERO TOTAL DE HORAS DEVEUELVE EL 
        //NUMERO DE SEMANAS,DIAS Y HORAS EQUIVALENTES.POR EJEMPLO, DADO UN TOTAL DE 1000 HORAS
        //DEBE MOSTRAR 5 SEMANAS,6 DIAS Y 16 HORAS
        Scanner entrada= new Scanner(System.in);
        int horastotales,semanas,dias,horas;
        
        System.out.println("Digite el numero de horas: ");
        horastotales=entrada.nextInt();
        
        //PROCESO
        semanas = horastotales /168;
        dias = horastotales %168/24;
        horas = horastotales % 24;
        
        //resultado
        System.out.println("\nEl equivalente es: ");
        System.out.println("semanas : "+semanas);
        System.out.println("semanas : "+dias);
        System.out.println("semanas : "+horas);
        
    }
    
}

