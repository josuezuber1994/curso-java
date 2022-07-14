
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class coeciente_coeficiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //CONSTRUR UN PROGRAMA QUE CALCULE Y MUESTRE POR PANTALLA LAS RAICES DE LA ECUACION DE SEGUNDO GRADO
        //DE COEFICIENTES REALES AX2 + BX +C =0 
        Scanner entrada = new Scanner(System.in);
        float a=0, b=0, c=0;
    double x1,x2,i;   // i:nÃºmero imaginario
    
    System.out.println("Introduzca el primer coeficiente:");
    a= entrada.nextFloat();
    System.out.println("Introduzca el segundo coeficiente:");
    b= entrada.nextFloat();
    System.out.println("Introduzca el tercer valor");
    c= entrada.nextFloat();
    if(4*a*c>Math.pow(b, 2))
    {
       i=Math.pow(b, 2)-(4*a*c);
       System.out.println("El resultado x1="+(-b/(2*a))+i/(2*a)+"i");
       System.out.println("El resultado x2="+(-b/(2*a))+"-"+i/(2*a)+"i");
       
    } else{
       x1= (-b+(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a);
       x2= (-b-(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a);
       System.out.println("El resultado x1:"+x1);
       System.out.println("El resultado x2:"+x2);
        
    }
    
     }
    
     }

