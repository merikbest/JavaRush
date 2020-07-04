package Collections.level36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

/*
Использование TreeSet

Первым параметром приходит имя файла: файл1.
файл1 содержит только буквы латинского алфавита, пробелы, знаки препинания, тире, символы перевода каретки.
Отсортируй буквы по алфавиту и выведи на экран первые 5 различных букв в одну строку без разделителей.
Если файл1 содержит менее 5 различных букв, то выведи их все.
Буквы различного регистра считаются одинаковыми.
Регистр выводимых букв не влияет на результат.
Закрой потоки.

Пример 1 данных входного файла:
zBk yaz b-kN

Пример 1 вывода:
abkny

Пример 2 данных входного файла:
caAC
A, aB? bB

Пример 2 вывода:
abc

Подсказка: использовать TreeSet

Требования:
•	Программа должна использовать класс TreeSet.
•	У объекта типа TreeSet вызови метод add для добавления элементов.
•	Программа должна выводить результат на экран.
•	Вывод программы должен соответствовать условию задачи.
*/

public class Solution {
    public static void main(String[] args) {
        //"C:\\prog\\task3605.txt"
        TreeSet<Character> treeSet = new TreeSet<Character>();
        StringBuilder sb = new StringBuilder();
        String line;
        char [] chars;

        try(BufferedReader reader = new BufferedReader( new FileReader (args[0]))) {
            while ((line = reader.readLine()) != null) {
                chars = line.toLowerCase().replaceAll("\\W","").toCharArray();
                for (char c : chars) {
                    treeSet.add(c);
                }
            }
            for (char ch: treeSet) {
                sb.append(ch);
            }
            if (sb.length() > 5)
                System.out.println(sb.substring(0,5));
            else
                System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}























