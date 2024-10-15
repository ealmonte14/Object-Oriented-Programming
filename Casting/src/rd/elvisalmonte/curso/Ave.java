package rd.elvisalmonte.curso;

public class Ave {
    String nombre;
    int edad;

    public Ave(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void volar(){
        System.out.println("No puedo volar");
    }
}
