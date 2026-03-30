package com.mycompany.compuwork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTemporalTest {

    @Test
    void testCalcularSalarioCorrecto() {
        EmpleadoTemporal emp = new EmpleadoTemporal(1, "Ana", 40, 10);

        double salario = emp.calcularSalario();

        assertEquals(400.0, salario);
    }

    @Test
    void testSinHorasTrabajadas() {
        EmpleadoTemporal emp = new EmpleadoTemporal(2, "Luis", 0, 15);

        double salario = emp.calcularSalario();

        assertEquals(0.0, salario);
    }

    @Test
    void testDiferentePagoPorHora() {
        EmpleadoTemporal emp = new EmpleadoTemporal(3, "Carlos", 20, 25);

        double salario = emp.calcularSalario();

        assertEquals(500000.0, salario);
    }
    @Test
void testPolimorfismoEmpleadoTemporal() {
    Empleado emp = new EmpleadoTemporal(4, "Pedro", 30, 20);

    assertEquals(600000.0, emp.calcularSalario());
    assertTrue(emp instanceof EmpleadoTemporal);
}
}
