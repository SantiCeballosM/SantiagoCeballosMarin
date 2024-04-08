package GestionPersonal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String cargo;
    private double salario;
    private String departamento;

    public Empleado(int id, String nombre, String apellido, String cargo, double salario, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }
    /*
    public static void main(String[] args) {
        List<String> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los nombres de los empleados (escriba 'fin' para terminar):");

        String nombreEmpleado = scanner.nextLine();
        while (!nombreEmpleado.equalsIgnoreCase("fin")) {
            empleados.add(nombreEmpleado);
            nombreEmpleado = scanner.nextLine();
        }

        System.out.println("Listado de empleados:");
        for (String empleado : empleados) {
            System.out.println(empleado);
        }

        scanner.close();
    }
    */
}
