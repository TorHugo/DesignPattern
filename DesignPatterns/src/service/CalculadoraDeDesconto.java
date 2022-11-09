package service;

import model.Orcamento;
import service.desconto.Desconto;
import service.desconto.DescontoPorItens;
import service.desconto.DescontoPorValor;
import service.desconto.SemDesconto;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoPorItens(
                new DescontoPorValor(
                        new SemDesconto()
                )
        );

        return desconto.calcular(orcamento);
    }
}
