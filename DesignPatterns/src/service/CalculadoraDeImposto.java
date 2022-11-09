package service;

import model.Orcamento;
import service.imposto.TipoEmposto;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoEmposto tipoEmposto){
        return tipoEmposto.calcular(orcamento);
    }
}
