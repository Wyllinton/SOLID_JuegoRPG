package co.edu.uniquindio.poo;

import java.util.List;

class PersonajeDirector{
    private PersonajeBuilder builder;

    public PersonajeDirector(PersonajeBuilder builder) {
        this.builder = builder;
    }

    public Personaje constructor (String name, String characterClass, int nivel, List<String> habilidades, List<String> equipamiento, String descripcion, String apodo, double dineroInicial){
      
        builder.name(name);
        builder.characterClass(characterClass);
        builder.nivel(nivel);
        builder.habilidades(habilidades);
        builder.equipamiento(equipamiento);
        builder.descripcion(descripcion);
        builder.apodo(apodo);
        builder.dineroInicial(dineroInicial);
        return builder.build();
    }
    
}
