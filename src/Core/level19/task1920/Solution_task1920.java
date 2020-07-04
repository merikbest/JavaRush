package Core.level19.task1920;
/*
Самый богатый

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров

Требования:
•	Программа НЕ должна считывать данные с консоли.
•	Программа должна считывать содержимое файла (используй FileReader).
•	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна выводить в консоль имена, у которых максимальная сумма.
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution_task1920 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\prog\\1920.txt"))) {
            TreeMap<String,Double> treeMap = new TreeMap<>();

            double max = Double.MIN_VALUE;

            while (reader.ready()) {
                String[] str = reader.readLine().split("[\\s\\t\\n\\x0B\\f\\r]");

                String key = str[0];
                double value = Double.parseDouble(str[1]);

                if (treeMap.containsKey(key)) {
                    treeMap.put(key,treeMap.get(str[0])+ value);
                } else
                    treeMap.put(key,value);
            }

            for (Double d : treeMap.values()) {
                if (max < d) max = d;
            }

            for (Map.Entry<String, Double> pair : treeMap.entrySet()) {
                if (pair.getValue().equals(max))
                    System.out.println(pair.getKey());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}