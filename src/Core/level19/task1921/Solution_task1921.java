package Core.level19.task1921;

/*
Хуан Хуанович

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами.

Заполнить список PEOPLE используя данные из файла.
Закрыть потоки.

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013

Требования:
•+	Класс Solution должен содержать публичную константу PEOPLE типа List<Person>, которая должна быть сразу проинициализирована.
•+	Программа НЕ должна считывать данные с консоли.
•+	Программа должна считывать содержимое файла (используй FileReader).
•+	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна заполнить список PEOPLE данными из файла.
•	Программа должна правильно работать с двойными именами, например Анна-Надежда.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Solution_task1921 {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\prog\\1921.txt"))) {

            while (reader.ready()) {
                String [] nameList = reader.readLine().split(" ");
                personDate(nameList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void personDate(String[] list) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");

        String name = "";
        String date = "";

        for (int i = 0; i < list.length; i++) {
            if (list[i].matches("[^0-9]+")) {
                name = name + list[i] + " ";
            }

            if (list[i].matches("[0-9]+")) {
                date = date + list[i] + " ";
            }
        }
        PEOPLE.add(new Person(name.trim(),dateFormat.parse(date)));
    }
}