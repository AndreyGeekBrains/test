package homework.lessonpro3;

import java.util.Set;

public interface IntPhoneBook {
    void add(String name, String phoneNumber);
    Set<String> get(String name);
    Set<String> getAllNames();
}