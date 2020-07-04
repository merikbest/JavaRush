package Core.level19.task1919;

/*
Считаем зарплаты

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0

Требования:
•	Программа НЕ должна считывать данные с консоли.
•	Программа должна считывать содержимое файла (используй FileReader).
•	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна выводить в консоль каждое имя и сумму всех его значений, все данные должны быть отсортированы в возрастающем порядке по имени.
*/

//C:\prog\1919.txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution_task1919 {
//    static TreeMap<String,Double> treeMap = new TreeMap<>();

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\prog\\1919.txt"))) {
            TreeMap<String,Double> treeMap = new TreeMap<>();

            while (reader.ready()) {
                String[] str = reader.readLine().split(" ");
//                addMap(str[0], Double.parseDouble(str[1]));

                if (!treeMap.containsKey(str[0]))
                    treeMap.put(str[0], Double.parseDouble(str[1]));
                else
                   treeMap.put(str[0], treeMap.get(str[0]) + Double.parseDouble(str[1]));
            }

                for (Map.Entry<String,Double> map  : treeMap.entrySet()) {
                    System.out.println(map.getKey() + " " + map.getValue());
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void addMap(String name, Double value) {
//        if (!treeMap.containsKey(name))
//            treeMap.put(name,value);
//        else
//            treeMap.put(name, treeMap.get(name) + value);
//    }
}