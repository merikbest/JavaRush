package Core.level13.task1318;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = null;
        BufferedInputStream buffer = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String adress = reader.readLine();

        try {
            inputStream = new FileInputStream(adress);
            buffer = new BufferedInputStream(inputStream);

            while(buffer.available()>0) {

                char c = (char)buffer.read();

                System.out.print(c);
            }
        } catch(Exception e) {

            e.printStackTrace();

        } finally {
            inputStream.close();
            buffer.close();
            reader.close();
        }
    }
}
