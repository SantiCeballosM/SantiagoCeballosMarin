package GestionPersonal;
import java.util.Scanner;
public class main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            int exit=0;
            while (exit == 0){
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
                int opcion = scanner.nextInt();

            }
        } catch (Exception e) {
            System.out.println("Hiciste algo mal");
        }
    }
}
