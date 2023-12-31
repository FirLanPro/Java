package Seminar_1;
import java.time.LocalTime;
import java.util.Scanner;

public class program {
    /*В консоли запросить имя пользователя. В зависимости от текущего времени,
     вывести приветствие вида 
    "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    "Доброй ночи, <Имя>!", если время от 23:00 до 4:59 */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Как Вас зовут? ");
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро, " + name);
        } else if (hour >= 12 && hour < 18){
            System.out.println("Доброе день, " + name);
        }else if (hour >= 18 && hour < 23){
            System.out.println("Доброе вечер, " + name);
        } else {
            System.out.println("Доброе ночи, " + name);
        }
        
        scanner.close();
    }
}

    
