package co.edu.uniquindio.poo;

public class Guerrero extends Personaje {
    private int fuerza;
    private int resistencia;
    private int vitalidad;
    
    public Guerrero(String apodo, String nombreUnico, String descripcion, int dineroInicial, int fuerza, int resistencia, int vitalidad) {   
        super(nombreUnico, descripcion, apodo, dineroInicial);
    
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vitalidad = vitalidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }
    public void espadaAfilada(){
        System.out.println("cortar");   
    }
    public void golpeDefinitivo(){
        System.out.println("golpear");   
    }
    public void escudoProtector(){
        System.out.println("proteger");   
    }

}
