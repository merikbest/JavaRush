package Core.level13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/*
Писатель в файл с консоли C:\prog\op.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String adress = reader.readLine();

        try {
//            File file = new File("C:\\prog\\ooop.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // соединяем InputStreamReader с BufferedReader

            FileWriter fileReader = new FileWriter(adress); // поток который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // соединяем FileWriter с BufferedWriter

            String line;
            while (!(line = bufferedReader.readLine()).equals("exit")) {
                bufferedWriter.write(line + "\n");
            }
            bufferedWriter.write(line + "\n");

            bufferedReader.close(); // закрываем поток
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}