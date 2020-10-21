package com.company;

public class Casa
{
    public String cor;
    public boolean estadoPorta;
    public boolean porta1;
    public boolean porta2;
    public boolean porta3;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEstadoPorta() {
        return estadoPorta;
    }

    public void setEstadoPorta(boolean estadoPorta) {
        this.estadoPorta = estadoPorta;
    }

    public boolean isPorta1() {
        return porta1;
    }

    public void setPorta1(boolean porta1) {
        this.porta1 = porta1;
    }

    public boolean isPorta2() {
        return porta2;
    }

    public void setPorta2(boolean porta2) {
        this.porta2 = porta2;
    }

    public boolean isPorta3() {
        return porta3;
    }

    public void setPorta3(boolean porta3) {
        this.porta3 = porta3;
    }

    public void pinta()
    {
        this.cor = "vermelho";
    }

    public void abre1()
    {
        this.porta1 = true;
    }

    public void fecha1()
    {
        this.porta1 = false;
    }

    public void abre2()
    {
        this.porta2 = true;
    }

    public void fecha2()
    {
        this.porta2 = false;
    }

    public void abre3()
    {
        this.porta3 = true;
    }

    public void fecha3()
    {
        this.porta3 = false;
    }

    public int qtdPortasAbertas(int qtdAbertas)
    {
        if (porta1 = true)
            qtdAbertas++;

        if (porta2 = true)
            qtdAbertas++;

        if (porta3 = true)
            qtdAbertas++;

        return qtdAbertas;
    }
}
