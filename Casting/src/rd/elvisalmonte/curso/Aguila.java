package rd.elvisalmonte.curso;

public class Aguila extends Ave{
    public Aguila(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void volar(){
        System.out.println("No puedo volar como Aguila");
    }

}
