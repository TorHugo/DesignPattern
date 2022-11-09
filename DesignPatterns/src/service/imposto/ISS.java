package service.imposto;

import model.Orcamento;

import java.math.BigDecimal;

public class ISS implements TipoEmposto{

    public BigDecimal calcular(Orcamento orcamento){

        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
