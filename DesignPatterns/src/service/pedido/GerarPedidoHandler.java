package service.pedido;

import model.GerarPedido;
import model.Orcamento;
import model.Pedido;

import java.time.LocalDateTime;

public class GerarPedidoHandler {

    public void execute(GerarPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvando pedido.");
        System.out.println("Enviando e-mail.");
    }
}
