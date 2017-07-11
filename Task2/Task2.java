package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 22.06.2017.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/Task2/in.txt"));
        String line;
        ArrayList<String> lines = new ArrayList<String>();
        int k = reader.read();
        while ((line = reader.readLine()) != null) {
            if (line.length() >= k) {
                lines.add(line);
            }
        }
        for (int i = 0; i < lines.size(); i++) {
        for (int i = 1; i < k; i++) {
            char [] ch =  lines..toCharArray();
        }
    }
}
