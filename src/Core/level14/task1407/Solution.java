package Core.level14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        //напишите тут ваш код
        if (person instanceof Player) {
            ((Player) person).play();
        } else if (person instanceof Dancer) {
            ((Dancer) person).dance();
        }
    }

    interface Person {
//        void play();
//        void dance();
    }

    static  class Player implements Person {
         void play() {
            System.out.println("playing");
        }
    }

    static  class Dancer implements Person {
         void dance() {
            System.out.println("dancing");
        }
    }
}
