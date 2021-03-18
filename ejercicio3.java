/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo.espinosa;
import java.util.Scanner;
/**
 *
 * @author pc07
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       String nombre_alumno;
       double evaluacion1;
       double evaluacion2;
       double evaluacionfinal;
        System.out.println("nombre del alumno");
        nombre_alumno=entrada.nextLine();
        
        System.out.println("nota1ºevaluacion");
        evaluacion1=entrada.nextDouble();
        
        System.out.println("nota2ºevaluacion");
        evaluacion2=entrada.nextDouble();
        
        evaluacionfinal=(evaluacion1+evaluacion2)/2;
        System.out.println("la nota prmedio es"+evaluacionfinal);
        
        
        
        
        
               
       
       
       
    }
    
}
