
/*Создать строку из плюсиков */
public class program {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        String str = "";
        StringBuilder sb =  new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            str +="+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis()-s);
        System.out.println(str);
        System.out.println(sb);
    
    }
}
