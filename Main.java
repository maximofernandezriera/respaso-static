public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Tomás Navarra", 22);
        Persona.incrementarContador();
        Persona p3 = new Persona("Jonás Estacio", 23);
        Persona.incrementarContador();
        Persona p2 = new Persona("Tomás Navarra", 22);
        Persona.incrementarContador();
        Persona p4 = new Persona("Jonás Estacio", 23);
        Persona.incrementarContador();
        System.out.println("Se han creado:" + Persona.getContadorPersonas() + " personas");

    }
}
