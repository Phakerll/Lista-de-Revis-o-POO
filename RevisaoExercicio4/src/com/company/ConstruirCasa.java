package com.company;

import java.util.Scanner;

public class ConstruirCasa {

    public static void main(String[] args)
    {
        Casa casa = new Casa();
        Scanner scan = new Scanner(System.in);

        System.out.println("Cor da casa: ");
        casa.setCor(scan.nextLine());

        System.out.println("Existe porta ? ");
        casa.setPorta1(scan.nextBoolean());

        System.out.println("Existe outra porta ");
        casa.setPorta2(scan.nextBoolean());

        System.out.println("Mais uma porta ? ");
        casa.setPorta3(scan.nextBoolean());

        casa.pinta();

        casa.abre1();
        casa.fecha1();
        casa.abre3();
        casa.abre2();
        casa.fecha2();
    }
}
