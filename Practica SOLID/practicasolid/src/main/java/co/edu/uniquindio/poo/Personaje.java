package co.edu.uniquindio.poo;

public abstract class Personaje{
    private String nombreUnico;
    private String descripcion;
    private String apodo;
    private int dineroInicial;

    public Personaje(String nombreUnico, String descripcion, String apodo, int dineroInicial) {
        this.nombreUnico = nombreUnico;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
    }

    public String getNombreUnico() {
        return nombreUnico;
    }

    public void setNombreUnico(String nombreUnico) {
        this.nombreUnico = nombreUnico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

}
