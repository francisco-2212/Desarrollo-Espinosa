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
public class condicioales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        System.out.println("ingrese un numero y le mostrare los multiplos de 5");
        int num=teclado.nextInt();
        int i;
        for(i=0;i<=num;i++){
            if(i%5==0)
                System.out.println(i);
            
        }
    }
    
}
