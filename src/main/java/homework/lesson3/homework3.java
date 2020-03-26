package homework.lesson3;

import java.util.Random;
import java.util.Scanner;

public class homework3 {

    private static Random random = new Random();

    public static void main(String[] args) {
        mulBy1();
        mulBy2();
    }

    //Написать программу, которая загадывает случайное число от 0 до 9, и пользователю
    // дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить
    // больше ли указанное пользователем число чем загаданное, или меньше. После победы
    // или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    private static void mulBy1() {
        Scanner scanner = new Scanner(System.in);
        do {
            int a = random.nextInt(9);
            System.out.println("Угдай число 0 до 9 за 3 попытки");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введи число");
                int b = scanner.nextInt();
                if (b == a) {
                    System.out.println("Вы угадали!");
                    break;
                }
                System.out.println(b > a ? "Введенное чилсо больше " : "Введенное число меньше ");
                System.out.println((i-1) > 0 ? " у вас осталось " + (i-1) + " попыток." : "Попытки закончились.");

            }
            System.out.println("Загаданное число  " + a);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (scanner.nextInt() == 1);
    }

    //Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
    // "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
    // "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
    // Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.

    private static void mulBy2() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int iWord = random.nextInt(words.length - 1);
        String word = words[iWord];
        int lenWord = word.length();
        System.out.println("Игра Угадайте слово");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введи слово");
            String answer = scanner.nextLine();
            if (answer.equals(""))
                break;
            else if (word.equals(answer)) {
                System.out.println("Вы угадали!");
                break;
            }
            char[] charsAnswer = answer.toCharArray();
            for (int i = 0; i < lenWord; i++) {
                if (i >= charsAnswer.length)
                    break;
                if (word.charAt(i) != charsAnswer[i]) charsAnswer[i] = '#';
            }
            StringBuilder comment = new StringBuilder(String.valueOf(charsAnswer));
            for (int i = comment.length(); i < 15; i++) comment.append("#");
            System.out.println(comment);
        }
        while (true);
    }
}


//    import java.util.Scanner;
//
//    public class homework3{
//        private static Scanner scanner = new Scanner(System.in);
//            public static void main(String[] args) {
//                System.out.println("Ваша задача угадать число");
//                for (int i = 0; i < 3; i++) playLevel(i);
//                System.out.println("Попытки закончились");
//                scanner.close();
//            }
//
//        private  static  void  playLevel (int range){
//            int number = (int)(Math.random() * range);
//            while (true){
//                System.out.println("Угадайте число от 0 до " + range);
//                int input_number = scanner.nextInt();
//                if(input_number == number) {
//                    System.out.println("Вы угадали.");
//                    break;
//                } else if (input_number > number){
//                    System.out.println("Загаданное число меньше");
//
//                } else {
//                    System.out.println("Загаданное число больше");
//
//                }
//
//            }
//        }
//    }

