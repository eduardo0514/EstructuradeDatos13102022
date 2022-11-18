/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Pila {
    private Nodo  UltimoValorIngresado;
    int tamano=0;
    String Lista = "";

    public Pila() {
        
        UltimoValorIngresado = null;
        tamano = 0;
        
    }
    
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
    public void InsertarNodo(int nodo){
       Nodo nuevo_nocdo = new Nodo(nodo);
       nuevo_nocdo.siguiente = UltimoValorIngresado;
       UltimoValorIngresado = nuevo_nocdo;
       tamano++;
    }
    
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    
    public int MostrarUltimoValorIngresado(){
        
        return UltimoValorIngresado.informacion;
        
    }
    
    public int TamanoPila(){
        return tamano;
    }
    
    public void VaciarPila(){
        while (!PilaVacia()) {
            EliminarNodo();
            
        }
    }
            
    
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while (recorrido != null) {
        
        Lista += recorrido.informacion + "\n";
        recorrido = recorrido.siguiente;
           
            
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
    
    
}
