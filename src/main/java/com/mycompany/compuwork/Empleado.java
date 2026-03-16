
package com.mycompany.compuwork;

public class Empleado {

    protected int id;
    protected String nombre;
    protected double salario;
    protected Departamento departamento;

    // Constructor
    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    // Método que será sobrescrito (polimorfismo)
    public double calcularSalario() {
        return salario;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " - Salario: " + salario);
    }
}