import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogo> jogos = new ArrayList<Jogo>();
        jogos.add(new Fisico("gow", 350, "qc001"));
        jogos.add(new Fisico("pitFall", 12, "lt003"));

        for (int i = 0; i < jogos.size(); i++) {
            jogos.get(i).exibirJogo();
            System.out.println("------------------");
        }
    }
}