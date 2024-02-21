/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void enlistarPersonaje() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        JuegoRPG juego1 = new JuegoRPG("Arcangel", null);
        Jugador juga1 = new Jugador("Jaider", null);
        Personaje mago1 = new Mago("Pechy", "Anuelaaa", "Increible personaje de las masmorras", 0, 0, 0, 0);
        
        juga1.enlistarPersonaje(mago1);

        assertEquals(1, juga1.getListaPersonajes().size());


        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    @Test
    public void enlistarPersonajeRepetido() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        JuegoRPG juego1 = new JuegoRPG("Arcangel", null);
        Jugador juga1 = new Jugador("Jaider", null);
        Personaje mago1 = new Mago("Pechy", "Anuelaaa", "Increible personaje de las masmorras", 0, 0, 0, 0);
        Personaje mago2 = new Mago("Pechy", "Anuelaaa", "Increible personaje de las masmorras", 0, 0, 0, 0);

        juga1.enlistarPersonaje(mago1);

        assertThrows(Throwable.class, ()-> juga1.enlistarPersonaje(mago2));

        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
}
