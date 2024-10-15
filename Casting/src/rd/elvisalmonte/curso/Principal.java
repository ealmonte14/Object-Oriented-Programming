package rd.elvisalmonte.curso;

public class Principal {
    public static void main(String[] args) {
        Aguila ave1 = new Aguila("Aguila", 2);
        System.out.println(ave1.nombre);
        System.out.println(ave1.edad);
        ave1.volar();
    }
}
