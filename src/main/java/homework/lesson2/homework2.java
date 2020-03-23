package homework.lesson2;

public class homework2 {

    public static void main(String[] args) {
        mulBy1();
        mulBy2();
        mulBy3();
        mulBy4();
        mulBy5();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(mulBy6(arr));
        mulBy7(arr, 3);
        mulBy7(arr, -3);
    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void mulBy1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + " ");
            }
    }

    //Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void mulBy2() {
        System.out.println(" ");
        int[] arr = new int[8];
        for (int i = 1, j = 0; i < arr.length; i++){
            arr[i] = j += 3;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void mulBy3() {
        System.out.println(" ");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void mulBy4() {
        System.out.println(" ");
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0, b = arr[i].length; a < arr[i].length; a++, b--) {
                if (i == a || i == (b - 1)) arr[i][a] = 1;
                System.out.print(arr[i][a] + " ");
            }
            System.out.print("\r\n");
        }
    }

    //Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)

    public static void mulBy5() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный элемент  " + min);
    }




    //Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.

    private static boolean mulBy6(int[] arrParam) {
        int lSum, rSum;
        for (int i = 0; i < arrParam.length + 1; i++) {
            lSum = 0;
            rSum = 0;
            for (int j = 0; j < i; j++) {
                lSum += arrParam[j];
            }
            for (int j = i; j < arrParam.length; j++) {
                rSum += arrParam[j];
            }
            if (lSum == rSum) return true;
        }
        return false;
    }

    //Написать метод, которому на вход подается одномерный массив и число n
    //(может быть положительным, или отрицательным), при этом метод должен сместить
    // все элементымассива на n позиций.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.

    private static void mulBy7(int[] arrParam, int n) {
        for (int i : arrParam) System.out.print(i + " ");
        System.out.println("\r\n");

        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = arrParam[arrParam.length - 1];
                if (arrParam.length - 1 >= 0) System.arraycopy(arrParam, 0, arrParam, 1, arrParam.length - 1);
                arrParam[0] = buf;
                for (int i : arrParam) System.out.print(i + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = arrParam[0];
                System.arraycopy(arrParam, 1, arrParam, 0, arrParam.length - 1);
                arrParam[arrParam.length - 1] = buf;
                for (int i : arrParam) System.out.print(i + " ");
                System.out.print("\r\n");
            }
        }
    }



}
