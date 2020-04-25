package homework.lessonpro3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook implements IntPhoneBook {
    public static void main(String[] args) {
        IntPhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Анастасия", "000-0001");
        phoneBook.add("Катя", "000-0002");
        phoneBook.add("Маша", "000-0003");
        phoneBook.add("Анастасия", "000-0004");
        Set<String> allNames = phoneBook.getAllNames();
        for (String name : allNames) {
            Set<String> phones = phoneBook.get(name);
            System.out.printf("%s: %s%n", name, phones);
        }
    }
    private final Map<String, Set<String>> phonesByName = new TreeMap<>();

    @Override
    public void add(String name, String phoneNumber) {
        Set<String> phones = getPhones(name);
        phones.add(phoneNumber);
    }

    private Set<String> getPhones(String name) {
        return phonesByName.computeIfAbsent(name, key -> new HashSet<>());
    }
    @Override
    public Set<String> get(String name) {
        return getPhones(name);
    }

    @Override
    public Set<String> getAllNames() {
        return phonesByName.keySet();
    }
}