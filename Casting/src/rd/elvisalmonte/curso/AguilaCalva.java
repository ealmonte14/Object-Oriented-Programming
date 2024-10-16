package rd.elvisalmonte.curso;

public class AguilaCalva extends Aguila{
    public AguilaCalva(String nombre) {
        super(nombre);
    }
    @Override
    void volar(){
        System.out.println("puedo volar como Agula Calva");
    }
}
