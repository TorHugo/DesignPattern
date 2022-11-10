package service.desconto;

import model.Orcamento;

import java.math.BigDecimal;

public class DescontoPorValor extends Desconto{

    public DescontoPorValor(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {

        return  orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
