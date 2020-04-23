package homework.lessonpro2;

public class lessonpro2 {

    public static void main(String[] args) {
        try {
            int result = sumArrayValues(DATA);
            System.out.println("Сумма чисел: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Неневерный размер массива");
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Неверные данные в массиве");
            e.printStackTrace();
        }
    }

    private static final int ARRAY_SIZE = 4;
    private static final String[][] DATA = new String[][]{
            {"AAA", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"},
    };

    private static int sumArrayValues(String[][] data) {
        checkArraySize(data);
        int sumResult = 0;
        for (int rowIndex = 0; rowIndex < data.length; rowIndex++) {
            String[] row = data[rowIndex];
            for (int colIndex = 0; colIndex < row.length; colIndex++) {
                String value = row[colIndex];
                try {
                    sumResult += Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(value, rowIndex, colIndex);
                }
            }
        }
        return sumResult;
    }

    private static void checkArraySize(String[][] data) {
        if (data.length != ARRAY_SIZE) {
            throw new MyArraySizeException();
        }
        for (String[] row : data) {
            if (row.length != ARRAY_SIZE) {
                throw new MyArraySizeException();
            }
        }
    }
}
