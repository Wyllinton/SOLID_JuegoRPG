package co.edu.uniquindio.poo;

import java.util.Collection;

public class Jugador {
    private String idJugador;
    private final Collection<Personaje> listaPersonajes;
    
    public Jugador(String idJugador, Collection<Personaje> listaPersonajes) {
        this.idJugador = idJugador;
        this.listaPersonajes = listaPersonajes;
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

}
