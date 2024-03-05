package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

class ArqueroBuilder implements PersonajeBuilder{

    private String name;
    private String characterClass;
    private int nivel;
    private List<String> habilidades;
    private List<String> equipamiento;
    private String descripcion;
    private String apodo;
    private double dineroInicial;        

    public ArqueroBuilder(){
        this.habilidades = new ArrayList<>();
        this.equipamiento = new ArrayList<>();

    
    }
    //Se usa la interface y se definen los constructores de cada atributo
    @Override
    public void name(String name) {
        this.name = name;
    }

    @Override
    public void characterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    @Override
    public void nivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void habilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public void equipamiento(List<String> equipamiento) {
        this.equipamiento = equipamiento;
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
    public void dineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    @Override
    public Personaje build() {
        Personaje personaje = new Personaje();
        personaje.setName(name);
        personaje.setCharacterClass(characterClass);
        personaje.setNivel(nivel);
        personaje.setHabilidades(habilidades);
        personaje.setEquipamiento(equipamiento);
        personaje.setDescripcion(descripcion);
        personaje.setApodo(apodo);
        personaje.setDineroInicial(dineroInicial);
        return personaje;
    }

}
