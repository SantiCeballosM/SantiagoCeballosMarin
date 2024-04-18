package GestionPersonal;
import java.util.Scanner;
public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionPersonal gestionPersonal = new GestionPersonal();
        Departamento mantenimiento = new Departamento("Mantenimiento");
        Departamento administracion = new Departamento("Administración");
        Departamento contabilidad = new Departamento("Contabilidad");
        Departamento recursosHumanos = new Departamento("Recursos Humanos");
        Departamento ventasMarketing = new Departamento("Ventas y Marketing");
        Departamento produccionOperaciones = new Departamento("Producción o Operaciones");
        Departamento tecnologiaInformacion = new Departamento("Tecnología de la Información (TI)");

        int opcion;
        do {
            System.out.println();
            System.out.println("Bienvenido al programa mas fenomenal de gestion de personal");
            System.out.println();
            System.out.println("Para comenzar, elije lo que desees hacer: ");
            System.out.println();
            System.out.println("1- Agregar empleado: ");
            System.out.println("2- Calcular Salario de Empleado: ");
            System.out.println("3- Generar Reporte de Productividad: ");
            System.out.println("4- Mostrar Estructura Jerarquica de la Empresa: ");
            System.out.println("5- Generar reportes avanzados: ");
            System.out.println("6- Salir");
            System.out.println();
            System.out.println("Ingresa la opcion que desees hacer: ");
            System.out.println();
            opcion = scanner. nextInt();

            switch (opcion) {
                case 1:
                    NewWorker.agregarNuevoEmpleado(scanner, gestionPersonal, mantenimiento, administracion, contabilidad, recursosHumanos, ventasMarketing, produccionOperaciones, tecnologiaInformacion);
                    break;

                case 2:
                    System.out.print("Ingrese el ID del empleado: ");
                    int idEmpleado = scanner.nextInt();
                    double salarioEmpleado = gestionPersonal.calcularSalario(idEmpleado);
                    System.out.println(salarioEmpleado != -1 ? "El salario del empleado con ID " + idEmpleado + " es: " + salarioEmpleado : "Empleado no encontrado.");
                    break;

                case 3:
                    Departamento[] departamentos = {mantenimiento, administracion, contabilidad, recursosHumanos, ventasMarketing, produccionOperaciones, tecnologiaInformacion};
                    for (Departamento departamento : departamentos) {
                        try {
                            departamento.calcularProductividad();
                        } catch (Exception e) {
                            System.err.println("Ha ocurrido un error en " + departamento.getNombre() + ": " + e.getMessage());
                            e.printStackTrace();
                        }
                    }
                    break;

                case 4:
                    Departamento[] departamentosArray = {mantenimiento, administracion, contabilidad, recursosHumanos, ventasMarketing, produccionOperaciones, tecnologiaInformacion};
                    for (Departamento departamento : departamentosArray) {
                        departamento.mostrarEmpleados();
                    }
                    break;

                case 5:
                    Report.generarReporte(mantenimiento, administracion, contabilidad, recursosHumanos, ventasMarketing, produccionOperaciones, tecnologiaInformacion);
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);
    }
}


