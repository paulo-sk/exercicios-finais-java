package pratica2.exercicio2.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private String CPF;
    private String nome;
    private LocalDate dataNascimento;
    private String endereco;

    public Cliente(String CPF, String nome, LocalDate dataNascimento, String endereco) {
        this.CPF = CPF;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "CPF='" + CPF + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
