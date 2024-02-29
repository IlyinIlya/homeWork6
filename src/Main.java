public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //С помощью цикла for выведите в консоль все числа от 1 до 10.
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println("");
        System.out.println("Task 2");
        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }

        System.out.println("");
        System.out.println("Task 3");
        //Выведите в консоль все четные числа от 0 до 17/
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(" " + i);
        }

        System.out.println("");
        System.out.println("Task 4");
        //Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        for (int i = 10; i >= -10; i--) {
            System.out.print(" " + i);
        }

        System.out.println("");
        System.out.println("Task 5");
        //Напишите программу, которая выводит в консоль все високосные года,
        //начиная с 1904 года до 2096. В консоль результат должен выводиться
        //в формате: «… год является високосным».
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.print(" " + year);
        }

        System.out.println("");
        System.out.println("Task 6");
        // Напишите программу, которая выводит в консоль последовательность чисел:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(" " + i);
        }

        System.out.println("");
        System.out.println("Task 7");
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i <= 512; i = i*2) {
            System.out.print(" " + i);
        }

        System.out.println("");
        System.out.println("Task 8");
        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц
        //вы будете откладывать по 29 000 рублей «в банку».
        //Выведите сумму накоплений за каждый месяц в консоль в формате:
        //«Месяц …, сумма накоплений равна … рублей».
        int total = 0;
        int salaryMonth = 29000;
        for (int month = 1; month <= 12; month++) {
            total = total + salaryMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task 9");
        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете
        //не «в банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений
        //за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + total/100;
            total = total + salaryMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task 10");
        //Напишите программу, которая выводит в консоль таблицу умножения на 2.
        total = 2;
        for (int i = 2, j = 1; j <= 10; j++, total = i * j) {
            System.out.println(i + " * " + j + " = " + total);
        }

        System.out.println("Task 10 - 2 way");
        int y = 2;
        for (int i = 1; i <= 10; i++) {
            int x = y * i;
            System.out.println(y + " * " + i + " = " + x);
        }
        }
}
