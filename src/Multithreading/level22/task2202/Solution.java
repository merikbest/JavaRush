package Multithreading.level22.task2202;

/*
Найти подстроку

Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.

Пример:
"JavaRush - лучший сервис обучения Java."

Результат:
"- лучший сервис обучения"

Пример:
"Амиго и Диего лучшие друзья!"

Результат:
"и Диего лучшие друзья!"

На некорректные данные бросить исключение TooShortStringException (сделать исключением).

Требования:
•	Класс TooShortStringException должен быть потомком класса RuntimeException.
•	Метод getPartOfString должен принимать строку в качестве параметра.
•	В случае, если в метод getPartOfString были переданы некорректные данные, должно возникнуть исключение TooShortStringException.
•	Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова, которое следует после 4-го пробела.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString(null));
    }

    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty())
            throw new TooShortStringException();
        String formatedString [] = string.split(" ");
        if (formatedString.length < 5)
            throw new TooShortStringException();
        return formatedString[1] + " " + formatedString[2] + " " + formatedString[3] + " " + formatedString[4];
    }

    public static class TooShortStringException extends RuntimeException {
    }
}