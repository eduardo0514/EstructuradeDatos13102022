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
        
        
        
        
        alumno [0].getNombre();
        alumno[1].getNombre();
        for (Alumnos estudiante : alumno) {
            System.out.println( estudiante );
        }
        System.out.println("-----");

        for(int i=0; i<alumno.length ; i++){
            
        }
        
         
   
    
    System.out.println("----metodos de retorno para el alumno 0------");
        System.out.println(alumno[0].getNombre());
        //System.out.println(alumno[0].getClass());
        System.out.println(alumno[0].getEdad());
        System.out.println(alumno[0].getNumero_de_cuenta());
        
        
        System.out.println("metodos de retorno para el alumno 1");
        
        System.out.println(alumno[1].getNombre());System.out.println(alumno[1].getEdad());System.out.println(alumno[1].getNumero_de_cuenta());
        
        
        System.out.println("-----metodos de regreso para el segundo alumno ");
        System.out.println(alumno[2].getEdad());System.out.println(alumno[2].getNombre());System.out.println(alumno[2].getNumero_de_cuenta());
        
        
        System.out.println("-----------------metodos de retorno para el 3er alumno ");
        System.out.println(alumno[3].getNombre());System.out.println(alumno[3].getEdad());System.out.println(alumno[3].getNumero_de_cuenta());
        
        
        System.out.println("----------------metods de retorno para el 4to alumno----------------");
        System.out.println(alumno[4].getEdad());System.out.println(alumno[4].getNombre());System.out.println(alumno[4].getNumero_de_cuenta());
        
        System.out.println("----metodos de set para el alumno 0 y sus nuevos valores ");
       alumno[0].setNumero_de_cuenta(585858);System.out.println(alumno[0].getNumero_de_cuenta());
       alumno[0].setNombre("el pepe"); System.out.println(alumno[0].getNombre());
       alumno[0].setEdad(19);System.out.println(alumno[0].getEdad());
       
       
       
        System.out.println("-metodos de set para el alumno 1 y sus nuevos valores");
        alumno[1].setNumero_de_cuenta(15462137);System.out.println(alumno[1].getNumero_de_cuenta());
       alumno[1].setNombre("ete sech"); System.out.println(alumno[1].getNombre());
       alumno[1].setEdad(29);System.out.println(alumno[1].getEdad());
        
        System.out.println("  ---------metodos de set para el alumno 2 y sus nuevos valores-----");
        alumno[2].setNumero_de_cuenta(12345678);System.out.println(alumno[2].getNumero_de_cuenta());
       alumno[2].setNombre("Mondragon"); System.out.println(alumno[2].getNombre());
       alumno[2].setEdad(16);System.out.println(alumno[2].getEdad());
       
       
        System.out.println("  ---------metodos de set para el alumno 3 y sus nuevos valores-----");
        alumno[3].setNumero_de_cuenta(678901);System.out.println(alumno[3].getNumero_de_cuenta());
       alumno[3].setNombre("JIMMY NEUTRON"); System.out.println(alumno[3].getNombre());
       alumno[3].setEdad(16);System.out.println(alumno[3].getEdad());
          System.out.println("  ---------metodos de set para el alumno 4 y sus nuevos valores-----");
        alumno[4].setNumero_de_cuenta(4);System.out.println(alumno[4].getNumero_de_cuenta());
       alumno[4].setNombre("N"); System.out.println(alumno[4].getNombre());
       alumno[4].setEdad(16);System.out.println(alumno[4].getEdad());
    
      
    }
   
    
    
}
