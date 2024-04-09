package GestionPersonal;
import java.util.Scanner;
public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionPersonal gestionPersonal = new GestionPersonal();
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
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Departamento: ");
                    String departamento = scanner.nextLine();

                    Empleado nuevoEmpleado = new Empleado(id, nombre, apellido, cargo, salario, departamento);
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
                    gestionPersonal.generarReporteDepartamentos();
                    break;

                case 4:
                    gestionPersonal.mostrarEstructuraJerarquica();
                    break;

                case 5:

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

