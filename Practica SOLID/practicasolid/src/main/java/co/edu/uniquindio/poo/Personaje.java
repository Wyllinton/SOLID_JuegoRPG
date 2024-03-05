package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

class Personaje {
    private String name;
    private String characterClass;
    private int nivel;
    private List<String> habilidades;
    private List <String> equipamiento;
    private String descripcion;
    private String apodo;
    private double dineroInicial;

    public Personaje(){
        this.habilidades = new ArrayList<>();
        this.equipamiento = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public List<String> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<String> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public double getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }
    
}
