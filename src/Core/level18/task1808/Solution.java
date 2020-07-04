package Core.level18.task1808;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis1 = new FileInputStream(reader.readLine());
             FileOutputStream fos2 = new FileOutputStream(reader.readLine());
             FileOutputStream fos3 = new FileOutputStream(reader.readLine());) {

                // Если в файл1 количество байт нечетное то файл2 должен содержать большую часть.
                byte[] buffer = new byte[fis1.available()];
                int count = fis1.read(buffer);
                fos2.write(buffer, 0, count / 2 + count % 2); // Первую половину байт записать в файл2
                fos3.write(buffer, count / 2 + count % 2, count / 2); // Вторую половину байт записать в файл3

        } catch (IOException e) {
            e.printStackTrace();
        }
//        C:\Users\Miroslav\Desktop\dog.jpg
//        C:\Users\Miroslav\Desktop\dog1.jpg

    }

}
