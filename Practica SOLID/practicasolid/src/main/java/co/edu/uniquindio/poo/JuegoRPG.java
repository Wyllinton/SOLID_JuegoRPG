package co.edu.uniquindio.poo;

import java.util.Collection;

public class JuegoRPG {
    
    public JuegoRPG(String nombre, Collection<Jugador> listaJugadores) {
        this.nombre = nombre;
        this.listaJugadores = listaJugadores;
    }
    private String nombre;
    private final Collection<Jugador> listaJugadores;
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Collection<Jugador> getListaJugadores() {
        return listaJugadores;
    }
    

    
}
