
package com.mycompany.compuwork;



public class CompuWork {

    public static void main(String[] args) {

        try {

            Departamento sistemas = new Departamento(1, "Sistemas");

            EmpleadoPermanente emp1 = new EmpleadoPermanente(1, "Carlos", 2000000, 500000);
            EmpleadoTemporal emp2 = new EmpleadoTemporal(2, "Ana", 120, 15);

            sistemas.agregarEmpleado(emp1);
            sistemas.agregarEmpleado(emp2);

            sistemas.mostrarEmpleados();

            ReporteDesempeno reporte = new ReporteDesempeno(emp1, 90, 85);
            reporte.generarReporte();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }
}