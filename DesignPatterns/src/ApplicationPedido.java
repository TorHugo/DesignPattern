import model.GerarPedido;
import service.pedido.GerarPedidoHandler;
import service.pedido.acao.EnviarEmailPedido;
import service.pedido.acao.SalvarPedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class ApplicationPedido {

    public static void main(String[] args) {
        String cliente = "Victor Hugo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        Integer quantidadeItens = Integer.parseInt("2");

        GerarPedido pedido = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(
                Arrays.asList(new SalvarPedido(), new EnviarEmailPedido())
        );
        handler.execute(pedido);
    }

}
