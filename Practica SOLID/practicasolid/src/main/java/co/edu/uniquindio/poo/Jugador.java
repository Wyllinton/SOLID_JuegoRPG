package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Jugador implements ValidarNombre {
    private String idJugador;
    private final Collection<PersonajeDirector> listaPersonajes;

    public Jugador(String idJugador, Collection<PersonajeDirector> listaPersonajes) {
        this.idJugador = idJugador;
        this.listaPersonajes = new ArrayList<>();
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public Collection<PersonajeDirector> getListaPersonajes() {
        return listaPersonajes;
    }

    @Override
    public void enlistarPersonaje(PersonajeDirector personaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enlistarPersonaje'");
    }

}







/**
    @Override
    public void enlistarPersonaje(Personaje personaje) {
        boolean existePersonaje = buscarPersonajePorNombreUnico(personaje.getNombreUnico()).isPresent();
        assert !existePersonaje : "El personaje ya está registrado";
        listaPersonajes.add(personaje);
    }

    public Optional<Personaje> buscarPersonajePorNombreUnico(String nombre) {
        Predicate<Personaje> condicion = mago -> mago.getNombreUnico().equals(nombre);
        return listaPersonajes.stream().filter(condicion).findAny();
    }
*/