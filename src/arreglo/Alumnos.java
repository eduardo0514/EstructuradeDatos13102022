/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo;

/**
 *
 * @author lenovo
 */
public class Alumnos {
     private String nombre;
    private int edad;
    private int numero_de_cuenta;

    public Alumnos() {
    }

    public Alumnos(String nombre, int edad, int numero_de_cuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(int numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", edad=" + edad + ", numero_de_cuenta=" + numero_de_cuenta + '}';
    }
    
}
