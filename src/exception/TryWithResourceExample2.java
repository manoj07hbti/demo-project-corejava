package exception;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceExample2 {
    public static void main(String[] args) {
        String filePath = "output.txt";

        // FileWriter auto-closes after try block
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, World!\n");
            writer.write("Try-with-resources makes life easier.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
