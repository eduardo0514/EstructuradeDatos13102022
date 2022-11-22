/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class ColaP {
    private NodoC inicioCola, finalCola;
    String Cola = "";
    
    public ColaP(){
        inicioCola = null;
        finalCola = null;
    }
    
    public boolean ColaVacia(){
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void Insertar(int informacion){
        NodoC nuevo_nodo = new NodoC();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;
        
        if (ColaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
        
    }
    
    
    public int extraer(){
        if (!ColaVacia()) {
            int informacion = inicioCola.informacion;
            
            if (inicioCola == finalCola){
                inicioCola = null;
                finalCola = null;
            } else{
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    
    public void MostrarContenido(){
         NodoC recorrido = inicioCola;
         String ColaInvertida = "";
         
         while(recorrido != null){
             Cola += recorrido.informacion + " ";
             recorrido = recorrido.siguiente;
    }
         
         String cadena [] = Cola.split(" ");
         
         
         for (int i = cadena.length - 1; i >= 0; i--) {
             ColaInvertida += " " + cadena[i];
            
        }
         
         JOptionPane.showMessageDialog(null, ColaInvertida);
         Cola = "";
         
    }
    
}
