package com.company;

public class Pessoa
{
    public String nomePessoa;
    public int idadePessoa;

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public void fazAniversario()
    {
        this.idadePessoa = idadePessoa + 1;
    }

    public void imprimir()
    {
        System.out.println("A pessoa " + nomePessoa + "esta com " + idadePessoa);
    }
}
