package Seminar_2;

public class program3 {
    /*
     * Напишите метод,
     * который принимает на вход строку (String)
     * и определяет является ли строка палиндромом (возвращает boolean значение).
     * 
     * Полиндром - Слово или фраза,
     * которые одинаково читаются слева направо и справа налево.
     */
    public static void main(String[] args) {
        String s = "потоп";

    System.out.println(polindrom(s));

    }
    static boolean polindrom(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1 -i)){
                return false;
            }
            
        }
        return true;
    }
    static boolean polindrom2(String s){
        StringBuilder stringBuilder1 = new StringBuilder(s);
        String s1 = stringBuilder1.reverse().toString();
        return s.equals(s1);
    }
}
