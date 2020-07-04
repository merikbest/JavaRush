package Core.level19.task1916;
/*
Отслеживаем изменения
Считать с консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines.
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME.
Пустые строки даны в примере для наглядности.
В оригинальном и редактируемом файлах пустых строк нет!

Пример 1:
оригинальный    редактированный    общий
file1:          file2:             результат:(lines)

строка1         строка1            SAME строка1
строка2                            REMOVED строка2
строка3         строка3            SAME строка3
строка4                            REMOVED строка4
строка5         строка5            SAME строка5
                строка0            ADDED строка0
строка1         строка1            SAME строка1
строка2                            REMOVED строка2
строка3         строка3            SAME строка3
                строка4            ADDED строка4
строка5         строка5            SAME строка5
строка0                            REMOVED строка0

Пример 2:
оригинальный    редактированный    общий
file1:          file2:             результат:(lines)

строка1         строка1            SAME строка1
                строка0            ADDED строка0

Пустые строки в примере означают, что этой строки нет в определенном файле.

Требования:
•	Класс Solution должен содержать класс LineItem.
•	Класс Solution должен содержать enum Type.
•	Класс Solution должен содержать публичное статическое поле lines типа List<LineItem>, которое сразу проинициализировано.
•	В методе main(String[] args) программа должна считывать имена файлов с консоли (используй BufferedReader).
•	В методе main(String[] args) BufferedReader для считывания данных с консоли должен быть закрыт.
•	Программа должна считывать содержимое первого и второго файла (используй FileReader).
•	Потоки чтения из файлов (FileReader) должны быть закрыты.
•	Список lines должен содержать объединенную версию строк из файлов, где для каждой строки указана одна из операций ADDED, REMOVED, SAME.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SolutiopTask1916 {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader1 = new FileReader(reader.readLine());
             FileReader fileReader2 = new FileReader(reader.readLine())) {

            List<String> original = new BufferedReader(fileReader1).lines().collect(Collectors.toList());
            List<String> modified = new BufferedReader(fileReader2).lines().collect(Collectors.toList());

            while (original.size() != 0 & modified.size() != 0) {
                if (original.get(0).equals(modified.get(0))) {
                    lines.add(new LineItem(Type.SAME, original.remove(0)));
                    modified.remove(0);
                } else if (modified.size() != 1 && original.get(0).equals(modified.get(1))) {
                    lines.add(new LineItem(Type.ADDED, modified.remove(0)));
                } else if (original.size() != 1 && original.get(1).equals(modified.get(0))) {
                    lines.add(new LineItem(Type.REMOVED, original.remove(0)));
                }
            }

            if (original.size() != 0) {
                lines.add(new LineItem(Type.REMOVED, original.remove(0)));
            } else if (modified.size() != 0) {
                lines.add(new LineItem(Type.ADDED, modified.remove(0)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
