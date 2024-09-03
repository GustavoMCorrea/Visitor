package org.example;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirPaciente(Paciente paciente) {
        return "Paciente{" +
                "Cpf =" + paciente.getCpf() +
                ",Nome ='" + paciente.getNome() + '\'' +
                ",Leito =" + paciente.getDescricaoLeito() +
                '}';
    }

    @Override
    public String exibirEnfermeiro(Enfermeiro enfermeiro) {
        return "Enfermeira{" +
                "COREN = " + enfermeiro.getCoren() +
                ",Nome ='" + enfermeiro.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirMedico(Medico medico) {
        return "Medico{" +
                "CRM =" + medico.getCRM() +
                ", nome='" + medico.getNome() + '\'' +
                '}';
    }
}
