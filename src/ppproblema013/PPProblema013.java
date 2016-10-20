/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema013;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double P ,S=0;
      
    int n[]= new int [30];
       Scanner entrada= new Scanner(System.in);
       for(int i=0; i<n.length; i++){
           System.out.println("Introduce el número "+ (i + 1));
           n[i]=entrada.nextInt();
           S= S + n[i];
       }
       P=S/30;
        System.out.println("\nLa suma es:" + S);
        System.out.println("\n El promedio es:" + P);
        
        int mayor=0,menor=0;
        int i=0;
        if(n[i] > P){
            mayor ++;
        }
        else if(n[i]< P){
        menor ++;
        }
            System.out.println("Los números por encima del promerdio son:" + mayor );
            System.out.println("Los números por debajo del promedio son:" + menor );
        }
    }

    
    

