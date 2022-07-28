package pratica2.exercicio4.main;

import pratica2.exercicio4.model.PagamentoAPrazo;
import pratica2.exercicio4.model.PagamentoAVista;
import pratica2.exercicio4.model.Venda;

public class Main {
    public static void main(String[] args) {
        Venda vendaAVista = new Venda();
        Venda vendaAPrazo = new Venda();

        vendaAVista.setTotalVendido(100);
        vendaAPrazo.setTotalVendido(100);

        vendaAVista.setPagamento(new PagamentoAVista());
        vendaAPrazo.setPagamento(new PagamentoAPrazo());

        System.out.println("Venda a vista, valor total: "+vendaAVista.calcularTotal()+"R$");
        System.out.println("Venda a prazo, valor total: "+vendaAPrazo.calcularTotal()+"R$");


    }
}
