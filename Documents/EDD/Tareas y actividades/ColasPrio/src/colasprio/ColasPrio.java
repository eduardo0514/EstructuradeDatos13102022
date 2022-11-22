/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasprio;

import java.util.PriorityQueue;

/**
 *
 * @author lenovo
 */
public class ColasPrio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        pq.add(5);
        pq.add(1);
        pq.add(7);
        pq.add(3);
        pq.add(9);
        pq.add(8);
        pq.add(4);
        
        
        System.out.println(pq);
        
        pq.poll();
        pq.add(10);
        pq.add(1);
        System.out.println(pq);
    }
    
}
