package homework.lessonpro2;

public class MyArraySizeException extends IllegalArgumentException {
    public MyArraySizeException() {
        super("Неправильный размер масива, нужен 4x4");
    }
}
