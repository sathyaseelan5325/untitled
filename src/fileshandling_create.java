import java.io.File;
import java.lang.reflect.Field;

public class filehandling_create {
    public static void main(String[] args) {
        String fileName="example.txt";
        File file=new File(fileName);
        if(file.createNewFile())
        {
            System.out.println("file created successfully!");
        }
        else
        {
            System.out.println("file already exists or failed to create");
        }
    }
}
