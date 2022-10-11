/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsl;

/**
 *
 * @author lenovo
 */
public class Nodo {
     Object valor;
    Nodo Siguiente;
    
    public Nodo(Object valor)
    {
        this.valor = valor;
        this.Siguiente = null;
    }
    
    public Object obtenervalor()
    {
        return valor;
    }
    
    public void enlazarSiguiente(Nodo n)
    {
        Siguiente=n;
    }
    
    public Nodo obtenerSiguiente(){
        return Siguiente;
    }
    
}
