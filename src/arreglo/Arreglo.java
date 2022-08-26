/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author lenovo
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner a1 = new Scanner(System.in);
        
        Alumnos [] alumno = new Alumnos [5];
        alumno [0] = new Alumnos(" Pedro", 18, 324567931);
        alumno [1] = new Alumnos(" Luis", 22, 325678901);
        alumno [2] = new Alumnos(" Jose", 19, 326789123 );
        alumno [3] = new Alumnos(" Mateo", 19, 311234870 );
        alumno [4] = new Alumnos(" Alejandro", 18, 312710960);
        
        for (Alumnos estudiante : alumno) {
            System.out.println( estudiante );
        }
        System.out.println("-----");

        for(int i=0; i<alumno.length ; i++){
            
        }
        System.out.println(alumno.length);
            
        System.out.println("-----");    
        
        System.out.println("Ingrese el nombre de la persona: ");
        
        Array.set(args, 0, alumno);
      
        
         
    }
    
    
}
