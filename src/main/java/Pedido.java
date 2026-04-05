import java.util.List;
import java.util.UUID;

public class Pedido {
    private final String idPedido = UUID.randomUUID().toString();
    private Produto produto;
    private Cliente cliente;
    private int quantidade;
    private double valorTotal;
    private Status status;

    public Pedido() {
    }

    public Pedido(Produto produto, Cliente cliente, int quantidade) {
        this.produto = produto;
        this.cliente = cliente;
        this.quantidade = quantidade;
        this.status = Status.CRIADO;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
