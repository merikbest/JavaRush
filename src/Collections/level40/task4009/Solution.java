package Collections.level40.task4009;

/*
Buon Compleanno!

Реализуй метод getWeekdayOfBirthday.
Метод должен возвращать день недели на итальянском языке, в который будет (или был) день рождения в определенном году.
Пример формата дат смотри в методе main.

Пример:
1) Для "30.05.1984" и "2015" метод должен вернуть: sabato
2) Для "1.12.2015" и "2016" метод должен вернуть: gioved?

Выполни задание, используя Java 8 DateTime API.

Требования:
•	Используй статический метод parse класса LocalDate.
•	Используй статический метод parse класса Year.
•	Используй локаль Locale.ITALIAN.
•	Метод getWeekdayOfBirthday должен возвращать правильный день недели для передаваемых параметров.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeekdayOfBirthday("30.05.1984", "2015"));
    }

    public static String getWeekdayOfBirthday(String birthday, String year) {
        //напишите тут ваш код
        return null;
    }
}
