package rd.elvisalmonte.curso;

public class Aguila extends Ave{
    public Aguila(String nombre) {
        super(nombre);
    }

    @Override
    void volar(){
        System.out.println("puedo volar como Aguila");
    }

}
