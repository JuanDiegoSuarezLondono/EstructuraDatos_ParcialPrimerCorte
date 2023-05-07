/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodosparcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import sun.java2d.SunGraphics2D;
import sun.java2d.pipe.BufferedRenderPipe;

/**
 *
 * @author suare
 */
public class PuntoDosParcial {

    /**
     * @param args the command line arguments
     */
    
    static int Filas;
    static int Columnas;
    public static void main(String[] args) throws IOException {
        int temporal=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el numero de filas y luego el de columnas");
        Filas=Integer.parseInt(br.readLine());
        Columnas=Integer.parseInt(br.readLine());
        int A[][]= new int[Filas][Columnas];
        int B[][]= new int[Filas][Columnas];;
        
        System.out.println("Para la matriz A");
        for (int i=0;i<Filas;i++) {
            for (int j=0;j<Columnas;j++) {
            System.out.println("Valor Fila "+(i+1)+" Columna "+(j+1));
            A[i][j]=Integer.parseInt(br.readLine());
            }        
        }
        
        System.out.println("Para la matriz B");
        for (int i=0;i<Filas;i++) {
            for (int j=0;j<Columnas;j++) {
            System.out.println("Valor Fila "+(i+1)+" Columna "+(j+1));
            B[i][j]=Integer.parseInt(br.readLine());
            }
        }
        
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println("La matriz A es:");
        graficarMatriz(A);
        System.out.println("La matriz B es:");
        graficarMatriz(B);
        
        for(int i=0;i<Filas;i++) {
            for(int j=0;j<Columnas;j++) {
                for(int k=0;k<Filas;k++) {
                    for(int l=0;l<Columnas;l++) {
                        if(A[i][j]>B[k][l]) {
                        temporal=A[i][j];
                        A[i][j]=B[k][l];
                        B[k][l]=temporal;
                        i=0;
                        j=0;
                        k=0;
                        l=-1;                
                        }
                    }                
                }
            }      
        }
        
        System.out.println("Ordenadas:");
        System.out.println("La matriz A es:");
        graficarMatriz(A);
        System.out.println("La matriz B es:");
        graficarMatriz(B);
        // TODO code application logic here
    }   
    public static void graficarMatriz(int matriz[][]) {
        for (int i=0;i<Filas;i++) {
            for (int j=0;j<Columnas;j++) {
            System.out.print(matriz[i][j]+"\t");
            }        
            System.out.println("");
        }
    }
}
