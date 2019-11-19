package Multithreading.task21.task2109;

/*
Запретить клонирование

Разреши клонировать класс А
Запрети клонировать класс B
Разреши клонировать класс C
Не забудь о методах equals и hashCode!

Требования:
•	Класс A должен поддерживать интерфейс Cloneable.
•	Класс B должен быть потомком класса A.
•	При объявлении класса B не должно быть явно указано implements Cloneable.
•	Метод clone в классе B должен быть переопределен таким образом, чтобы при попытке клонирования объекта класса B возникало исключение CloneNotSupportedException.
•	Класс C должен быть потомком класса B.
•	Клонирование объектов класса C должно завершаться успешно.

*/

import java.util.Objects;

public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            if (this.getClass() == B.class)
                throw new CloneNotSupportedException();
            return super.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            B b = (B) o;
            return Objects.equals(name, b.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }
    }

    public static void main(String[] args) {

    }
}
