package Core.level15.task1503;

public class Solution {
    public static void main(String[] args) {
        new LuxuriousCar().printlnDesire();
        new CheapCar().printlnDesire();
        new Ferrari().printlnDesire();
        new Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
         public void printlnDesire() {
            //add your code here
            System.out.println(WANT_STRING + FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
         public void printlnDesire() {
            //add your code here
            System.out.println(WANT_STRING + LANOS_NAME);
        }
    }

    public static class LuxuriousCar extends Constants {
        protected void printlnDesire() {
            //add your code here
            System.out.println(WANT_STRING + LUXURIOUS_CAR);
        }
    }

    public static class CheapCar extends Constants {
        protected void printlnDesire() {
            //add your code here
            System.out.println(WANT_STRING + CHEAP_CAR);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}