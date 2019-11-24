package Multithreading.task22.task2210;

/*
StringTokenizer

Используя StringTokenizer разделить query на части по разделителю delimiter.

Пример
getTokens("level22.lesson13.task01", ".")

возвращает массив строк
{"level22", "lesson13", "task01"}

Требования:
•	Метод getTokens должен использовать StringTokenizer.
•	Метод getTokens должен быть публичным.
•	Метод getTokens должен принимать два параметра типа String.
•	Массив типа String возвращенный методом getTokens должен быть заполнен правильно(согласно условию задачи).
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(getTokens("level22.lesson13.task01", ".")));

    }
    public static String [] getTokens(String query, String delimiter) {
        List<String> list = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        while (tokenizer.hasMoreTokens()) {
            list.add(tokenizer.nextToken());
        }
        return list.toArray(new String[0]);
    }
}
