package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstruturaConcional {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {

        System.out.println("Quantos minutos vc gastou?");

        int minutes = sc.nextInt();

        double value = 50.00;

        if (minutes <= 100) {
            System.out.println("Valor a pagar: R$50.00");
        } else {
            double juros = (minutes - 100) * 2;
            double result = value + juros;
            System.out.printf("Valor a pagar: R$ %.2f", result);
        }
        sc.close();


    }

    public void Exercicio2() {
        int diaDaSemana = sc.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não existe esse dia da semana!");
        }
        sc.close();


    }

    public void Exercicio3() {

        System.out.println("Digite um número");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }


    public void Exercicio4() {
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }

    public void Exercicio5() {
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();



            if(number2 % number1 == 0 || number1 % number2 == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }



        sc.close();
    }

    public void Exercicio6() {
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int result = 24 - horaInicial - horaFinal;

        if(result >= 1 && result <= 24) {
            System.out.println("O JOGO DUROU " + result + " Hora(S)");
        }


    }

    public void Exercicio7() {

        int codigo = sc.nextInt();
        int quantity = sc.nextInt();
        double price = 0;


        if(codigo == 1) {
            price = 4.00;
        } else if (codigo == 2) {
            price = 4.50;
        } else if (codigo == 3) {
            price = 5.00;
        } else if (codigo == 4) {
            price = 2.00;
        } else if (codigo == 5) {
            price = 1.50;
        }

        double result = quantity * price;

        System.out.printf("Total: R$ %.2f", result);


    }



}
