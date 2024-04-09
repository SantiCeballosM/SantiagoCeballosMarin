package GestionPersonal;
import java.util.ArrayList;
import java.util.ArrayList;

public class GestionPersonal {
    private ArrayList<Departamento> departamentos;
    private ArrayList<Empleado> empleados;

    // Constructor
    public GestionPersonal() {
        this.departamentos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void agregarEmpleadoADepartamento(Empleado empleado, Departamento departamento) {
        departamento.agregarEmpleado(empleado);
    }

    public void mostrarEmpleadosDepartamento(Departamento departamento) {
        departamento.mostrarEmpleados();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double calcularSalario(int idEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == idEmpleado) {
                return empleado.getSalario();
            }
        }
        return -1;
    }

    public void generarReporteDepartamentos() {
        System.out.println("Reporte de Productividad por Departamento:");
        for (Departamento departamento : departamentos) {
            System.out.println("Departamento: " + departamento.getNombre());
            System.out.println("Empleados:");
            departamento.mostrarEmpleados();
            System.out.println("-------------------------------------------");
        }
    }

    public void mostrarEstructuraJerarquica() {

    }
}