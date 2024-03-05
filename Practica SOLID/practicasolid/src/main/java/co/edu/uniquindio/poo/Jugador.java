package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public class Jugador implements ValidarNombre {
    private String idJugador;
    private final Collection<Personaje> listaPersonajes;

    public Jugador(String idJugador, Collection<Personaje> listaPersonajes) {
        this.idJugador = idJugador;
        this.listaPersonajes = new ArrayList<>();
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public Collection<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }

    @Override
    public void enlistarPersonaje(Personaje personaje) {
        boolean existePersonaje = buscarPersonajePorNombreUnico(personaje.getName()).isPresent();
        assert !existePersonaje : "El personaje ya está registrado";
        listaPersonajes.add(personaje);
    }

    public Optional<Personaje> buscarPersonajePorNombreUnico(String nombre) {
        Predicate<Personaje> condicion = mago -> mago.getName().equals(nombre);
        return listaPersonajes.stream().filter(condicion).findAny();
    }

}
