package Core.level13.task1319;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class task1319v2_ZAPIS_V_FAIL {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\prog\\ooop.txt");  //Текстовый файл

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            // поток чтения с консоли и соединяем InputStreamReader с BufferedReader
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            // поток записи в файл и соединяем FileWriter с BufferedWriter

            String line;
            while (!(line = reader.readLine()).equals("exit")) {
                writer.write(line + "\n");
            }
            writer.write(line + "\n");

            reader.close(); // закрываем поток
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}