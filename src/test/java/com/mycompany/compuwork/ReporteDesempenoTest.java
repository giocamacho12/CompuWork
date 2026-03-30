package com.mycompany.compuwork;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReporteDesempenoTest {

    @Test
void testCalcularDesempeno() {
    Empleado emp = new Empleado(1, "Juan", 1000000);
    ReporteDesempeno reporte = new ReporteDesempeno(emp, 80, 90);

    double resultado = reporte.calcularDesempeno();

    assertEquals(85.0, resultado);
}

    @Test
    void testGenerarReporte() {
        Empleado emp = new Empleado(1, "Pedro", 10000000);
        ReporteDesempeno reporte = new ReporteDesempeno(emp, 80, 90);

        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        reporte.generarReporte();

        String output = salida.toString();

        assertTrue(output.contains("Pedro"));
        assertTrue(output.contains("85.0"));
    }
}