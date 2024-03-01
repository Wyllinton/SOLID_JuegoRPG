package co.edu.uniquindio.poo;

import java.util.List;

public interface BuilderPersonaje {

    void nombreUnico(String nombreUnico);
    void descripcion(String descripcion);
    void apodo(String apodo);
    void dineroInicial(int dinero);

    void habilidades(List<String> habilidadesList);
    void poderes(List<String> poderesList);

    PersonajeDirector build();

}