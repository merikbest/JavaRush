package Core.level19.task1923;
/*
Слова с цифрами

В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со словами, разделенными пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
Закрыть потоки.

Требования:
•	Программа НЕ должна считывать данные с консоли.
•	Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
•	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна записывать во второй файл все слова из первого файла которые содержат цифры (используй FileWriter).
•	Поток записи в файл (FileWriter) должен быть закрыт.
*/

import java.io.*;

public class Solution_task1923 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\prog\\1923.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\prog\\1923(1).txt"))) {

            while (reader.ready()){
                String[] words = reader.readLine().split(" ");

                for (String word : words)
                    if (!word.matches("^\\D*$"))
                        writer.write(word + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//            for (String word : words)
//                    if (!word.matches("^\\D*$"))
//                    printWriter.write(word + " ");