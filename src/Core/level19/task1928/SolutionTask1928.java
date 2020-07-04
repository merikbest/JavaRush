package Core.level19.task1928;
/*
Исправить ошибку. Классы и интерфейсы

Программа содержит всего 1 логическую ошибку.
Найди и исправь ее.

Требования:
•	Класс Solution должен содержать интерфейс Example.
•	Класс Solution должен содержать класс A который реализует интерфейс Example.
•	Класс Solution должен содержать класс B который реализует интерфейс Example.
•	Класс Solution должен содержать класс C который наследуется от класса A.
•	Исправь всего одну логическую ошибку.
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SolutionTask1928 {
    {
        System.out.println("This is the Solution class");
    }

    public static void main(String... args) {
        try (FileOutputStream outputStream = new FileOutputStream(args[0]);
             InputStream is = SolutionTask1928.class.getClassLoader().getResourceAsStream(args[1])) {

            byte[] b = new byte[is.available()];
            outputStream.write(is.read(b));

            int value = 123_456_789;
            System.out.println(value);

            Example result = null;
            String s = "a";
            switch (s) {
                case "a": {
                    result = new SolutionTask1928().new A();
                    break;
                }
                case "b": {
                    result = new SolutionTask1928().new B();
                    break;
                }
                case "c": {
                    result = new SolutionTask1928().new C();
                    break;
                }
            }

            if (result instanceof C) {
                C p = (C) result;
                System.out.println(p.getClass().getSimpleName());
            }

        } catch (IOException e) {
        }
    }

    interface Example {
    }

    class A implements Example {
        {
            System.out.println("This is the A class");
        }
    }

    class B implements Example {
        {
            System.out.println("This is the B class");
        }
    }

    class C extends A {
        {
            System.out.println("This is the C class");
        }
    }
}
