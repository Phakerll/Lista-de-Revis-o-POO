package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args)
    {
        Funcionario funcionario = new Funcionario();
        Scanner scan = new Scanner(System.in);

        System.out.println("Id do funcionario: ");
        funcionario.setIdFunc(scan.nextInt());

        System.out.println("Nome do funcionario: ");
        funcionario.setNomeFunc(scan.nextLine());

        System.out.println("Departamento: ");
        funcionario.setDepartamento(scan.nextLine());

        System.out.println("Data de contratacao: ");
        LocalDate hoje = LocalDate.now();
        funcionario.setDataContratacao(hoje);

        System.out.println("Salario: ");
        funcionario.setSalario(scan.nextDouble());

        System.out.println("Documento: ");
        funcionario.setDocumento(scan.nextLine());

        System.out.println("Estado: ");
        funcionario.setAtivo(scan.nextBoolean());

        System.out.println("Funcionario cadastrado");
        funcionario.setAtivo(true);

        System.out.println("Aumento salarial: ");
        funcionario.atualizarSalario(scan.nextDouble());

        funcionario.imprimir();

        funcionario.demiteFuncionario();

        funcionario.imprimir();
    }
}
