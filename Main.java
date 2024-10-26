package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть витрату пального (літри на 100 км): ");
        var fuelConsumption = scanner.nextDouble();

        while (true) {
            System.out.print("Введіть відстань (кілометри) або 0 для виходу: ");
            var distance = scanner.nextDouble();

            if (distance == 0) {
                break;
            }

            var totalFuel = (fuelConsumption * distance) / 100;
            System.out.println("Автомобіль витратить приблизно " + totalFuel + " літрів пального на " + distance + " км.");
        }

        scanner.close();

    }
}

