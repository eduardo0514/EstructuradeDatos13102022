/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                int opcion = 0, nodo = 0;
        Pila pila= new Pila();
        
        do {            
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Menu de opciones\n\n"
                        + "1. Insertar un nodo\n" 
                        + "2. Eliminar un nodo\n"
                        + "3. ¿La pila esta vacia?\n"
                        + "4. ¿Cual es el ultimo valor ingresado en la pila?\n"
                        + "5. ¿Cuantos nodos tiene la pila?\n"
                        + "6. Vaciar pila\n"
                        + "7. Mostrar contenido de la pila\n"
                        + "8. Salir\n\n"));
                
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del nodo a guardar"));
                        pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null,"Seha a eliminado un nodo con el valor: " + pila.EliminarNodo());
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        
                        break;
                    case 3:
                        if (pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila no esta vacia");
                        }
                        break;
                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es, " + pila.MostrarUltimoValorIngresado());
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene" + pila.TamanoPila() + "nodos");
                        break;
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        
                        }else{
                            JOptionPane.showMessageDialog(null, "la pila esta vacia");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelve a intentar nuevamente");
                        break;
                }
            } catch (NumberFormatException e) {
            }
            
        }while (opcion != 8); 
        
    }
    
}
