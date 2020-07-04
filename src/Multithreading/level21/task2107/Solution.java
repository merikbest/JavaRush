package Multithreading.level21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Глубокое клонирование карты

Обеспечь возможность клонирования объекта класса Solution используя глубокое клонирование.
Данные в карте users также должны быть клонированы.
Не забудь о методах equals и hashCode для корректного добавления элементов типа User в HashMap.

Требования:
•	Класс Solution должен поддерживать интерфейс Cloneable.
•	Класс User должен поддерживать интерфейс Cloneable.
•	В классе User должен быть корректно реализован метод clone.
•	В классе Solution должен быть корректно реализован метод clone.
*/
public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    @Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution solution = new Solution();
        Map<String, User> usersCopy = new LinkedHashMap();
        for (Map.Entry<String, User> pair : this.users.entrySet()) {
            usersCopy.put(pair.getKey(), pair.getValue());
        }
        solution.users = usersCopy;
        return solution;
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            User user = new User(this.age,this.name);
            user.age = this.age;
            user.name = this.name;
            return user;
        }
    }
}
