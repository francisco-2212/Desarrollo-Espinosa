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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombredeltrabajador;
        double costodehoras;
        double cantidaddehorastrabajadaspormes;
        double salario;
        System.out.println("nombre del trabajador");
        nombredeltrabajador=entrada.nextLine();
        
        System.out.println("costo de horas $");
        costodehoras=entrada.nextDouble();
        
        System.out.println("cantidad de horas por mes");
        cantidaddehorastrabajadaspormes=entrada.nextDouble();
        
        salario=(costodehoras*cantidaddehorastrabajadaspormes*12);
        System.out.println("el salario ANUAL es"+salario);
        
        
    }
    
}
