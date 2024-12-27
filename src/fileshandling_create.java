import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
///file.createNewFile() method
public class fileshandling_create {
    public static void main(String[] args) throws IOException {
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


/// fileoutputstream() construtor
public class fileshandling_create {
    public static void main(String[] args) throws IOException {
        String fileName="example1.txt";
        try(FileOutputStream obj=new FileOutputStream(fileName))
        {
            System.out.println("file created successfully!");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}

/// File.write method using for smaller data use this.
public class fileshandling_create {
    public static void main(String[] args) throws IOException {
        String fileName="example2.txt";
        try
        {
            Files.write(Paths.get(fileName),"The output stream \nis used to write data to \n numerous output devices like the \nmonitor, file, etc. OutputStream is an \n abstract superclass that\n represents an output stream.\n OutputStream is an abstract\n class and because of this, it i\ns not useful by itself. \nHowever, its subclasses\n are used to write data.".getBytes());
            System.out.println("file created successfully!");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}

 */