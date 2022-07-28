package pratica2.exercicio4.model;

public class PagamentoAVista implements RegraPagamento{
    @Override
    //a visa, desconto de 10%
    public double pagar(Venda v) {
        return v.getTotalVendido()*0.1;
    }
}
