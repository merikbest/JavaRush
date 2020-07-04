package Core.level15.task1502;

public class Solution {
    //добавьте классы Goose и Dragon тут
    public static class Goose extends SmallAnimal {

        @Override
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal  {

        @Override
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }

    public static void main(String[] args) {
        SmallAnimal gus = new Goose();
        BigAnimal drag = new Dragon();
        System.out.println(gus.getSize());
        System.out.println(drag.getSize());
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
