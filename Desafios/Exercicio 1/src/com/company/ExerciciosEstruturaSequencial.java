package com.company;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosEstruturaSequencial {


    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {

        int num1 = sc.nextInt();
        sc.nextLine();
        int num2 = sc.nextInt();

        int result = num1 + num2;

        System.out.printf("SOMA = %d", result);

        sc.close();
    }

    public void Exercicio2() {

        double pi = 3.14159;

        double raio = sc.nextDouble();

        double area = pi * (Math.pow(raio, 2));

        System.out.printf("A=%.4f", area);

        sc.close();
    }

    public void Exercicio3() {

        int A = sc.nextInt();
        sc.nextLine();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();
        sc.nextLine();
        int D = sc.nextInt();

        int result = A * B - C * D;

        System.out.printf("DIFERENCA = %d", result);

        sc.close();
    }

    public void Exercicio4() {

        int number = sc.nextInt();
        sc.nextLine();
        int hours = sc.nextInt();
        sc.nextLine();

        double hourSalary = sc.nextDouble();

        double salaryResult = hourSalary * hours;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f", salaryResult);

        sc.close();
    }

    public void Exercicio5() {
        sc.nextInt();
        int numbersPeace1 = sc.nextInt();

        double valuePeace1 = sc.nextDouble();
        sc.nextLine();

        sc.nextInt();
        int numbersPeace2 = sc.nextInt();
        double valuePeace2 = sc.nextDouble();

        double valueTotalPeace1 = numbersPeace1 * valuePeace1;
        double valueTotalPeace2 = numbersPeace2 * valuePeace2;

        double total = valueTotalPeace1 + valueTotalPeace2;

        System.out.printf("VALOR A PAGAR: R$ %.2f ", total);

        sc.close();
    }


}
