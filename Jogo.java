public abstract class Jogo {
    private String titulo;
    private double preco;

    public abstract void exibirJogo();

    public Jogo (String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo(){
        return titulo;
    }

    public double getPreco(){
        return preco;
    }

    public void setTitulo(String novoTitulo){
        this.titulo = novoTitulo;
    }

    public void setPreco(double novoPreco){
        this.preco = novoPreco;
    }
}
