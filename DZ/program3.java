package DZ;
/*алгоритм сортировки числового массива, результат после каждой итерации запишите в лог-файл */
import java.io.FileWriter;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

public class program3 {

    public static void main(String[] args) throws Exception {
        int[] mas = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
        sort(mas);
    }
    static void sort(int[] mas) throws Exception {
        FileWriter fileWriter = new FileWriter("log.txt");
        Date dateNow = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        int n = mas.length-1;
        int temp =0 ;
        while (n>0)
        {   
            int max=0;
            for (int j=0; j<=n; j++)
            {
                if (mas[j]>mas[max])
                {
                    max = j;
                }
            }
            temp = mas[max];
            while (max < n)
            {
                mas[max] = mas[max+1];
                max++;
            }
            mas[n] = temp;
            n= n-1;
            System.out.println(Arrays.toString(mas));
            fileWriter.write( date.format(dateNow).toString() + " ");
            fileWriter.write( Arrays.toString(mas) + "\n");
        }
        fileWriter.close();
    }
       
}
