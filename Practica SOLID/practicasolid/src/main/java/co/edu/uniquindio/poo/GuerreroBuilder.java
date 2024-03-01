package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class GuerreroBuilder extends PersonajeDirector implements BuilderPersonaje  {

    public GuerreroBuilder(String nombreUnico, String descripcion, String apodo, int dineroInicial) {
        super(nombreUnico, descripcion, apodo, dineroInicial);
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
        return new GuerreroBuilder(nombreUnico, descripcion, apodo, dineroInicial);  
    }
}