package br.com.alura.bytebank.io.teste;

import br.com.alura.bytebank.io.LeitorCSV;
import br.com.alura.bytebank.model.Pagamento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeitorCSVTest {

    @Test
    void pagamentoDeAbril() throws IOException {
        LeitorCSV leitorCSV = new LeitorCSV();
        List<Pagamento> pagamentos = leitorCSV.ler(1);
        Assertions.assertEquals(5, pagamentos.size());
    }

    @Test
    void pagamentoDeMaio() throws IOException {
        LeitorCSV leitorCSV = new LeitorCSV();
        List<Pagamento> pagamentos = leitorCSV.ler(3);
        Assertions.assertEquals(5, pagamentos.size());
    }

    @Test
    void pagamentoDeJunho() throws IOException {
        LeitorCSV leitorCSV = new LeitorCSV();
        List<Pagamento> pagamentos = leitorCSV.ler(2);
        Assertions.assertEquals(5, pagamentos.size());
    }
}