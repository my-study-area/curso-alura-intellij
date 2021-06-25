package br.com.alura.bytebank;

import br.com.alura.bytebank.io.LeitorCSV;
import br.com.alura.bytebank.model.Pagamento;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class Principal {
    static final Logger logger = Logger.getLogger(Principal.class);

    public static void main(String[] args) throws IOException {
//        new OpcoesPagamento().mensagemDeBoasVindas();
        LeitorCSV leitorCSV = new LeitorCSV();
        List<Pagamento> pagamentos = leitorCSV.ler(1);
        for (Pagamento pagamento :
                pagamentos) {
            double valorBruto = pagamento.getValor();
            if (valorBruto > 100) {
                double valorComAcrescimo = valorBruto * 1.1;
                pagamento.setValor(valorComAcrescimo);
            }
            System.out.println(pagamento.toString());

        }

        if(true) {
            System.out.println("if pronto");
        }

    }

}
