package Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("test.txt");
            file.write("Hello Java!");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
