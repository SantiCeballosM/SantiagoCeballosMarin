package GestionPersonal;

import java.util.Scanner;
import java.util.Scanner;
import java.util.InputMismatchException;

public class NewWorker {
    public static void agregarNuevoEmpleado(Scanner scanner, GestionPersonal gestionPersonal, Departamento mantenimiento, Departamento administracion, Departamento contabilidad, Departamento recursosHumanos, Departamento ventasMarketing, Departamento produccionOperaciones, Departamento tecnologiaInformacion) {
        System.out.println("Ingrese los detalles del nuevo empleado:");
        System.out.print("ID: ");
        int id;
        while (true) {
            try {
                id = scanner.nextInt();
                if (id <= 0) {
                    System.out.println("Ingresa un número entero positivo.");
                    System.out.print("ID: ");
                    continue;
                } else if (gestionPersonal.existeEmpleadoConID(id)) {
                    System.out.println("El ID ingresado ya existe. Por favor, ingrese un ID único distinto.");
                    return;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número entero.");
                scanner.next(); // Limpiar el búfer del scanner
                System.out.print("ID: ");
            }
        } while (id <= 0);
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Salario: ");
        double salario;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Debes ingresar un número positivo.");
                System.out.print("Salario: ");
                scanner.next();
            }
            salario = scanner.nextDouble();
            if (salario <= 0) {
                System.out.println("Error: Debes ingresar un número positivo.");
                System.out.print("Salario: ");
            }
        } while (salario <= 0);
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
        scanner.nextLine();

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
    }
}
