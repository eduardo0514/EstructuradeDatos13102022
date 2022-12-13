/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedhashmap;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap {
    public static void main(String[] args) {
 Map<Integer,String> linked = new LinkedHashMap<Integer, String>();   
 linked.put(25, "Mateo"); 
 linked.put(12, "Andrea"); 
 linked.put(10, "Alejandra"); 
 linked.put(5, "Jaime"); 
  
 System.out.println(linked); 
 

 System.out.println("se obtine a : "+linked.get(25));
 

 linked.remove(5); 
 System.out.println(linked); 

 linked.replace(10, "Alejandra"); //se hace un remplazo   System.out.println(linked); 

 linked.remove(12,"Andrea"); 
 System.out.println(linked);  

 linked.clear(); 
 if (linked.isEmpty()){ 
 System.out.println("No hay nada");  } 
    }
    
}
