package Collections.level35.Factory.male;

import Collections.level35.Factory.AbstractFactory;
import Collections.level35.Factory.Human;

public class MaleFactory implements AbstractFactory {
    public Human getPerson(int age) {
        if (age < 13)
            return new KidBoy();
        else if (12 < age && age < 20)
            return new TeenBoy();
        else
            return new Man();
    }
}
