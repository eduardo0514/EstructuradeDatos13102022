/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Empleados {
    private int numeroTrabajador;
    private String nombre;
    private String paterno;
    private String materno;
    private int horasExtra;
    private double sueldoBase;
    private int anioIngreso;


    public Empleados() {
    }

    public Empleados(int numeroTrabajador, String nombre, String paterno, String materno, int horasExtra, double sueldoBase, int anioIngreso, int Elemento) {
        this.numeroTrabajador = numeroTrabajador;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;

    }

    void setElemento(int i, Empleados datos) {
      
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return "Empleados{" + "numeroTrabajador=" + numeroTrabajador + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", horasExtra=" + horasExtra + ", sueldoBase=" + sueldoBase + ", anioIngreso=" + anioIngreso + '}';
    }

    public static final double Monto_H_Extra = 276.5;
    public static final double Prestacion_Ant = 0.03;
    
}
