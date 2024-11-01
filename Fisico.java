public class Fisico extends Jogo {
    private String lote;

    public Fisico (String titulo, double preco, String lote){
        super(titulo, preco);
        this.lote = lote;
    }

    public String getLote(){
        return lote;
    }

    public void setLote(String newLote){
        this.lote = newLote;
    }

    public void exibirJogo(){
        System.out.println("Título: "+getTitulo());
        System.out.println("Preço: "+getPreco());
        System.out.println("Lote: "+getLote());
    }
}
