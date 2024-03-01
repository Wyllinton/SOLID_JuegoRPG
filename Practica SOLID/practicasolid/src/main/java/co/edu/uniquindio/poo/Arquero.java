package co.edu.uniquindio.poo;

public class ArqueroBuilder extends Personaje {

    private int destreza;
    private int agilidad;
    private int precision;          

    public ArqueroBuilder(String apodo, String nombreUnico, String descripcion, int dineroInicial, int destreza, int agilidad,
            int precision) {
        super(nombreUnico, descripcion, apodo, dineroInicial);
        this.destreza = destreza;
        this.agilidad = agilidad;
        this.precision = precision;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public void disparoRapido() {
        System.out.println("disparar");
    }

    public void flechaVenenosa() {
        System.out.println("envenenar");
    }

    public void tiroCertero() {
        System.out.println("tirar");
    }
}
