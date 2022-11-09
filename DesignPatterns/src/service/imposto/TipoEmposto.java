package service.imposto;

import model.Orcamento;

import java.math.BigDecimal;

public interface TipoEmposto {
    BigDecimal calcular (Orcamento orcamento);
}
