package Core.level18.task1819;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str1 = reader.readLine();
            String str2 = reader.readLine();

            try (FileInputStream fis1 = new FileInputStream(str1);
                 FileInputStream fis2 = new FileInputStream(str2)) {
                byte[] bytesFirst = new byte[fis1.available()];
                fis1.read(bytesFirst);

                byte[] bytesSecond = new byte[fis2.available()];
                fis2.read(bytesSecond);

                try (FileOutputStream fos1 = new FileOutputStream(str1)) {
                    fos1.write(bytesSecond);
                    fos1.write(bytesFirst);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}