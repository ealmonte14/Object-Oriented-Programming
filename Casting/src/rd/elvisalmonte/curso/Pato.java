package rd.elvisalmonte.curso;

public class Pato extends Ave{
    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void volar(){
        System.out.println("Puedo volar como Pato");
    }

}
