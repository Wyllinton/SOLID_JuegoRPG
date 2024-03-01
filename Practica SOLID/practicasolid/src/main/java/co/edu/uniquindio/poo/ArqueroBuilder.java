package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class ArqueroBuilder extends PersonajeDirector implements BuilderPersonaje  {

    private ArqueroBuilder(String nombreUnico, String descripcion, String apodo, int dineroInicial) {
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
        return new ArqueroBuilder(nombreUnico, descripcion, apodo, dineroInicial);  
    }

    
}
