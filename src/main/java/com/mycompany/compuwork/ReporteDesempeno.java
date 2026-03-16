
package com.mycompany.compuwork;

public class ReporteDesempeno {

    private Empleado empleado;
    private int productividad;
    private int puntualidad;

    public ReporteDesempeno(Empleado empleado, int productividad, int puntualidad) {
        this.empleado = empleado;
        this.productividad = productividad;
        this.puntualidad = puntualidad;
    }

    public double calcularDesempeno() {

        return (productividad + puntualidad) / 2.0;
    }

    public void generarReporte() {

        System.out.println("Reporte de Desempeño");
        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Puntaje desempeño: " + calcularDesempeno());
    }
}