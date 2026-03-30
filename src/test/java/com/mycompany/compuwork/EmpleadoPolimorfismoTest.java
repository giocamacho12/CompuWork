package com.mycompany.compuwork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoPolimorfismoTest {

    @Test
    void testCalculoSalarioPolimorfico() {
        Empleado emp1 = new EmpleadoPermanente(1, "Juan", 1000000, 20000);
        Empleado emp2 = new EmpleadoTemporal(2, "Ana", 40, 10);

        assertEquals(1200.0, emp1.calcularSalario());
        assertEquals(400.0, emp2.calcularSalario());
    }
}