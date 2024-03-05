package co.edu.uniquindio.poo;

import java.util.List;

public interface PersonajeBuilder{
    void name(String name);
    void characterClass(String characterClass);
    void nivel(int nivel);
    void habilidades(List<String> habilidades);
    void equipamiento(List<String> equipamiento);
    void descripcion(String descripcion);
    void apodo(String apodo);
    void dineroInicial(double dineroInicial);
    Personaje build();
}