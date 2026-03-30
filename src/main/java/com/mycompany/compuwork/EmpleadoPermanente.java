
package com.mycompany.compuwork;

public class EmpleadoPermanente extends Empleado {

    private double bono;

  public EmpleadoPermanente(int id, String nombre, double salario, double bono) {
    super(id, nombre, salario);

    if (bono < 0) {
        throw new IllegalArgumentException("El bono no puede ser negativo");
    }

    this.bono = bono;
}

    @Override
    public double calcularSalario() {
        return salario + bono;
    }
}