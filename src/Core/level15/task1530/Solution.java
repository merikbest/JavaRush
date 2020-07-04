package Core.level15.task1530;

public class Solution {
    public static void main(String[] args) {
//        DrinkMaker l = new LatteMaker();
//        DrinkMaker t = new TeaMaker();
//        l.makeDrink();
//        t.makeDrink();
    }
}

abstract class DrinkMaker {
    public abstract void getRightCup();
    public abstract void putIngredient();
    public abstract void pour();

    void makeDrink() {
        //который готовит напиток в такой последовательности: выбирает чашку, кладет ингредиенты, заливает жидкостью.
        getRightCup();
        putIngredient();
        pour();
    }
}

class LatteMaker extends DrinkMaker {
    @Override
    public void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    public void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    public void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }
}

class TeaMaker extends DrinkMaker {

    @Override
    public void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    public void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    public void pour() {
        System.out.println("Заливаем кипятком");
    }
}

