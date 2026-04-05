import java.util.UUID;

public class Produto {
    private final String idProduto = UUID.randomUUID().toString();
    private String nome;
    private double precoUnitario;
    private Categorias categoria;

    public Produto(String nome, double precoUnitario, Categorias categoria) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.categoria = categoria;
    }


    public String getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return precoUnitario;
    }

    public void setPreco(double preco) {
        this.precoUnitario = preco;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
}
