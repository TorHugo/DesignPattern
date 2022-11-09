import model.Orcamento;
import service.CalculadoraDeDesconto;
import service.CalculadoraDeImposto;
import service.imposto.ICMS;
import service.imposto.ISS;

import java.math.BigDecimal;

public class ApplicationJava {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        System.out.println(calculadoraDeImposto.calcular(orcamento, new ICMS()));
        System.out.println("R$ " + calculadoraDeDesconto.calcular(orcamento));
        System.out.println("R$ " + calculadoraDeDesconto.calcular(segundoOrcamento));
    }
}
