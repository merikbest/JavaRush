package Core.level19.task1922;

/*
Ищем нужные строки

Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
Закрыть потоки.

Пример:
words содержит слова А, Б, В

Строки:
В Б А Д //3 слова из words, не подходит
А Б А Д //3 слова из words, не подходит
Д А Д //1 слово из words, не подходит
Д А Б Д //2 слова - подходит, выводим
Д А А Д //2 слова - подходит, выводим

Требования:
•+	Класс Solution должен содержать публичное статическое поле words типа List<String>, которое должно быть сразу проинициализировано.
•+	Класс Solution должен содержать статический блок, в котором добавляются три или больше слов в список words.
•+	Программа должна считывать имя файла с консоли (используй BufferedReader).
•+	BufferedReader для считывания данных с консоли должен быть закрыт.
•+	Программа должна считывать содержимое файла (используй FileReader).
•+	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна выводить в консоль все строки из файла, которые содержат всего 2 слова из списка words.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//C:\prog\1922.txt

public class Solution_task1922 {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader freader = new BufferedReader(new FileReader(reader.readLine()))) {

            while (freader.ready()) {
                String line = freader.readLine();
                String[] str = line.split(" ");
                wordsCount(str);

                if (wordsCount(str) == 2)
                System.out.print(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int wordsCount (String[] line) {
        int count = 0;

        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < words.size(); j++) {
                if (line[i].equals(words.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }
}


//for (String lineWord : lineWords) {
//        for (String word : words) {
//        if (lineWord.trim().equals(word))
//        count += 1;
//        }