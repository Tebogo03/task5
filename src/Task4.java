import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class Task4 {
    public static void main(String []args) throws IOException {
        DataManagement dm = new DataManagement();
        dm.readData();
        dm.WriteDataToFile();
        System.out.println("--------------------------------------------------");
        dm.ReadDataFromFile();
    }
}

class DataManagement{

    String name;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void readData() throws IOException {
        System.out.println("what is your first name ?");
        name = br.readLine();
    }
    void WriteDataToFile() {
        try (FileWriter fr = new FileWriter("task.txt")) {
            fr.write(name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void ReadDataFromFile(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("task4.txt"))) {
            while((result=br.readLine()) !=null){
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}