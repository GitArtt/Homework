package ru.geekbrains.homework1;

public class Homework1 {

        public static void main(String[] args) {
            System.out.println("Вывод решения первого задания: " + Task1.solutionOne(1, 2, 3, 4));
            System.out.println("Вывод решения второго задания: " + Task2.solutionTwo(5, 6));
            System.out.println("Вывод решения третьего задания: " + Task3.solutionThree(-1));
            System.out.println("Вывод решения четвёртого задания: " + Task4.solutionFour("Артём"));
            System.out.println("Вывод решения пятого задания: " + Task5.solutionFive(2021));
        }

    }

    class Task1 {

        public static double solutionOne(int a, int b, int c, int d) {
            return a * (b + ((double) c / d)); // пришёл в голову только такой вариант, и (a * (b + (1.0 * c / d)))
        }
    }

    class Task2 {

        public static boolean solutionTwo(int numberOne, int numberTwo) {
            int sum = numberOne + numberTwo;
            if (sum > 10 && sum <= 20) { // не совсем понял, должно ли быть только до 20 включительно, или от 10 включительно тоже?
                return true;
            } else {
                return false;
            }
        }
    }

    class Task3 {

        public static String solutionThree(int number) {
            if (number >= 0) {
                return "Число положительное";
            } else {
                return "Число отрицательное";
            }
        }
    }

    class Task4 {

        public static String solutionFour(String name) {
            return "Привет, " + name + "!";
        }
    }

    class Task5 {

        public static String solutionFive(int year) {
            if (year % 100 == 0 && year % 400 == 0) {
                    return "Год является високосным";
                } else if (year % 4 == 0 && year % 100 > 0) {
                    return "Год является високосным";
                } else if (year % 100 == 0) {
                    return "Год не является високосным";
                } else {
                    return "Год не является високосным";
            }
        }
    }
