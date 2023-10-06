package Seminar_2;

public class program2 {

    /*
     * Напишите метод, который сжимает строку.
     * Пример: вход aaaabbbcdd.
     * Результат: a4b3cd2
     */
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(zipString(str));
    }
    public static String zipString( String line){
        StringBuilder sb = new StringBuilder();
        char[] ch_line = line.toCharArray();
        int count = 1;
        for (int i = 0; i < ch_line.length-1; i++) {
            if(ch_line[i] == ch_line[i+1]){
                count++;
            }else{
                sb.append(ch_line[i]);
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
