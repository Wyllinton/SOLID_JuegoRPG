package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public class Mago extends Personaje{
    private int inteligencia;
    private int sabiduria;
    private int energiaMagica;
    private Collection<Mago> listaMagos;
    
    public Mago(String apodo, String nombreUnico, String descripcion, int dineroInicial, int energiaMagica, int inteligencia, int sabiduria) {
        super(nombreUnico, descripcion, apodo, dineroInicial);
       
        this.energiaMagica = energiaMagica;
       this.inteligencia = inteligencia;
       this.sabiduria = sabiduria; 
       listaMagos = new ArrayList<>();
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }
    public void bolaFuego(){
        System.out.println("quemar");   
    }
    public void rayoElectrico(){
        System.out.println("electrocutar");   
    }
    public void hechizoCuracion(){
        System.out.println("curar");   
    }
    @Override
    public String validarNombre() {

        return null; 
    }

    @Override
    public String validarAtributos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validarAtributos'");
    }
    
}
