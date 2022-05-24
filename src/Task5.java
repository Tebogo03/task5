import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class Task5 {
    public static void main(String []args) throws IOException {
        System.out.println("Please enter the first three digits of your bank account");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String digits= rd.readLine();
        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))){
            String line;
            System.out.println("Searching ...");
            while((line= br.readLine())!=null){
//                System.out.println(line);
                // Putting Data into an array
                String[] words=line.split("\\t+");
                String BankNumber=words[0].trim();
                String BankName=words[1].trim();
                if(BankNumber.equals(digits)){
                    System.out.println("Done ");
                    System.out.println("Bank Digits : " +BankNumber + "\nBank Name : " +BankName);
                    break;
                }
            }
        }
        catch (IOException e){
            System.out.println("Data Loading Failed");
        }

    }
}
