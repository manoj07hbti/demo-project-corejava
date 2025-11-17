package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample1 {
    public static void main(String[] args) {
        String filePath = "C:\\TRAINING\\WORKSPACE\\demo-project-corejava-MASTER\\src\\exception\\example.txt";

        // try-with-resources will auto-close BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
