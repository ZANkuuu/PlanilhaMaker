package Domain;

public class Logica {
    public static void opcoes(int escolha){
        switch(escolha){
            case 0:

                break;
            case 1:
                throw new RuntimeException("Processo cancelado");
        }
    }
}
