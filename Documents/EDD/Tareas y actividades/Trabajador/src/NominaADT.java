

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class NominaADT {
    private BufferedReader Lector;
    private String linea;
   
    private String partes[]=null;
    public void LeerArchivos(String NombreArchivo){
        try{
            Lector = new BufferedReader(new FileReader(NombreArchivo));
        while((linea=Lector.readLine())!=null){
                partes = linea.split(",,");
            
                
                imprimirlinea();
                System.out.println();
        }
            
        
            Lector.close();
            linea=null;
            partes=null;
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void imprimirlinea(){
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]+"/");

        }
      
    }
}
