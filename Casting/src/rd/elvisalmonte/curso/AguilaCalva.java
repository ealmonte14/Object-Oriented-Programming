package rd.elvisalmonte.curso;

public class AguilaCalva extends Aguila{
    public AguilaCalva(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    void volar(){
        System.out.println("puedo volar como Agula Calva");
    }
}
