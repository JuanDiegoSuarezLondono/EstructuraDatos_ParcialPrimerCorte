/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;


import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingrese la cantidad del vector ");
      int dat = teclado.nextInt();
        int arreglo1[]=leerArreglo(dat);
        String cantidad = sCapicuo(arreglo1);
        isCapicuo(cantidad);
        
        
        
        
    }
    
    public static int [] leerArreglo(int cantidad ){
       
        int arreglo [] = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese ["+i+"] = ");
            arreglo[i]= teclado.nextInt();
        }
        return arreglo;
        
    }
    
    public static String sCapicuo(int arreglo[]){
        String numero="";
        int cantidad = arreglo.length;
        
        for (int i = 0; i < cantidad; i++) {
          
            numero+=arreglo[i]+"";
            
        }
        return numero;
    }
    
    public static void isCapicuo(String cadena){
        
        int numero = Integer.parseInt(cadena);
        
        if (isCapi(numero)) {
            System.out.println(" -> Es un numero capicuo");
        }
        else{
            System.out.println(" -> No es un Numero Capicuo");
        }
        
    }
            

    public static boolean isCapi(int n) {
        int r, s = 0, k;
        k = n;
        while (n != 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        System.out.print("el numero invertido es : " + s);
        return s == k; //cupi
    }

}
