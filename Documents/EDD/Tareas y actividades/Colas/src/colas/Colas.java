/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, nodo_informacion = 0;
        ColaP cola = new ColaP();
        
        do {            
            try {
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones\n\n"
                                + "1. Insertar un nodo\n "
                                + "2. Extrar un nodo\n"
                                + "3. Mostrar contenido de la cola\n "
                                + "4. salir.\n\n"));
                
                switch (opcion) {
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null, "por favot ingresa el valor a guardar en el nodo"));
                        cola.Insertar(nodo_informacion);
                        break;
                    case 2:
                        if (!cola.ColaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: " + cola.extraer());
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia");
                        }
                        break;
                    case 3:
                        cola.MostrarContenido();
                        break;
                    case 4:
                        opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no disponible");
                        break;
                        
                }
                
            } catch (NumberFormatException e) {
            }
            
        } while (opcion != 4);
    }
    
}
