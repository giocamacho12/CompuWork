
package com.mycompany.compuwork;


public class EmpleadoTemporal extends Empleado {

    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoTemporal(int id, String nombre, int horasTrabajadas, double pagoPorHora) {
        super(id, nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }
}