package rd.elvisalmonte.curso;

public class Principal {
    public static void main(String[] args) {
         AguilaReal ave1 = new AguilaReal("Aguila Real");
         Aguila ave2 = ave1;
         Ave ave3 = ave2;
         ave3.volar();

         Ave ave4 = new AguilaCalva("Aguila Calva");
         ave4.volar();
         Aguila ave5 = (Aguila) ave4;
         ave5.volar();
         AguilaCalva av6 = (AguilaCalva) ave5;
         av6.volar();



    }
}
