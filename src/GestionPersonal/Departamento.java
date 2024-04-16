package GestionPersonal;
import java.util.ArrayList;
import java.util.List;


public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados del departamento " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println("ID: " + empleado.getId() +
                    ", Nombre: " + empleado.getNombre() +
                    ", Apellido: " + empleado.getApellido() +
                    ", Cargo: " + empleado.getCargo() +
                    ", Salario: " + empleado.getSalario());
        }

    }
    public double calcularProductividad() {
        double productividad = 0.0;
        for (Empleado empleado : empleados) {
            // Sumar todos los salarios de los empleados en este departamento
            productividad += empleado.getSalario();
        }
        System.out.println("La productividad calcula del area de" + nombre + "es: " + productividad);
        return productividad;
    }
}