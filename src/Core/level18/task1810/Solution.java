package Core.level18.task1810;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       FileInputStream fis1 = new FileInputStream(reader.readLine());

       while (fis1.available() < 999) {
           fis1.close();
           fis1 = new FileInputStream(reader.readLine());
       }

        reader.close();
        fis1.close();

        throw new DownloadException();
    }

    public static class DownloadException extends Exception {

    }
}
