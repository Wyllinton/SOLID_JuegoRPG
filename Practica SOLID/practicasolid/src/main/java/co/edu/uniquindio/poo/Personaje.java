package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public abstract class Personaje implements ValidarPersonaje, RegistrarPersonaje{
    private String nombreUnico;
    private String descripcion; 
    private String apodo;
    private int dineroInicial;
    private Collection <Personaje> listaPersonajes;

    public Personaje(String nombreUnico, String descripcion, String apodo, int dineroInicial) {
        this.nombreUnico = nombreUnico;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
        this.listaPersonajes = new ArrayList<>();
    }
    
    public String getNombreUnico() {
        return nombreUnico;
    }
    public void setNombreUnico(String nombreUnico) {
        this.nombreUnico = nombreUnico;
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
    public int getDineroInicial() {
        return dineroInicial;
    }
    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    @Override
    public String validarAtributos() {
        
        return null;
    }
    @Override
    public void enlistarPersonaje(Personaje personaje){
            boolean existePersonaje = buscarPersonajePorNombreUnico (personaje.getNombreUnico()).isPresent();
            assert !existePersonaje:"El personaje ya está registrado";
            listaPersonajes.add(personaje);
        }
        public Optional<Personaje> buscarPersonajePorNombreUnico (String nombre){
            Predicate<Personaje> condicion = mago-> mago.getNombreUnico().equals(nombre);
            return listaPersonajes.stream().filter(condicion).findAny();
        }

        public Collection<Personaje> getListaPersonajes() {
            return listaPersonajes;
        }
    
}
    

