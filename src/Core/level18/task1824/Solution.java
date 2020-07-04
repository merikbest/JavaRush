package Core.level18.task1824;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String fileName = "";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                while (true) {
                    fileName = reader.readLine();
                    FileInputStream fis = new FileInputStream(fileName);
                    fis.close();
                }
        } catch (FileNotFoundException e) {
            System.out.println(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}