package Core.level19.task1925;

/*
Длинные слова

В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.

Пример выходных данных в файл2:
длинное,короткое,аббревиатура

Требования:
•	Программа НЕ должна считывать данные с консоли.
•	Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
•	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна записывать через запятую во второй файл все слова из первого файла длина которых строго больше 6(используй FileWriter).
•	Поток записи в файл (FileWriter) должен быть закрыт.
*/

import java.io.*;

public class Solution_task1925 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\prog\\1925.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\prog\\1925(1).txt"))) {
                StringBuffer outText = new StringBuffer("");

            while (reader.ready()){
                String del = " ";
                String[] str = reader.readLine().split(" ");

                for (String s : str) {
                    if (s.length() > 6) {
                        writer.write(s + ", ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
