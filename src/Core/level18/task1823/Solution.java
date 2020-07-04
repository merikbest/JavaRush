package Core.level18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//        "C:\prog\first_nums.txt"
//        "C:\prog\second_nums.txt"

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                String fileName = reader.readLine();
                if (fileName.equals("exit"))
                    break;
                ReadThread thread = new ReadThread(fileName);
                thread.start();
                thread.join();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

// implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {

            try (FileInputStream fis = new FileInputStream(fileName)) {
                Map<Integer, Integer> map = new TreeMap<>();
                int max = 0;
                int maxByte = 0;
                while (fis.available() > 0) {
                    int readByte = fis.read();
                    map.merge(readByte, 1, Integer::sum);
                    if (map.get(readByte) > max) {
                        max = map.get(readByte);
                        maxByte = readByte;
                    }
                }

                resultMap.put(fileName, maxByte);

            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}