package Core.level18.task1802;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            //C:\prog\ooop.txt
            int minByte = Integer.MAX_VALUE;

            while (inputStream.available() > 0) {
                int data = inputStream.read();
//                if (minByte > data)
//                    minByte = data;
                minByte = Math.min(minByte, data);
            }

            System.out.println(minByte);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
