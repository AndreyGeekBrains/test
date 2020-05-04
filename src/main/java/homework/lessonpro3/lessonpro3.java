package homework.lessonpro3;

import java.util.LinkedHashMap;
import java.util.Map;

public class lessonpro3 {
    public static void main(String[] args) {
        Map<String, Integer> frequencyByWord = new LinkedHashMap<>();
        for (String word : DATA) {
            frequencyByWord.merge(word, 1, Integer::sum);
        }
        frequencyByWord.forEach((word, frequency) -> System.out.println(word + ": " + frequency));
    }
    private static final String[] DATA = {
            "Создать", "массив", "с", "набором",
            "слов", "10", "20", "слов", "должны", "встречаться", "повторяющиеся", "Найти",
            "и", "вывести", "список", "уникальных", "слов", "из", "которых", "состоит",
            "массив", "дубликаты", "не", "считаем", "Посчитать", "сколько", "раз", "встречается", "каждое", "слово"
    };
}

