
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class megaplaza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
           Ejercicio 4:
           En MegaPlaza, se hace un 20% de descuento a los clientes cuya compra supere los
           US$300. Â¿CuÃ¡l serÃ¡ la cantidad que pagarÃ¡ una persona por su compra?
        */
        Scanner entrada = new Scanner(System.in);
        double precio;
        double total;
        double descuento = 1.20;
        System.out.println("ingrese cantidad a pagar: ");
        precio = entrada.nextInt();
        total = precio / descuento;


        if (precio >= 300) {
            System.out.println("tiene descuento del 20%: ");
            System.out.println("El total es a pagar es de: " + total);
            
        } else if (precio <= 299) {
            System.out.println("no hay  descuento");
            System.out.println("El total a pagar es de: " + precio);
        }

    }

}

