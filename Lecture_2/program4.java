// создание каталога
import java.io.File;

public class program4 {

    public static void main(String[] args) {
        String pathProject = System.getProperty ("user.dir" );
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath ());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }
    }

}
