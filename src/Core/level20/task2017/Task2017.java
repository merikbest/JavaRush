package Core.level20.task2017;

import java.io.ObjectInputStream;
import java.io.Serializable;

/*
Десериализация

На вход подается поток, в который записан сериализованный объект класса A либо класса B.
Десериализуй объект в методе getOriginalObject так, чтобы в случае возникновения исключения было выведено сообщение на экран и возвращен null.
Реализуй интерфейс Serializable где необходимо.

Требования:
•+	Класс B должен быть потомком класса A.
•+	Класс A должен поддерживать интерфейс Serializable.
•+	Класс B не должен явно поддерживать интерфейс Serializable.
•+	Метод getOriginalObject должен возвращать объект типа A полученный из потока ObjectInputStream.
•+	Метод getOriginalObject должен возвращать null, если при попытке десериализации не был получен объект типа A.
•+	Метод getOriginalObject должен возвращать null, если при попытке десериализации возникло исключение.
*/

public class Task2017 {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            return (A) objectStream.readObject();
        }  catch (Exception e) {
            System.out.println("Exception!");
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
