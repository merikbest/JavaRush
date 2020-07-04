package Core.level14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> names = new ArrayList<String>();

        //тут цикл по чтению ключей, пункт 1
        Person person = null;
        String key = null;

        while (true) {
            key = reader.readLine();
            if (key.equals("user")) {
                person = new Person.User();
            } else if (key.equals("loser")) {
                person = new Person.Loser();
            } else if (key.equals("coder")) {
                person = new Person.Coder();
            } else if (key.equals("proger")) {
                person = new Person.Proger();
            } else {
                break;
            }
            doWork(person);
        }
//        while (!(ppp = reader.readLine()).equals("exit")){
//            names.add(ppp);
//        }

//        for (int i = 0; i < names.size(); i++) {
//            if (names.get(i).equals("user")){
//                Person.User person = new Person.User();
//                doWork(person);
//            }
//            if (names.get(i).equals("loser")){
//                Person.Loser person = new Person.Loser();
//                doWork(person);
//            }
//            if (names.get(i).equals("coder")){
//                Person.Coder person = new Person.Coder();
//                doWork(person);
//            }
//            if (names.get(i).equals("proger")){
//                Person.Proger person = new Person.Proger();
//                doWork(person);
//            }
//        }
    }
    public static void doWork(Person person) {
        if (person instanceof Person.User) {
           ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
//    static void doWork(Person.Proger person) {
//        person.enjoy();
//    }
//
//    static void doWork(Person.Coder person) {
//        person.writeCode();
//    }
//
//     static void doWork(Person.Loser person) {
//        person.doNothing();
//    }
//
//     static void doWork(Person.User person) {
//        person.live();
//    }
}

interface Person {
     class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }
}