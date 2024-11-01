public class Digital extends Jogo{
    private int codigo;

    public Digital (String titulo, double preco, int codigo){
        super(titulo, preco);
        this.codigo = codigo;
    }

    public void setCodigo (int newCodigo){
        this.codigo = newCodigo;
    }
    
    public int getCodigo (){
        return codigo;
    } 

    public void exibirJogo(){
        System.out.println("Título: "+getTitulo());
        System.out.println("Preço: "+getPreco());
        System.out.println("Lote: "+getCodigo());
    }
}
