/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author pc07
 */
public class ejercicoFo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("ingrese numero del 1 al 100");
        numero=entrada.nextInt();
        for(int i=numero;i<100;i++)
            System.out.println(i);
        
        
    }
    
}
