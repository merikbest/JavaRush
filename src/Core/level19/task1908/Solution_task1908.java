package Core.level19.task1908;

/*
Выделяем числа

Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8ю 1

Результат:
12 14 1

Требования:
•	Программа должна считывать имена файлов с консоли (используй BufferedReader).
•	BufferedReader для считывания данных с консоли должен быть закрыт.
•	Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором принимающим FileReader).
•	Поток чтения из файла (BufferedReader) должен быть закрыт.
•	Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
•	Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

import java.io.*;

//C:\\prog\\1908.txt
//C:\\prog\\1908(1).txt

public class Solution_task1908 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {

            while (fReader.ready()) {
                String [] mass = fReader.readLine().split(" ");
                for (String x : mass) {
                    try {
                        fWriter.write(Integer.parseInt(x) + " ");
                    } catch (Exception e) {
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}