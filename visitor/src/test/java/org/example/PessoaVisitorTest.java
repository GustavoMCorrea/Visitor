package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirPaciente() {
        Paciente paciente = new Paciente("Maria", "15243562155", new Leito("UTI"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Paciente{Cpf =15243562155,Nome ='Maria',Leito =UTI}", visitor.exibir(paciente));
    }

    @Test
    void deveExibirEnfermeiro() {
        Enfermeiro enfermeiro = new Enfermeiro("José", "123.4568");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Enfermeira{COREN = 123.4568,Nome ='José'}", visitor.exibir(enfermeiro));
    }

    @Test
    void deveExibirMedico() {
        Medico medico = new Medico("Rita", "123.4568");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Medico{CRM =123.4568, nome='Rita'}", visitor.exibir(medico));
    }

}