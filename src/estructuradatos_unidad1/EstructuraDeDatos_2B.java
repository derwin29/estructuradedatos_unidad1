/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradatos_unidad1;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author DERWIN
 */
public class EstructuraDeDatos_2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorio=new Random();
        int tamaño=aleatorio.nextInt(10)+1;
        int ventas[]=new int[tamaño];
        
        for(int i=0; i<ventas.length;i++){
        ventas[i]=aleatorio.nextInt(1000)+1; }
        
       
       
        
        
        
            System.out.println( );
            
            System.out.println("cantidades de ventas "+ ventas.length);      
            
            
            for (int venta:ventas){
            
            System.out.println("los valores de las ventas son "+venta);
            
            
            
            
            
            
    }
            
            int total1=0;
            for (int total:ventas){
                total1+=total;}
                
                System.out.println("el total de las ventas son  " +total1);
                
    
                
                
                
             double x;   
            x=total1/ventas.length;
                
                
            
            System.out.println("promedio de las ventas "+ x);
            
            int ventamasalta = ventamasaltabuscar(ventas);
            System.out.println(" la ventas mas alta fue "+ ventamasalta);
            
            int ventamasbaja = ventamasbajabuscar(ventas);
            System.out.println(" la venta mas baja fue "+ ventamasbaja);
            
            int cercanapromedio =obtenerventascercanapromedio(ventas);
            System.out.println("la ventas mas cercana al promedio es "+cercanapromedio);
            
            System.out.println("Ventas ordenadas en orden ascendente:");ordenarventaascendente(ventas);
            
            
            System.out.println("ventas ordenadas en forma descedente");ordenarventadescendente(ventas);
            
            
            System.out.println("ventas desordenadas");desordenarventas(ventas);
            
            System.out.println("ventas ordenadas par e impar");ordenarvtapareimpar(ventas);
            
            
            
            
            
            
            
            
            
            
    }
            
        
            public static int ventamasaltabuscar(int ventas[]){
                int ventamasalta=ventas[0];
                for (int x=1;x<ventas.length;x++)
                {if  (ventas[x]>ventamasalta)
                {ventamasalta = ventas[x];
               
                        }
              
                }                
              return ventamasalta;  
              
             
            }
            
            public static int ventamasbajabuscar(int[]ventas){
                int ventamasbaja=ventas[0];
                for (int x=1;x<ventas.length;x++)
                {if  (ventas[x]<ventamasbaja)
                {ventamasbaja = ventas[x];
                }
}
                 return ventamasbaja;
                 
                 
                      
                 
            }
            
            
                public static int ventatotalobtener(int[]ventas){
                int totalventas=0;
                for (int x=0;x<ventas.length;x++)
                    
                {totalventas+=ventas[x];}

                 return totalventas;
           
                 
}
                
                public static double ventapromedioobtener(int[]ventas){
                double promedioventas=0;
                for (int venta: ventas)
                {promedioventas+=venta;}



                 return promedioventas/ventas.length;
                 
                 
                 
     }

                
                
                public static int obtenerventascercanapromedio (int[]ventas){
                double promedio = ventapromedioobtener(ventas);
                int ventacercanapromedio = ventas [0];
                double difminima = Math.abs (ventas[0]-promedio);
                for (int i=1; i<ventas.length; i++){
                double dif = Math.abs(ventas[i]-promedio);
                        if (dif<difminima)
                        {difminima=dif;
                        ventacercanapromedio=ventas[i];
                        }
                                
                                
                }
               


  return ventacercanapromedio;
                

          }
                 
                
             public static void ordenarventadescendente (int[]ventas){
                    
             Arrays.sort(ventas);
        int n = ventas.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = ventas[i];
            ventas[i] = ventas[n - i - 1];
            ventas[n - i - 1] = temp;}
            
            for (int resultado:ventas){
            System.out.println(resultado);
        }   
             }
                     
           public static void ordenarventaascendente (int[]ventas){
                    
             Arrays.sort(ventas);
                
             for (int venta:ventas){System.out.println(venta);}
              }
            
            
           
           
           
           
             public static void desordenarventas (int[]ventas){
             Random alea=new Random(); 
        int n = ventas.length;
        for (int x = 0; x < n; x++) {
            int orden =alea.nextInt(n);
           int  vta =ventas[x];
           ventas [x]= ventas [orden];
           ventas [orden]= vta;
        }
           
           for (int resultado : ventas) {
            System.out.println(resultado);}
           
           
           
           
           
}
             
             public static void ordenarvtapareimpar (int[]ventas){
             int [] par = new int [ventas.length];
             int [] impar =  new int [ventas.length];
             
             int parescta =0;
             int imparcta =0;
             for (int i=0;i< ventas.length;i++){
             if (ventas[i]%2==0){
             
             par[parescta]=ventas[i];
             parescta++;
             }
             else {
             impar[imparcta]=ventas[i];
             imparcta++;
             }
             }
                 Arrays.sort(par, 0, parescta);
        Arrays.sort(impar, 0, imparcta);

        System.arraycopy(par, 0, ventas, 0, parescta);
        System.arraycopy(impar, 0, ventas, parescta, imparcta);
             

        for (int venta : ventas) {
            System.out.println(venta);
        }
    }
             
}       
             
             
             

             



              
                


    
   