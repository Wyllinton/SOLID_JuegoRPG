package co.edu.uniquindio.poo;

interface PersonajeBuilder {
    
    private String nombreUnico;
    private String apodo;
    private String descripcion;
    private int dineroInicial;

    private PersonajeBuilder(){}

    public PersonajeBuilder nombreUnico (String nombreUnico){
        this.nombreUnico = nombreUnico;
        return this;
    }

    public PersonajeBuilder apodo (String apodo){
        this.apodo = apodo;
        return this;
    }

    public PersonajeBuilder descripcion (String descripcion){
        this.descripcion = descripcion;
        return this;
    }

    public PersonajeBuilder dineroInicial (int nombreUnico){
        this.dineroInicial = dineroInicial;
        return this;
    }

    public PersonajeDirector build(){
        return new PersonajeBuilder(nombreUnico, apodo, descripcion,dineroInicial);
    }
}