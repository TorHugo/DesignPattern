package service.desconto;

import model.Orcamento;

import java.math.BigDecimal;

public class DescontoPorItens extends Desconto {

    public DescontoPorItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){

        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
