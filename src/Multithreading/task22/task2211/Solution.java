package Multithreading.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/*
Смена кодировки

В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.

Требования:
•	Программа НЕ должна считывать данные с клавиатуры.
•	Программа НЕ должна выводить данные на экран.
•	Программа должна записывать данные в файл.
•	Содержимое второго файла должно соответствовать содержимому первого файла за исключением кодировки(UTF-8).
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Charset uft8 = Charset.forName("UTF-8");
        Charset windows1251 = Charset.forName("Windows-1251");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), windows1251));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), uft8));
        while (reader.ready()){
            String s = reader.readLine();
            writer.write(s);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}