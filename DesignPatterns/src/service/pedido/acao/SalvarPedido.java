package service.pedido.acao;

import model.Pedido;

public class SalvarPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados!");
    }
}
