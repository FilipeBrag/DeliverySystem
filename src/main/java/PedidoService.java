import java.util.UUID;

public class PedidoService {

    public void calcularValorTotal(Pedido pedido){
        pedido.setValorTotal(0);
    }

    public void gerarPedido(Produto produto, Cliente cliente, int quantidade){
        Pedido novoPedido = new Pedido(produto, cliente, quantidade);
        calcularValorTotal(novoPedido);
        cliente.getPedidos().add(novoPedido);
    }

    public void finalizarPedido(Pedido pedido){
        if(pedido.getStatus() == Status.CRIADO){
            pedido.setStatus(Status.ENTREGUE);
        }
    }

    public void atualizarPedido(int novaQuantidade, Pedido pedido){
        pedido.setQuantidade(novaQuantidade);
        calcularValorTotal(pedido);
    }

    public void cancelarPedido(Pedido pedido){
        if(pedido.getStatus() == Status.CRIADO){
            pedido.setStatus(Status.CANCELADO);
        }
    }

}
