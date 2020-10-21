package com.company;

public class Porta
{
    public boolean aberta;
    public String cor;
    public double dimensaoX;
    public double dimensaoY;
    public double dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre()
    {
        this.aberta = true;
    }

    public void fecha()
    {
        this.aberta = false;
    }

    public void pinta()
    {
        this.cor = "amarelo";
    }

    public void estaAberta()
    {
        if (aberta = true)
            System.out.println("Sim ela esta aberta");
        else
            System.out.println("Ela nao esta aberta");
    }
}

