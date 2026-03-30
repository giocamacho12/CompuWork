package com.mycompany.compuwork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoPermanenteTest {

    @Test
    void testCalcularSalarioConBono() {
        EmpleadoPermanente emp = new EmpleadoPermanente(1, "Juan", 1000, 200);

        double salario = emp.calcularSalario();

        assertEquals(1200.0, salario);
    }

    @Test
    void testCalcularSalarioSinBono() {
        EmpleadoPermanente emp = new EmpleadoPermanente(2, "Ana", 1500000, 0);

        double salario = emp.calcularSalario();

        assertEquals(1500.0, salario);
    }
    @Test
void testEsInstanciaDeEmpleado() {
    Empleado emp = new EmpleadoPermanente(3, "Carlos", 1000000, 30000);

    assertTrue(emp instanceof EmpleadoPermanente);
    assertTrue(emp instanceof Empleado);
}
}