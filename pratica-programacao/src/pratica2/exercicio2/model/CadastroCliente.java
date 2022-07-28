package pratica2.exercicio2.model;

import java.util.ArrayList;
import java.util.Comparator;

public class CadastroCliente {

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void adicionarCliente(Cliente c){
        clientes.add(c);
    }

    public void ordenarPorCPF(){
        clientes.sort(Comparator.comparing(Cliente::getCPF));
    }

    public void imprimir(){
        for(Cliente c: clientes){
            System.out.println(c);
        }
    }
}
