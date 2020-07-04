package Core.level18.task1801;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            //C:\prog\ooop.txt
            int maxByte = Integer.MIN_VALUE;

            while (inputStream.available() > 0) {
                int data = inputStream.read();
//                if (maxByte < data)
//                    maxByte = data;
                maxByte = Math.max(maxByte, data);
            }

            System.out.println(maxByte);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}