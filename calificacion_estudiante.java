
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class calificacion_estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //LA CALIFICACION FINAL DE UN ESTUDIANTE DE INFORMATICA SE CALCULA CON BASE
        //A LAS CALIFICACIONES DE CUATROS ASPECTOS DE SU RENDIMIENTO ACADEMICO
        //PARTICIPACION, PRIMER EXAMEN PARCIAL,SEGUNDO EXAMEN PARCIAL Y EXAMEN FINAL SABIENDO 
        //QUE LAS CALIFICACIONES ANTERIORES ENTRAN A LA CALIFICICACION FINAL CON PONDERACIONES
        //DEL %10,%25,Y %40, HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CALIFICACION FINAL OBTENIDA POR UN ESTUDIANTE.
        
        Scanner entrada = new  Scanner(System.in);
        float participacion, primerexamen, segundoexamen, examenfinal, notafinal;
        
        //pedir los datos necesarios
        System.out.println("Digite la nota de participacion: ");
        participacion=entrada.nextFloat();
        
        System.out.println("Digite la nota del primer examen: ");
        primerexamen=entrada.nextFloat();
        
        System.out.println("Digite la nota del segunda  examen: ");
        segundoexamen=entrada.nextFloat();
        
        System.out.println("Digite la nota del examen final: ");
        examenfinal=entrada.nextFloat();
        
        //procedimiento SACAMOS LOS CALCULOS
        participacion *= 0.10f;
        primerexamen *= 0.25f;
        segundoexamen *= 0.25f;
        examenfinal *= 0.40f;
        
        //SUMAMOS LAS NOTAS
        notafinal = participacion+primerexamen+segundoexamen+examenfinal;
        
       //RESULTADO FINAL
        System.out.println("\n El resultado final: "+notafinal);
         
        
    } 
    
}

