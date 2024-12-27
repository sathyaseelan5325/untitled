import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
/// file.createNewFile() method ( FileWriter writer=new FileWriter(fileName);,writer.write)
public class fileshandling_write {
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("file created successfully!");
            } else {
                System.out.println("file already exists or failed to create");
            }
            FileWriter writer=new FileWriter(fileName);
            writer.write("welcome to tutorials points");
            writer.write("\nwelcome to web develop points");
            writer.write("\nwelcome to java tutorials points");
            writer.write("\nwelcome to python tutorials points");
            writer.write("\nwelcome to cyber security tutorials points");
            System.out.println("content written to the file successfully");
            writer.close();
            }

        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}


/// FileOutputStream constructor (byte[] bytes=content.getBytes();)
public class fileshandling_write {
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
        File file = new File(fileName);
        String content="welcome to tutorialspoint";

        try(FileOutputStream fos=new FileOutputStream(fileName)) {
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            System.out.println("content has been written to the file.");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
 */
/// Files.write(Paths.get(),content.getBytes()) method
public class fileshandling_write {
    public static void main(String[] args) throws IOException {
        String fileName = "example2.txt";
        String content="welcome \n to \n tutorials\npoint  ";

        try {
            Files.write(Paths.get(fileName),content.getBytes());
            System.out.println("Files written successfully");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}