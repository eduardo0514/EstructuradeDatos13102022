/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap {

    public static void main(String[] args) {
        
        
        Map<Integer, String> treemap = new TreeMap<Integer,String>();
        
        treemap.put(1, "Leon");
        treemap.put(5, "Cebra");
        treemap.put(3, "Caballo");
        treemap.put(7, "Jaguar");
        treemap.put(2, "Tigre");
        treemap.put(4, "Lobo");
        
        
        System.out.println(treemap);
    }
    
}
