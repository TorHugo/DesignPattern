import model.GerarPedido;
import service.pedido.GerarPedidoHandler;

import java.math.BigDecimal;

public class ApplicationPedido {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        Integer quantidadeItens = Integer.parseInt(args[2]);

        GerarPedido pedido = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler();
        handler.execute(pedido);
    }

}
