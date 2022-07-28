package pratica2.exercicio4.model;

public class PagamentoAPrazo implements RegraPagamento{
    @Override
    //a prazo, paga + 15% do valor total
    public double pagar(Venda v) {
        return v.getTotalVendido()*0.05;
    }
}
