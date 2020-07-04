package Core.level18.task1822;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fReader = new BufferedReader(new FileReader(reader.readLine()))) {

            String line;

            while ((line = fReader.readLine()) != null) {
                if (line.startsWith(args[0] + " ")) {
                    System.out.println(line);
                    break;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}