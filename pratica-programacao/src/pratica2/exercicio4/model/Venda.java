package pratica2.exercicio4.model;

public class Venda {
    private double totalVendido;
    private RegraPagamento pagamento;

    public void setPagamento(RegraPagamento pagamento){
        this.pagamento = pagamento;
    }

    public double calcularTotal(){
        if(this.pagamento instanceof PagamentoAVista)
            return this.totalVendido - this.pagamento.pagar(this);
        else
           return this.totalVendido + this.pagamento.pagar(this);
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }
}
