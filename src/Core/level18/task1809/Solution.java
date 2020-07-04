package Core.level18.task1809;

import java.io.*;

//        C:\Users\Miroslav\Desktop\dog.jpg
//        C:\Users\Miroslav\Desktop\dog1.jpg

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis1 = new FileInputStream(reader.readLine());
             FileOutputStream fos2 = new FileOutputStream(reader.readLine());) {

            byte[] buffer = new byte[fis1.available()];
            fis1.read(buffer);

            for (int i = buffer.length -1; i >= 0; i--) {
                fos2.write(buffer[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
