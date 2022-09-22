/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntoadt;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ConjuntoADT {
        public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de elementos de A: ");
        int tA=leer.nextInt();
        System.out.println("Ingrese el numero de elementos de B: ");
        int tB=leer.nextInt();
        
        int[]A=new int[tA];
        int[]B=new int[tB];
        
        System.out.println("Ingrese elementos de A:");
        for (int i = 0; i < A.length; i++) {
            A[i]=leer.nextInt();
        }
        
        System.out.println("Ingrese elementos de B:");
        for (int i = 0; i < B.length; i++) {
            B[i]=leer.nextInt();
        }
        
        int [] U= Union(A,B);
        int [] I= Interseccion(A, B);
        
        System.out.println("Los elementos de la union son: ");
        for (int i = 0; i < U.length; i++) {
            System.out.println(U[i]);
            
        }
        
        System.out.println("Los elementos de la interseccion son: ");
        for (int i = 0; i < I.length; i++) {
            System.out.println(I[i]);
            
        }
        
         

    } 
   public static Boolean existe(int[] Conjunto, int Elemento)
   {
       Boolean existe = false;
       
       for (int i = 0; i < Conjunto.length; i++) {
           {
               if (Conjunto[i]==Elemento) {
                   existe=true;
               }
           }
           
       }
       return existe;
   }
   
   public static int[] Union(int[]A, int[]B)
   {
       int []U = new int[A.length+B.length];
       for (int i = 0; i < A.length; i++) {
           U[i]=A[i];
           
       }
       int x=0;
       int r=0;
       for (int i = 0; i < B.length; i++) {
           if (existe(U,B[i])==false) {
               U[A.length+x]=B[i];
               x++;
           }
           else
           {
               r++;
           }
       }
       int [] Auxiliar= U;
       U= new int [Auxiliar.length-r];
       
       for (int i = 0; i < U.length; i++) {
           U[i]= Auxiliar[i];
       }
       return U;
   }
   
   public static int[] Interseccion(int[]A,int[]B){
  int conta= 0;
      for (int i = 0; i < A.length; i++)
      {
          if(existe(B, A[i])==true)   
          {
         conta++;
          }
          if(A[i]==B[i])
          {
              System.out.println("Son subconjuntos");
          }
          else{
              System.out.println("No existe un Subconjunto");
          }
      }
        
        
        int[]I=new int[conta];
        int x=0;
        for (int i = 0; i < A.length; i++) {
          if(existe(B, A[i])==true){
              I[x]=A[i];
              x++;
               
           }
       }
       return I;
   }
        
        
    }
    

