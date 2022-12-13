/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap {
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, String> mapaNombres=new HashMap<Integer, String>();
        mapaNombres.put(27, "Alejandro");
        mapaNombres.put(25, "Andrea");
        mapaNombres.put(259, "Mateo");
        mapaNombres.put(10, "Arlet");
        mapaNombres.put(123, null);
        
        System.out.println(mapaNombres);
        
        System.out.println(mapaNombres.keySet());
        System.out.println(mapaNombres.values());
        
        mapaNombres.remove(27);
        
        System.out.println(mapaNombres);
        
        System.out.println(mapaNombres.get(259));
        
        if (mapaNombres.containsValue(null)) {
            System.out.println("Efectivamente es null"); 
        }
        
        Iterator<Integer> iterator=mapaNombres.keySet().iterator();
        
        while (iterator.hasNext()) {
            Integer llave = iterator.next();
            System.out.println(llave+" - "+mapaNombres.get(llave));
        }
    }
    
}
