package com.mycompany.compuwork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepartamentoTest {

    @Test
    void testAgregarEmpleadoCorrectamente() throws Exception {
        Departamento dept = new Departamento(1, "Sistemas");
        Empleado emp = new Empleado(1, "Juan", 1000000);

        dept.agregarEmpleado(emp);

        assertEquals(1, dept.getEmpleados().size());
        assertEquals(dept, emp.getDepartamento());
    }

    @Test
    void testAgregarMultiplesEmpleados() throws Exception {
        Departamento dept = new Departamento(2, "RRHH");

        Empleado emp1 = new Empleado(1, "Ana", 1200000);
        Empleado emp2 = new Empleado(2, "Luis", 13000000);

        dept.agregarEmpleado(emp1);
        dept.agregarEmpleado(emp2);

        assertEquals(2, dept.getEmpleados().size());
    }

    @Test
    void testAgregarEmpleadoNuloDebeLanzarExcepcion() {
        Departamento dept = new Departamento(3, "Ventas");

        Exception exception = assertThrows(Exception.class, () -> {
            dept.agregarEmpleado(null);
        });

        assertEquals("El empleado no puede ser nulo", exception.getMessage());
    }
}