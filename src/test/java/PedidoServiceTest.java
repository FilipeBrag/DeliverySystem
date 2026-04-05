import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoServiceTest {

    private PedidoService service = new PedidoService();

    @Test
    @DisplayName("Deve calcular o valor total do pedido")
    void calcularTotal() {
        Produto produto = new Produto("Sofa", 500.0,Categorias.MOVEIS);
        Cliente cliente = new Cliente("João","Av. Paulista, 123");

        Pedido pedido = new Pedido(produto, cliente, 2);

        service.calcularValorTotal(pedido);

        assertEquals(1000.0, pedido.getValorTotal());
    }

    @Test
    @DisplayName("Deve gerar um pedido")
    void gerarPedido() {
        Produto produto = new Produto("Camiseta Branca", 30.0,Categorias.MODA);
        Cliente cliente = new Cliente("Sabrina","Av São Carlos, 123");

        service.gerarPedido(produto, cliente, 3);

        assertEquals(1, cliente.getPedidos().size());
        Pedido pedido = cliente.getPedidos().get(0);
        assertEquals(90.0, pedido.getValorTotal());
    }

    @Test
    @DisplayName("Deve finalizar um pedido")
    void finalizarPedido() {
        Produto produto = new Produto("Iphone 17", 10000.0, Categorias.ELETRONICOS);
        Cliente cliente = new Cliente("Lucas","Rua 15 de novembro, 123");

        Pedido pedido = new Pedido(produto, cliente, 1);
        service.finalizarPedido(pedido);

        assertEquals(Status.ENTREGUE, pedido.getStatus());
    }

    @Test
    @DisplayName("Deve atualizar a quantidade de um pedido")
    void atualizarPedido() {
        Produto produto = new Produto("TvOled", 2000.0, Categorias.ELETRODOMESTICOS);
        Cliente cliente = new Cliente("Trojan","Rua Maestro joão sales, 123");

        Pedido pedido = new Pedido(produto, cliente, 1);
        service.atualizarPedido(3, pedido);

        assertEquals(3, pedido.getQuantidade());
        assertEquals(6000.0, pedido.getValorTotal());

    }

    @Test
    @DisplayName("Deve cancelar um pedido")
    void cancelarPedido() {
        Produto produto = new Produto("Geladeira", 6000.0,Categorias.ELETRODOMESTICOS);
        Cliente cliente = new Cliente("Jorge","Av Brasil, 123");

        Pedido pedido = new Pedido(produto, cliente, 1);
        service.cancelarPedido(pedido);

        assertEquals(Status.CANCELADO, pedido.getStatus());
    }


}