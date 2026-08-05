
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//reading from one file and write in another file
public class readAndwrite{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File name (file name with extension): ");
        String name = sc.nextLine();
        try {
            BufferedReader br = new BufferedReader(new FileReader(name));
            String Line, content ="";
            while ((Line = br.readLine()) != null) { 
                content = content + Line +"\n";
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter("MasterWriter.txt"));
            bw.write(content);
            bw.close();
            
        } catch (IOException e) {
            System.out.print("Somthing errore occured!");
        }
    }
}