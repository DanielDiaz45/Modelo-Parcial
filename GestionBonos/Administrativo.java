package GestionBonos;

public class Administrativo extends Empleado {
    private String departamento; // departamento donde trabaja

    public Administrativo(String nombre, double salarioAnual, int añosDeServicio, String departamento) {
        super(nombre, salarioAnual, añosDeServicio);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public double calcularBonoAnual() {
        double bono = getSalarioAnual() * 0.10; // bono base
        if (getAñosDeServicio() > 5) { // más de 5 años
            bono = bono + getSalarioAnual() * 0.05; // incremento adicional
        }
        return bono;
    }
}