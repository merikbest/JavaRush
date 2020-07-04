package Core.level19.task1910;

/*
Пунктуация

Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.

Результат вывести во второй файл.

Закрыть потоки.

Требования:
•	Программа должна считывать имена файлов с консоли (используй BufferedReader).
•	BufferedReader для считывания данных с консоли должен быть закрыт.
•	Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
•	Поток чтения из файла (BufferedReader) должен быть закрыт.
•	Программа должна записывать во второй файл содержимое первого файла, где удалены все знаки пунктуации, включая символы новой строки (Для записи в файл используй BufferedWriter с конструктором FileWriter).
•	Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

import java.io.*;

//C:\\prog\\1908.txt
//C:\\prog\\1908(1).txt

public class Solution_task1910 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {

            String line;

            while ((line = fReader.readLine()) != null) {
                fWriter.write(line.replaceAll("[\\p{P}|\\n]", ""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
