import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        // do while garante que o loop rode pelo menos uma vez
        do {
            System.out.println("Telefone tocando");
        }while (tocando());
        System.out.println("Alô!!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        // enquanto atender for falso, o while tem que ser true
        return !atendeu;
    }
}
