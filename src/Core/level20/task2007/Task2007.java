package Core.level20.task2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
Как сериализовать JavaRush?

Сделай так, чтобы сериализация класса JavaRush была возможной.

Требования:
•	Класс JavaRush должен существовать внутри класса Solution.
•	Класс JavaRush должен быть статическим.
•	Класс JavaRush должен быть публичным.
•	Должна быть возможна сериализация класса JavaRush.
*/
public class Task2007 {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) {

    }
}
