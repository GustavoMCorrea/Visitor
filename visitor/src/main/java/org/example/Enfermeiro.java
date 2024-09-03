package org.example;

public class Enfermeiro implements Pessoa{
    private String nome;
    private String coren;

    public Enfermeiro(String nome, String coren) {
        this.nome = nome;
        this.coren = coren;
    }

    public String getNome() {
        return nome;
    }

    public String getCoren() {
        return coren;
    }


    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirEnfermeiro(this);
    }
}
