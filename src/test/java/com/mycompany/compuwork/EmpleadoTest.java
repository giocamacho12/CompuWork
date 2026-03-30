package com.mycompany.compuwork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    void testCalcularSalarioBase() {
        Empleado emp = new Empleado(1, "Juan", 1000);

        double salario = emp.calcularSalario();

        assertEquals(1000.0, salario);
    }

    @Test
    void testGetters() {
        Empleado emp = new Empleado(2, "Ana", 1500);

        assertEquals(2, emp.getId());
        assertEquals("Ana", emp.getNombre());
        assertEquals(1500.0, emp.getSalario());
    }

    @Test
    void testAsignarDepartamento() throws Exception {
        Empleado emp = new Empleado(3, "Carlos", 1200);
        Departamento dept = new Departamento(1, "Sistemas");

        dept.agregarEmpleado(emp);

        assertEquals(dept, emp.getDepartamento());
    }
}
