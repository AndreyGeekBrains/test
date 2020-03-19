package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        // вызов метода напечатает результат в консоль
        printSomething();
        // если метод что-то возвращает, его вызов лучше закинуть в
        // System.out.println(), чтобы увидеть результат работы в консоли
        mulBy1();
        System.out.println(mulBy2(10));
        mulBy3();
        mulBy4();
        mulBy5();
        mulBy6();
        mulBy7();
        mulBy8();
        mulBy9();
        mulBy10();
        mulBy11();
        mulBy12();
    }

    // метод ничего не возвращает
    public static void printSomething() {
        System.out.println("Java");  // печатается результат работы метода
    }
    // String
    public static void mulBy1() {
        String a = "Hello", b = "World";
        System.out.println(a + " " + b);
    }
    // метод обязан вернуть целое число
    public static int mulBy2(int value) {
        // метод возвращает результат без печати
        return value * 2;
    }
    //Целочисленные: byte, short, int, long
    public static void mulBy3() {
        byte a = 10;
        short b = 20;
        int c = 30;
        long e = 40L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
    }

    //Символьный: char
    public static void mulBy4() {
        char a = 'a';
        System.out.println(a);
    }

    //С плавающей запятой: float, double
    public static void mulBy5() {
        double a = 1.1;
        float b = 3.3f;
        double c = b * a;
        System.out.println(c);
    }
    //Логический: boolean
    public static void mulBy6() {
        int a = 1;
        int b = 2;
        System.out.println("a>b " + (a>b));
        System.out.println("a<b " + (a<b));
    }

    //метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода
    public static void mulBy7() {
        float a = 1f, b = 2f, c = 3f, d = 4f;
        double x = a * (b + (c / d));
        System.out.println("X = " + x);
    }

    //метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
    // пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static void mulBy8() {
        int a = 5;
        int b = 15;
        if (((a+b)<=20) && ((a+b)>=10)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //метод, которому в качестве параметра передается целое число, метод должен напечатать
    // в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.
    public static void mulBy9() {
        int a = 0;
        if (a>-1){
            System.out.println("Число положительное");
        } else {
            System.out.println("число отрицательное");
        }

    }

    //метод, которому в качестве параметра передается целое
    // число, метод должен вернуть true, если число отрицательное;
    public static void mulBy10() {
        int a = -1;
        if (a<=-1){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    //метод, которому в качестве параметра передается строка,
    // обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void mulBy11() {
        String a = "Михаил";
        System.out.println("Привет, " + a + "!");
    }

    // метод, который определяет является ли год високосным, и выводит сообщение
    // в консоль. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void mulBy12() {
        int a = 2020;
        if(a%4==0 && a%100 !=0 || a%400==0){
            System.out.println("Високосный");
        }else {
            System.out.println("Не високосный");
        }

    }

}
