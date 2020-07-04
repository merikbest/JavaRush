package Core.level18.task1818;

import java.io.*;

//        "C:\prog\first_file.txt"
//        "C:\\prog\\zap.txt"
//        "C:\\prog\\op.txt"

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fos1 = new FileOutputStream(reader.readLine());
             FileInputStream fin2 = new FileInputStream(reader.readLine());
             FileInputStream fin3 = new FileInputStream(reader.readLine());){

            int i;

            while ((i = fin2.read()) != -1) {
                fos1.write(i);
            }

            while ((i = fin3.read()) != -1) {
                fos1.write(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ ИЛИ
//
//
//    byte[] bytesFirst = new byte[fis1.available()];
//    fis1.read(bytesFirst);
//    fos.write(bytesFirst);
//
//    byte[] bytesSecond = new byte[fis2.available()];
//    fis2.read(bytesSecond);
//    fos.write(bytesSecond);