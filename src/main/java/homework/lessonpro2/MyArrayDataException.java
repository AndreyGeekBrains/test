package homework.lessonpro2;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String cellValue, int rowIndex, int colIndex) {
        super(String.format("Неверное значение '%s' в ячейке масива[%d][%d], должно быть целое число",
                cellValue, rowIndex, colIndex));
    }
}