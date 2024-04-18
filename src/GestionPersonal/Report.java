package GestionPersonal;

public class Report {
    public static void generarReporte(Departamento mantenimiento, Departamento administracion, Departamento contabilidad, Departamento recursosHumanos, Departamento ventasMarketing, Departamento produccionOperaciones, Departamento tecnologiaInformacion) {
        System.out.println("Mantenimiento");
        System.out.println(mantenimiento.calcularProductividadAvanzada());
        mantenimiento.mostrarEmpleados();

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Administración");
        System.out.println(administracion.calcularProductividadAvanzada());
        administracion.mostrarEmpleados();

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Contabilidad");
        System.out.println(contabilidad.calcularProductividadAvanzada());
        contabilidad.mostrarEmpleados();

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Recursos Humanos");
        System.out.println(recursosHumanos.calcularProductividadAvanzada());
        recursosHumanos.mostrarEmpleados();

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Ventas y Marketing");
        System.out.println(ventasMarketing.calcularProductividadAvanzada());
        ventasMarketing.mostrarEmpleados();

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Producción o Operaciones");
        System.out.println(produccionOperaciones.calcularProductividadAvanzada());
        produccionOperaciones.mostrarEmpleados();

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Tecnología de la Información (TI)");
        System.out.println(tecnologiaInformacion.calcularProductividadAvanzada());
        tecnologiaInformacion.mostrarEmpleados();
    }
}
