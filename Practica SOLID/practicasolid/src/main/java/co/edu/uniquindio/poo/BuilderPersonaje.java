package co.edu.uniquindio.poo;

import java.util.List;

public interface BuilderPersonaje {

    void nombreUnico(String nombre);
    void descripcion(String nombre);
    void apodo(String nombre);
    void dineroInicial(double dinero);

    void habilidades(List<String> habilidadesList);
    void poderes(List<String> poderesList);

    Personaje build();

}