package Collections.c36.task3602;

import java.util.Collections;

/*
Найти класс по описанию

Описание класса:
1. Реализует интерфейс List;
2. Является приватным статическим классом внутри популярного утилитного класса;
3. Доступ по индексу запрещен - кидается исключение IndexOutOfBoundsException.
Используя рефлекшн (метод getDeclaredClasses), верни подходящий тип в методе getExpectedClass.

Требования:
•	Метод getExpectedClass должен использовать метод getDeclaredClasses подходящего утилитного класса.
•	Метод getExpectedClass должен вернуть правильный тип.
•	Метод main должен вызывать метод getExpectedClass.
•	Метод main должен вывести полученный класс на экран.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        return null;
    }
}
