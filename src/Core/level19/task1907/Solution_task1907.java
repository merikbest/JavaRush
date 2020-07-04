package Core.level19.task1907;
/*
Считаем слово

Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.

Требования:
•	Программа должна считывать имя файла с консоли (используй BufferedReader).
•	BufferedReader для считывания данных с консоли должен быть закрыт.
•	Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
•	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
*/

import java.io.*;

//C:\\prog\\1907.txt

public class Solution_task1907 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fReader = new BufferedReader( new FileReader (reader.readLine()))) {

            int count = 0;
            String word = "world";

            while (fReader.ready()) {
                String line = fReader.readLine();

//                for (int i = 0; i < line.length()-4; i++) {
//                    if (line.substring(i,i+5).equals("world")) {
//                        count++;
//                    }
//                }

                String[] words = line.toString().split("\\W");
                for (String s : words)
                    if (s.equals(word))
                        count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
