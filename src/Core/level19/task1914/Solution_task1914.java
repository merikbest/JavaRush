package Core.level19.task1914;
/*
Решаем пример

В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9

Требования:
•	Класс Solution должен содержать класс TestString.
•	Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
•	Класс TestString должен содержать публичный void метод printSomething().
•	Метод printSomething() класса TestString должен выводить на экран строку "3 + 6 = ".
•	Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
•	Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
•	Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
•	Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
*/
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution_task1914 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream output = new PrintStream(baos);
        PrintStream sysOut = System.out;
        System.setOut(output);
        testString.printSomething();
        System.setOut(sysOut);

        String equation = baos.toString().replaceAll("[\\n|\\r]", "");
        String[] chunks = equation.split(" ");
        int result = 0;
        switch (chunks[1]) {
            case "+":
                result = Integer.parseInt(chunks[0]) + Integer.parseInt(chunks[2]);
                break;
            case "-":
                result = Integer.parseInt(chunks[0]) - Integer.parseInt(chunks[2]);
                break;
            case "*":
                result = Integer.parseInt(chunks[0]) * Integer.parseInt(chunks[2]);
                break;
        }
        System.out.println(equation + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}