package rd.elvisalmonte.curso;

public class Pato extends Ave{
    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    void volar(){
        System.out.println("Puedo volar como Pato");
    }

}
