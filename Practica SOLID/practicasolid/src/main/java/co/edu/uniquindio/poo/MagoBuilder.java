package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class MagoBuilder extends PersonajeDirector implements BuilderPersonaje {
    private int inteligencia;
    private int sabiduria;
    private int energiaMagica;
    
    public MagoBuilder(String apodo, String nombreUnico, String descripcion, int dineroInicial, int energiaMagica,
            int inteligencia, int sabiduria) {
        super(nombreUnico, descripcion, apodo, dineroInicial);

        this.energiaMagica = energiaMagica;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    @Override
    public void nombreUnico(String nombreUnico) {
        this.nombreUnico = nombreUnico;
    }

    @Override
    public void descripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void apodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public void dineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    @Override
    public void habilidades(List<String> habilidadesList) {
        habilidadesList = new ArrayList<>(); 
    }

    @Override
    public void poderes(List<String> poderesList) {
        poderesList = new ArrayList<>();
    }

    @Override
    public PersonajeDirector build() {
        return new MagoBuilder(apodo, nombreUnico, descripcion, dineroInicial, energiaMagica, inteligencia, sabiduria);  
    }
}