
package com.mycompany.compuwork;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private int id;
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) throws Exception {

        if (empleado == null) {
            throw new Exception("El empleado no puede ser nulo");
        }

        empleados.add(empleado);
        empleado.setDepartamento(this);
    }

    public void mostrarEmpleados() {

        System.out.println("Departamento: " + nombre);

        for (Empleado e : empleados) {
            System.out.println(e.getNombre());
        }
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
