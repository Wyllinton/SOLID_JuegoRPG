package co.edu.uniquindio.poo;

public class BossSingleton {
    
    private final int salud, ataque;
    private static BossSingleton instance;

    private BossSingleton(){
        this.salud = 1000;
        this.ataque = 230;
    }

    public static BossSingleton getInstance(){
        if(instance == null){
            instance = new BossSingleton();
        }
        return instance;
    }

    public class Main {
        public static void main(String[] args) {
            // Obtén la instancia del Singleton
            BossSingleton boss = BossSingleton.getInstance();
    
            // Accede a los atributos
            int salud = boss.getSalud();
            int ataque = boss.getAtaque();
    
            // Realiza operaciones con la instancia
            System.out.println("Salud del jefe: " + salud);
            System.out.println("Ataque del jefe: " + ataque);
        }
    }
    public int getSalud() {
        return salud;
    }
    public int getAtaque() {
        return ataque;
    }

    

}
