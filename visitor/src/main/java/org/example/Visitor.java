package org.example;

public interface Visitor {

    String exibirPaciente(Paciente paciente);
    String exibirEnfermeiro(Enfermeiro enfermeiro);
    String exibirMedico(Medico medico);
}
