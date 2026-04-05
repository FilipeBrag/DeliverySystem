import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cliente {
    private final String idCliente = UUID.randomUUID().toString();
    private String nome;
    private String endereco;
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
