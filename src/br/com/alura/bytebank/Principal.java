package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Bytebank");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("José");
        funcionario.setMatricula(123);
        funcionario.setDataNascimento(LocalDate.of(1984, 05, 11));
        System.out.println(funcionario);
    }
}
