package Core.level12.task1215;

/*
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());


    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName() {
            return "Murzik";
        }

        public Pet getChild() {
            Cat cat2 = new Cat();
            return cat2;
        }
    }

    public static class Dog extends Pet {
        public String getName() {
            return "Bobik";
        }

        public Pet getChild() {
            Dog dog2 = new Dog();
            return dog2;
        }
    }
}