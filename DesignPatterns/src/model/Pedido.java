package model;

import java.time.LocalDateTime;

public class Pedido {

    private String nmCliente;
    private LocalDateTime dtPedido;
    private Orcamento orcamento;

    public Pedido(String nmCliente, LocalDateTime dtPedido, Orcamento orcamento) {
        this.nmCliente = nmCliente;
        this.dtPedido = dtPedido;
        this.orcamento = orcamento;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public LocalDateTime getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(LocalDateTime dtPedido) {
        this.dtPedido = dtPedido;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
}
