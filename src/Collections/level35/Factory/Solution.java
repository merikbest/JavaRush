package Collections.level35.Factory;

import Collections.level35.Factory.female.FemaleFactory;
import Collections.level35.Factory.male.MaleFactory;

public class Solution {
    public static void main(String[] args) {
        FemaleFactory femaleFactory = new FemaleFactory();
        MaleFactory maleFactory = new MaleFactory();
        Human one = femaleFactory.getPerson(99);
        Human two = femaleFactory.getPerson(4);
        Human three = femaleFactory.getPerson(15);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
