package com.company;

import java.util.Scanner;

public class MontagemPorta {

    public static void main(String[] args)
    {
        Porta portaCozinha = new Porta();
        Scanner scan = new Scanner(System.in);

        System.out.println("Cor da porta: ");
        portaCozinha.setCor(scan.nextLine());

        System.out.println("Dimensao 1: ");
        portaCozinha.setDimensaoX(scan.nextDouble());

        System.out.println("Dimensao 2: ");
        portaCozinha.setDimensaoY(scan.nextDouble());

        System.out.println("Dimensao 3: ");
        portaCozinha.setDimensaoZ(scan.nextDouble());

        portaCozinha.abre();

        portaCozinha.fecha();

        portaCozinha.pinta();

        portaCozinha.estaAberta();
    }
}
