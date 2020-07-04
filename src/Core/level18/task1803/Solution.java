package Core.level18.task1803;

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
            int maxByte = Integer.MIN_VALUE;

            while (inputStream.available() > 0) {
                int tmp = inputStream.read();
                if (maxByte < ++count[tmp]) {
                    maxByte = count[tmp];
                }
            }

            for (int i = count.length -1; i >= 0; i--) {
                if (count[i] == maxByte)
                    System.out.print(i + " ");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}