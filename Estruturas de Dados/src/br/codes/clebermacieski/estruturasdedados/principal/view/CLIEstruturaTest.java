package br.codes.clebermacieski.estruturasdedados.principal.view;

import br.codes.clebermacieski.estruturasdedados.principal.controller.EstruturasdeDadosController;
import br.codes.clebermacieski.estruturasdedados.principal.model.EstruturaDeDados;
import br.codes.clebermacieski.estruturasdedados.principal.model.pilha.Pilha;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CLIEstruturaTest {

    @Test
    void mostrarOperacoes() {
        var cli = new CLIEstrutura(new Pilha());
        cli.mostrarOperacoes();
    }

    @Test
    void pegarOpcao() {
        var cli = new CLIEstrutura(new Pilha(), new ByteArrayInputStream("Inserir elemento".getBytes()));

        try {
            assertEquals("Inserir elemento",cli.pedirOpcao());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}