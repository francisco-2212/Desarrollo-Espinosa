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
public class ejercicioForWhileDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int numero1;
       int numero2;
       int mayor;
       int menor;
    
      do{System.out.println("ingrese un numero");
        numero1=entrada.nextInt();
        System.out.println("ingrese otro numero");
        numero2=entrada.nextInt();
       if (numero1==numero2);
          System.out.println("intoduce numeros distinos");
      }while(numero1==numero2);
          if (numero1>numero2){
              mayor=numero1
              menor=numero2
                      }
          else{
              mayor=numero2
              menor=numero1
                      }
                      
          System.out.println("el mayor en"+mayor);
          System.out.println("el menor es"+menor);
          
          
                              
          }
}      

         
         
    
