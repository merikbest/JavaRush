package Core.level20.task2009;

/*
Как сериализовать static?

Сделай так, чтобы сериализация класса ClassWithStatic была возможной.

Требования:
•	Класс ClassWithStatic должен существовать внутри класса Solution.
•	Класс ClassWithStatic должен быть статическим.
•	Класс ClassWithStatic должен быть публичным.
•	Класс ClassWithStatic должен поддерживать интерфейс Serializable.
*/

import java.io.Serializable;

public class Task2009 {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}
