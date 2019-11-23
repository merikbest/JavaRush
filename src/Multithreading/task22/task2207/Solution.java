package Multithreading.task22.task2207;

import java.io.*;
import java.util.*;

/*
Обращенные слова

В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Использовать StringBuilder.
Кодировка файла - UTF-8.

Пример содержимого файла
рот тор торт о
о тот тот тот

Вывод:
рот тор
о о
тот тот

Требования:
•	Метод main должен считывать имя файла с клавиатуры.
•	В методе main должен быть использован StringBuilder.
•	В классе Solution должен содержаться вложенный класс Pair с методами equals, hashCode и toString. Удалять или изменять эти методы нельзя.
•	В классе Pair должен быть объявлен конструктор без параметров (или конструктор по умолчанию).
•	Список result должен быть заполнен корректными парами согласно условию задачи.
*/
//C:\prog\task2207.txt

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Scanner in = new Scanner(new FileInputStream(reader.readLine()), "UTF-8")) {
            while (in.hasNext())
                words.add(in.next());

            for (int i = 0; i < words.size(); i++) {
                //каждое слово сравниваем с оставшимися словами в массиве
                for (int j = 0; j < words.size();) {
                    //если слово является обращением исходндного
                    if (words.get(j).equals(new StringBuilder(words.get(i)).reverse().toString()) && j != i){
                        //добавляем в результирующий массив
                        Pair pair = new Pair();
                        pair.first = words.get(i);
                        pair.second = words.get(j);
                        result.add(pair);
                        //удаляем найденные слова
                        words.remove(j);
                        words.remove(i);
                        //обнуляем счетчик
                        j = 0;
                    }
                    else{
                        j++;
                    }
                }
            }

            for (Pair pair: result)
                System.out.println(pair.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}