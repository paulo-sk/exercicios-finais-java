package pratica2.exercicio2.main;

import pratica2.exercicio2.model.CadastroCliente;
import pratica2.exercicio2.model.Cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClienteMain {

    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        CadastroCliente c = new CadastroCliente();
        int n = 0;
        while(n < 2){
            System.out.print("CPF: ");
            String cpf = entrada.next();

            System.out.print("nome: ");
            String nome = entrada.next();

            System.out.print("Data de nascimento (dd/mm/aaaa): ");
            String d = entrada.next();
            DateTimeFormatter formt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(d, formt);

            System.out.print("endereco: ");
            String endereco = entrada.next();
            Cliente cliente = new Cliente(cpf,nome,data,endereco);
            c.adicionarCliente(cliente);
            n++;
        }
        c.ordenarPorCPF();
        c.imprimir();

    }

}
