package rd.elvisalmonte.curso;

public class AguilaReal extends Aguila{
    public AguilaReal(String nombre) {
        super(nombre);
    }

    @Override
    void volar(){
        System.out.println("Si puedo volar como aguila real!");
    }
}
