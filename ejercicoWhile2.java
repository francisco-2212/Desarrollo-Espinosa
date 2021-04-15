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
public class ejercicoWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;
        System.out.println("numero del 1 al 100");
        numero=entrada.nextInt();
        int i=numero;
        while(i<=100){
            System.out.println(i); i++;
            
    }
    
}
}
