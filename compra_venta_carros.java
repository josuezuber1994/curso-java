
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class compra_venta_carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //UNA COMPAÃ‘IA DE VENTA DE CARROS USADOS PAGA A SU PERSONAL DE VENTAS UN SALARIO DE 100 MENSUALES
        //MAS UNA COMISION DE 150 POR CADA CARRO VENDIDO MAS EL %5 DEL VALOR 
        // DE LA VENTA POR CARRO CADA MES EL CAPTURISTA DE LA EMPRESA INGRESA EN LA COMPUTADORA
        //DE DATOS PERTINENTES HACER UN PROGRAMA QUE CALCULE EL SALARIO MENSUAL DE UN VENDEDOR
       Scanner entrada = new Scanner(System.in);
        double salario = 1000;
        double comision, porcentajeVentaxCarro, cantCarros,sumCarros, salarioFinal;
        
        
        System.out.println("Ingrese cantidad de carros vendidos: ");
        cantCarros = entrada.nextDouble();
        System.out.println("Ingrese suma total del dinero de carros que haya vendido");
        sumCarros = entrada.nextDouble();
        
        comision = cantCarros*150;
        porcentajeVentaxCarro = (sumCarros*0.05);
        salarioFinal = salario + comision + porcentajeVentaxCarro;
        
        System.out.println("El salario Final es : " + salarioFinal);
        
    }
}
    
    


