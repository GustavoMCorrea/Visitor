package org.example;

public class Medico implements Pessoa {
    private String nome;
    private String CRM;

    public Medico(String nome, String CRM) {
        this.nome = nome;
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public String getCRM() {
        return CRM;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirMedico(this);
    }
}
