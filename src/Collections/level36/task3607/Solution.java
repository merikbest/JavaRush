package Collections.level36.task3607;

/*
Найти класс по описанию

Описание класса:
1. Реализует интерфейс Queue.
2. Используется при работе с трэдами.
3. Из этой очереди элементы могут быть взяты только тогда, когда они заэкспарятся, их время задержки истекло.
4. Головой очереди является элемент, который заэкспарился раньше всех.

Требования:
•	Метод getExpectedClass не должен использовать метод getDeclaredClasses.
•	Метод getExpectedClass должен вернуть правильный тип.
•	Метод main должен вызывать метод getExpectedClass.
•	Метод main должен вывести полученный класс на экран.
*/

import java.util.concurrent.DelayQueue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        return DelayQueue.class;
    }
}
