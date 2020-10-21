package com.company;

import java.util.Scanner;

public class CadastroPessoa {

    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome da pessoa: ");
        pessoa.setNomePessoa(scan.nextLine());

        System.out.println("Idade da pessoa: ");
        pessoa.setIdadePessoa(scan.nextInt());

        pessoa.fazAniversario();

        pessoa.imprimir();
    }
}
