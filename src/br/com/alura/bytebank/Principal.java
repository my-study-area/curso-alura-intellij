package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Bytebank");
        Funcionario funcionario = new Funcionario("José", 123, LocalDate.of(1984, 05, 11));
        Funcionario maria = new Funcionario("Maria", 234, LocalDate.of(1999, 12, 21));
        System.out.println(funcionario);
        System.out.println(maria);
    }
}
