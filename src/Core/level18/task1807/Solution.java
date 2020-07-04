package Core.level18.task1807;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine());) {

            while (fis.available() > 0) {
                if (fis.read() == ',')
                    count++;
            }

            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
