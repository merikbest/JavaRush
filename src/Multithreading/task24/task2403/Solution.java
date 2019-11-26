package Multithreading.task24.task2403;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.server.RemoteObject;
import java.util.ArrayDeque;
import java.util.EventListener;

/*
Так-с... сопоставим

Исправь ошибки: перемести методы clone в те классы, в которых они должны быть реализованы.
Лишние методы удали.
Не удаляй метод main.

Требования:
•	В классе C должен быть реализован метод clone без параметров.
•	В классе Solution должен существовать метод main.
•	В классе Solution должны существовать 4 вложенных класса.
•	В классе Solution должен существовать 1 метод.
•	Метод clone в классе C должен возвращать объект типа C.
*/

public class Solution {
    public static class A implements Serializable {
    }

    public static class B implements Remote {
    }

    public static class C extends ArrayDeque implements Cloneable {
        public C clone() {
            return (C) super.clone();
        }
    }

    public static class D implements EventListener {
    }
    public static void main(String[] args) {

    }
}
