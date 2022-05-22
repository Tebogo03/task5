package Com.Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        int a;
        try {

            fis = new FileInputStream("test123");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        try {
            do {
                a=fis.read();
                if(a != -1) System.out.println((char) a);
            }
            while (a != -1);
        }
        catch (IOException e){
            System.out.println("Error reading file");
        }
        finally {
            try {
                fis.close();
            }
            catch (IOException e)
            {
                System.out.println("Error");
            }

        }
    }
}
