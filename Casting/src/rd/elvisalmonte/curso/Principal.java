package rd.elvisalmonte.curso;

public class Principal {
    public static void main(String[] args) {
        Ave ave1 = new AguilaReal("Aguila", 2);
        Ave av2 = new AguilaCalva("Aguila Calva",3);
        Ave ave3 = new Pato("Pato",3);
        ave1.volar();
        av2.volar();
        ave3.volar();



    }
}
