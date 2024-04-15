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



    public void mostrarEstructuraJerarquica() {


    }
}