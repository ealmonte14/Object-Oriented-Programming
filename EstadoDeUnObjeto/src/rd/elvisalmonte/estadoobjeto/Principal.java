package rd.elvisalmonte.estadoobjeto;

public class Principal {
    public static void main(String[] args) {
       Auto a1 = new Auto();
       System.out.println(a1.patente + " " + a1.color + " " + a1.kms + " " + a1.conAire);
       a1.patente = "XAZ-2773";
       a1.color = "Verde";
       a1.kms = 23;
       a1.conAire = true;
        System.out.println(a1.patente + " " + a1.color + " " + a1.kms + " " + a1.conAire);
        System.out.println();
        Auto a2 = new Auto();
        a2.patente = "WXZ-9088";
        a2.color = "Azul";
        a2.kms = 90;
        a2.conAire = false;
        System.out.println(a2.patente + " " + a2.color + " " + a2.kms + " " + a2.conAire);


    }
}
