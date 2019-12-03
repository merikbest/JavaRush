package Collections.с35.Factory.female;

import Collections.с35.Factory.AbstractFactory;
import Collections.с35.Factory.Human;

public class FemaleFactory implements AbstractFactory {
    public Human getPerson(int age) {
        if (age < 13)
            return new KidGirl();
        else if (12 < age && age < 20)
            return new TeenGirl();
        else
            return new Woman();
    }
}
