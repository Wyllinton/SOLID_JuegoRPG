/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.List;

/**
 * Unit test for simple App.
 */
    public class prueba {
        public static void main(String[] args) {
        PersonajeBuilder builder = new GuerreroBuilder();
        PersonajeDirector director = new PersonajeDirector(builder);

        // Construir un guerrero
        director.constructor("Aragorn", "Guerrero", 10,
                List.of("Espada Afilada", "Golpe Definitivo", "Escudo Protector"),
                List.of("Espada", "Escudo"), "Héroe de Gondor", "El rey de los guerreros", 1000);
        Personaje guerrero = builder.build();
        System.out.println("Guerrero creado: " + guerrero);

        // Construir un mago
        builder = new MagoBuilder();
        director = new PersonajeDirector(builder);
        director.constructor("Gandalf", "Mago", 15,
                List.of("Bola de Fuego", "Rayo Eléctrico", "Hechizo de Curación"),
                List.of("Báculo", "Túnica"), "El mago gris", "Gandalf el Blanco", 500);
        Personaje mago = builder.build();
        System.out.println("Mago creado: " + mago);

        // Construir un arquero
        builder = new ArqueroBuilder();
        director = new PersonajeDirector(builder);
        director.constructor("Legolas", "Arquero", 12,
                List.of("Disparo Rápido", "Flecha Venenosa", "Tiro Certero"),
                List.of("Arco", "Flechas"), "El elfo de los bosques", "Príncipe de los arqueros", 800);
        Personaje arquero = builder.build();
        System.out.println("Arquero creado: " + arquero);
    }
} 

      