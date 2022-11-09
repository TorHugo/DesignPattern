package service.imposto;

import model.Orcamento;

import java.math.BigDecimal;

public class ICMS implements TipoEmposto{

    public BigDecimal calcular(Orcamento orcamento){

        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
