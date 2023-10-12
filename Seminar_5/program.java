package Seminar_5;

import java.util.HashMap;
import java.util.Map;

public class program {
    /*
     * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
     * организации.
     * 123456 Иванов
     * 321456 Васильев
     * 234561 Петрова
     * 234432 Иванов
     * 654321 Петрова
     * 345678 Иванов
     * Вывести данные по сотрудникам с фамилией Иванов.
     * 
     */

    static Map<String, String> passports = new HashMap<>();
    public static void main(String[] args) {
       
        // program passports = new Passports(); //////
        
        passports.put("123456", "Иванов");
        passports.put("321456", "Васильев");
        passports.put("234561", "Петрова");
        passports.put("234432", "Иванов");
        passports.put("654321", "Петрова");
        passports.put("345678", "Иванов");

        System.out.println(findByName("Иванов"));
        System.out.println();
        System.out.println(getFullList());

     
    }
    // static void add(String passport, String lastName){
    //     passports.put(passport, lastName);

    static String findByName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        
        for (Map.Entry<String, String> entry: passports.entrySet()){
            String numPassport = entry.getKey();
            String name = entry.getValue();
            if (name.equals(lastName)){
                stringBuilder.append(numPassport);
                stringBuilder.append(": ");
                stringBuilder.append(name);
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }

    static String getFullList(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: passports.entrySet()){
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}




     


