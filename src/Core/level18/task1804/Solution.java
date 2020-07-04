package Core.level18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            //C:\prog\ooop.txt
            int[] count = new int[256];
            int minByte = Integer.MAX_VALUE;

            while (inputStream.available() > 0) {
                int tmp = inputStream.read();
                if (minByte > ++count[tmp]) {
                    minByte = count[tmp];
                }
            }

            for (int i = count.length -1; i >= 0; i--) {
                if (count[i] == minByte)
                    System.out.print(i + " ");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}