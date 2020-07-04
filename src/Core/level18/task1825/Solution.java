package Core.level18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//C:\prog\JAVATEST\test1.txt.part
//C:\prog\JAVATEST\test2.txt.part
//C:\prog\JAVATEST\test3.txt.part
//C:\prog\JAVATEST\test4.txt.part

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> fileList = new ArrayList<>();
            String fileName = "";

            while (!(fileName = reader.readLine()).equals("end")) {
                fileList.add(fileName);
            }

            Collections.sort(fileList);

            String outputFileName = fileList.get(0).split(".part")[0];

            try(FileOutputStream fos = new FileOutputStream(outputFileName)) {
                if (!new File(outputFileName).exists())
                    new File(outputFileName).createNewFile();

                for (String file : fileList) {
                    try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file))) {
                        byte[] buffer = new byte[fis.available()];
                        fis.read(buffer);
                        fos.write(buffer);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}