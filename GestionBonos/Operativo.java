package GestionBonos;

public class Operativo extends Empleado {
    private String zonaTrabajo;

    public Operativo(String nombre, double salarioAnual, int añosDeServicio, String zonaTrabajo) {
        super(nombre, salarioAnual, añosDeServicio);
        this.zonaTrabajo = zonaTrabajo;
    }

    public String getZonaTrabajo() {
        return zonaTrabajo;
    }

    @Override
    public double calcularBonoAnual() {
        double bono = getSalarioAnual() * 0.15;
        if (getAñosDeServicio() > 5) {
            bono += getSalarioAnual() * 0.05;
        }
        return bono;
    }
}