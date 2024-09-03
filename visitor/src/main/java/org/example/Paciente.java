package org.example;

public class Paciente implements Pessoa{

    private String nome;
    private String cpf;
    private Leito leito;

    public Paciente(String nome, String cpf, Leito leito) {
        this.nome = nome;
        this.cpf = cpf;
        this.leito = leito;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDescricaoLeito() {
        return this.leito.getDescricao();
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirPaciente(this);
    }
}
