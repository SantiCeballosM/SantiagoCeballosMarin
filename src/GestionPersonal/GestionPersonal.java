package GestionPersonal;
import java.util.ArrayList;
public class GestionPersonal {
    private static ArrayList<Empleado> empleados;

    public GestionPersonal() {
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

    public void generarReporte() {

    }

    public void mostrarEstructuraJerarquica() {

    }
}