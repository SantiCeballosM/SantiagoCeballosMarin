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
                    System.out.println("Ingrese los detalles del nuevo empleado:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Departamento: ");
                    System.out.println();
                    System.out.println("Elige a que departamento deseas agregar el empleado: ");
                    System.out.println("1- Mantenimiento");
                    System.out.println("2- Administración");
                    System.out.println("3- Contabilidad");
                    System.out.println("4- Recursos Humanos");
                    System.out.println("5- Ventas y Marketing");
                    System.out.println("6- Producción o Operaciones");
                    System.out.println("7- Tecnología de la Información (TI)");
                    System.out.println("Ingrese la opcion: ");
                    int opcionDepartamento = scanner.nextInt();
                    Departamento departamento = null;
                    switch (opcionDepartamento) {
                        case 1:
                            departamento = mantenimiento;
                            break;
                        case 2:
                            departamento = administracion;
                            break;
                        case 3:
                            departamento = contabilidad;
                            break;
                        case 4:
                            departamento = recursosHumanos;
                            break;
                        case 5:
                            departamento = ventasMarketing;
                            break;
                        case 6:
                            departamento = produccionOperaciones;
                            break;
                        case 7:
                            departamento = tecnologiaInformacion;
                            break;
                        default:
                            System.out.println("Ups hiciste algo mal");
                    }

                    Empleado nuevoEmpleado = new Empleado(id, nombre, apellido, cargo, salario, departamento.getNombre());
                    departamento.agregarEmpleado(nuevoEmpleado);
                    gestionPersonal.agregarEmpleado(nuevoEmpleado);
                    System.out.println("Empleado agregado con éxito.");
                    break;

                case 2:
                    System.out.print("Ingrese el ID del empleado: ");
                    int idEmpleado = scanner.nextInt();
                    double salarioEmpleado = gestionPersonal.calcularSalario(idEmpleado);
                    if (salarioEmpleado != -1) {
                        System.out.println("El salario del empleado con ID " + idEmpleado + " es: " + salarioEmpleado);
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 3:
                    try {
                        mantenimiento.calcularProductividad();
                        administracion.calcularProductividad();
                        contabilidad.calcularProductividad();
                        recursosHumanos.calcularProductividad();
                        ventasMarketing.calcularProductividad();
                        produccionOperaciones.calcularProductividad();
                        tecnologiaInformacion.calcularProductividad();
                    } catch (Exception e) {
                        System.err.println("Ha ocurrido un error: " + e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    mantenimiento.mostrarEmpleados();
                    administracion.mostrarEmpleados();
                    contabilidad.mostrarEmpleados();
                    recursosHumanos.mostrarEmpleados();
                    ventasMarketing.mostrarEmpleados();
                    produccionOperaciones.mostrarEmpleados();
                    tecnologiaInformacion.mostrarEmpleados();

                    break;

                case 5:
                    System.out.println("Mantenimiento");
                    System.out.println("Reporte de productividad: " + mantenimiento.calcularProductividad());
                    System.out.printf("Empleados en el area: ");
                    mantenimiento.mostrarEmpleados();
                    System.out.println("---------------------------------------");
                    System.out.println("Administración");
                    System.out.println("Reporte de productividad: " + administracion.calcularProductividad());
                    System.out.printf("Empleados en el area: ");
                    administracion.mostrarEmpleados();
                    System.out.println("---------------------------------------");
                    System.out.println("Contabilidad");
                    System.out.println("Reporte de productividad: " + contabilidad.calcularProductividad());
                    System.out.printf("Empleados en el area: ");
                    contabilidad.mostrarEmpleados();
                    System.out.println("---------------------------------------");
                    System.out.println("Recursos Humanos");
                    System.out.println("Reporte de productividad: " + recursosHumanos.calcularProductividad());
                    System.out.printf("Empleados en el area: ");
                    recursosHumanos.mostrarEmpleados();
                    System.out.println("---------------------------------------");
                    System.out.println("Ventas y Marketing");
                    System.out.println("Reporte de productividad: " + ventasMarketing.calcularProductividad());
                    System.out.printf("Empleados en el area: ");
                    ventasMarketing.mostrarEmpleados();
                    System.out.println("---------------------------------------");
                    System.out.println("Producción o Operaciones");
                    System.out.println("Reporte de productividad: " + produccionOperaciones.calcularProductividad());
                    System.out.printf("Empleados en el area: ");
                    produccionOperaciones.mostrarEmpleados();
                    System.out.println("---------------------------------------");
                    System.out.println("Tecnología de la Información (TI)");
                    System.out.println("Reporte de productividad: " + tecnologiaInformacion.calcularProductividad());
                    System.out.printf("Empleados en el area: ");
                    tecnologiaInformacion.mostrarEmpleados();
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


