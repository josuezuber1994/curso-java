
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ERICK
 */
public class kg_peso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // HACER UN PRORAMA QUE PASE DE KG A OTRA UNIDAD DE MEDIDA DE MASA, MOSTRAR
        //EN UNA PANTALLA UN MENU CON LAS OPCIONES POSIBLES
        
        int cantidadKilo, opciones;
        float tone, gramo, centi, hecto, deca;
        
        
        opciones = Integer.parseInt(JOptionPane.showInputDialog("Escoja la conversiÃ³n que desea realizar : \n"
                + "1. Kilogramo a Toneladas \n"
                + "2. Kilogramo a Gramos \n"
                + "3. Kilogramo a CentÃ­gramo \n"
                + "4. Kiolgramo a Hectogramo \n"
                + "5. Kilogramo a Decagramo \n"
                + "6. Salir"));
        
        switch(opciones){
            
            case 1: cantidadKilo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Kilogramos que tiene : "));
            tone = cantidadKilo / 1000;
            JOptionPane.showMessageDialog(null, "Usted tiene " + tone + " toneladas" );
            break;
            
            case 2: cantidadKilo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Kilogramos que tiene : "));
            gramo = cantidadKilo * 1000;
            JOptionPane.showMessageDialog(null, "Usted tiene " + gramo + " gramos" );
            break;
            
            case 3: cantidadKilo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Kilogramos que tiene : "));
            centi = cantidadKilo * 100000;
            JOptionPane.showMessageDialog(null, "Usted tiene " + centi + "centigramos");
            break;
            
            case 4: cantidadKilo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Kilogramos que tiene : "));
            hecto = cantidadKilo * 10;
            JOptionPane.showMessageDialog(null, "Usted tiene " + hecto + "hectogramos");
            break;
            
            case 5: cantidadKilo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Kilogramos que tiene : "));
            deca = cantidadKilo * 100;
            JOptionPane.showMessageDialog(null, "Usted tiene " + deca + " decagramos");
            break;
            
            case 6: break;
            
            default: JOptionPane.showMessageDialog(null, "Escoje una conversion correcta reconchadetumadre");
            
        }
    }
    
}

