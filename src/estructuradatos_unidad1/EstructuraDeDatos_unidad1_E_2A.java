/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradatos_unidad1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DERWIN
 */
public class EstructuraDeDatos_unidad1_E_2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
         String caracteristicas[]= new String[5];
        Scanner teclado=new Scanner(System.in);
        System.out.println("inserte las caracteristicas");
        String entrada1=teclado.nextLine();
                System.out.println("inserte las caracteristicas");
        String entrada2=teclado.nextLine();
                System.out.println("inserte las caracteristicas");
        String entrada3=teclado.nextLine();
                System.out.println("inserte las caracteristicas");
        String entrada4=teclado.nextLine();
                System.out.println("inserte las caracteristicas");
        String entrada5=teclado.nextLine();
        
        
        caracteristicas[0]=entrada1;
        caracteristicas[1]=entrada2;
        caracteristicas[2]=entrada3;
        caracteristicas[3]=entrada4;
        caracteristicas[4]=entrada5;
        
        for(int i=0;i<5;i++){}
       
            
          
        System.out.println("los caracteristicas ingresadas fueron "+Arrays.toString(caracteristicas));
        
          
        
        String dataStructs[]={"pilas", "colas", "listas", "mapas", "conjuntos"};
        System.out.println( );
        System.out.println("los elementos del arreglo dataStructs son " +Arrays.toString(dataStructs));
        
        
        
        
    }
        
    }
    
    

