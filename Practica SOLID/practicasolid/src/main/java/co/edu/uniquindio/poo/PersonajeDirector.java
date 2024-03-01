package co.edu.uniquindio.poo;

public class PersonajeDirector{
    
    public String nombreUnico;
    public String apodo;
    public String descripcion;
    public int dineroInicial;
    
    public PersonajeDirector(String nombreUnico, String apodo, String descripcion, int dineroInicial){
        assert nombreUnico != null;
        assert apodo != null;
        assert descripcion != null;
        assert dineroInicial >= 0;

        this.nombreUnico = nombreUnico;
        this.apodo = apodo;
        this.descripcion = descripcion;
        this.dineroInicial = dineroInicial;
    }

    public String getNombreUnico() {
        return nombreUnico;
    }

    public void setNombreUnico(String nombreUnico) {
        this.nombreUnico = nombreUnico;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(int dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public PersonajeDirector build(){
        PersonajeDirector personaje = new PersonajeDirector(nombreUnico, apodo, descripcion, dineroInicial);
        personaje.setNombreUnico(nombreUnico);
        personaje.setApodo(apodo);
        personaje.setDescripcion(descripcion);
        personaje.setDineroInicial(dineroInicial);
        return personaje;
    }
}