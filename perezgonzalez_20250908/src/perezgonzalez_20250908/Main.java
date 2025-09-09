/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perezgonzalez_20250908;
import java.util.Scanner;

/**
 *
 * @Gonzalez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //tamaño del arreglo
        int cantidad_elementos = 5;
        
        
        int [] numeros_ordenados = new int [cantidad_elementos];
        int [] numeros_desordenados = new int [cantidad_elementos];
        
        
         //creacion e instancia del objeto scanner
        Scanner sc = new Scanner(System.in);
        //notificacion al usuario del valor
        System.out.println("por favor ingrese "+cantidad_elementos+" numeros enteros de manera desordenada");
        
        //se recorre el arreglo de los valores digitados
        for(int i = 0; i<numeros_desordenados.length; i++){
            
            //se solicita al usuario un valor 
          System.out.print("Digite el elemento "+(i+1)+" : ");
          
          //se digita un  valor desde el teclado entero
          numeros_desordenados[i] = sc.nextInt();
        }
         System.out.println("Usted digito los siguientes numeros: ");
                 
                 for (int j=0; j<numeros_desordenados.length; j++) {
                     
                     
                     
                
                   System.out.print(numeros_desordenados[j]+" ");
                 }  
            //SALTO DE LINEA     
            System.out.println(); 
             //INVOCAMOS LA FUNCION SPARA ORDENAR EL ARREGLO
            numeros_ordenados = ordenar(numeros_desordenados);
           //IMPRIMIMOS AL SDALIDA AL USUARIO
            System.out.println("Los numeros ordenados son: ");
            
            /*
            se recorre el arreglo para 
            obtener cada valor del arreglo ordenado
            */
            for(int k=0; k<numeros_ordenados.length; k++){
                //se imprime
                System.out.print(numeros_ordenados[k]+ " ");
                
            }
     }
    //FUNCION PARA ORDENAR UN ARREGLO UNIDEMENSIONAL
     public static int[] ordenar(int[] arreglo){
         
     //SE RECORRE EL ARREGLO PARA EVALUAR CADA POSICION
         for (int i=0; i< arreglo.length - 1; i++){
             
             /*
             SE HACE UN SEGUNDO RECORRIDO PARA PODER COMPARAR 
             LA POSICION ACTUAL CON LA POSICION SIGUIENTE
             */
             for(int j=0; j<arreglo.length -1; j++){
                // System.out.println(arreglo[j]);
                
                /*
                SE EVALUA EL VALOR DE 
                CADA ELEMENTO
                */
                if(arreglo[j]> arreglo[j+1]){
                    
                    /*
                    SI ES MAYOR,SE CREA UNA VARIABLE PARA ALMACENAR 
                    EL VALOR DEL ELEMENTO MAYOR
                    */
                    int mayor=arreglo[j];
                    
                    //SE CAMBIA LA POSICION DEL ELEMENTO ACTUAL
                    arreglo[j] = arreglo[j+1];
                    
                    /*
                    SE INTERCAMBIA LA POSICION DEL ELEMENTO 
                    ASGINANDO EL VALOR MAYOR 
                    */
                    arreglo[j+1] =mayor;
                }
             }

     }
        
     
      return arreglo;
    }
}