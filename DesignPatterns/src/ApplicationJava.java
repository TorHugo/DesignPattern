import model.Orcamento;
import service.CalculadoraDeImposto;
import service.imposto.ICMS;
import service.imposto.ISS;

import java.math.BigDecimal;

public class ApplicationJava {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();

        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
