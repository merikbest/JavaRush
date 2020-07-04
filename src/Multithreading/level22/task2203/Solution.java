package Multithreading.level22.task2203;

/*
Между табуляциями

Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.

Требования:
•	Класс TooShortStringException должен быть потомком класса Exception.
•	Метод getPartOfString должен принимать строку в качестве параметра.
•	В случае, если строка, переданная в метод getPartOfString содержит менее 2 табуляций должно возникнуть исключение TooShortStringException.
•	Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty())
            throw new TooShortStringException();
        String formatedString [] = string.split("\t");
        if (formatedString.length < 3)
            throw new TooShortStringException();
        return formatedString[1];
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
