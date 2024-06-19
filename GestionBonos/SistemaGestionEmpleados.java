package GestionBonos;

public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        // Creación de empleados
        Empleado admin = new Administrativo("Ana Perez", 70000, 7, "Recursos Humanos");
        Empleado operativo = new Operativo("Juan Gomez", 60000, 4, "Producción");

        // Cálculo y muestra de los bonos anuales
        System.out.println("Bono anual de " + admin.getNombre() + ": " + admin.calcularBonoAnual());
        System.out.println("Bono anual de " + operativo.getNombre() + ": " + operativo.calcularBonoAnual());
    }
}