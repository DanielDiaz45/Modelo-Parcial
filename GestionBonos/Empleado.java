package GestionBonos;


public abstract class Empleado {
    private String nombre;
    private double salarioAnual;
    private int añosDeServicio;

    public Empleado(String nombre, double salarioAnual, int añosDeServicio) {
        this.nombre = nombre;
        this.salarioAnual = salarioAnual;
        this.añosDeServicio = añosDeServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public int getAñosDeServicio() {
        return añosDeServicio;
    }

    public abstract double calcularBonoAnual();
}