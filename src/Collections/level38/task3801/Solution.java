package Collections.level38.task3801;

/*
Исправь ошибки в коде

Исключения NameIsEmptyException и NameIsNullException должны быть checked.
Все типы исключений должны быть обработаны.
Реализацию методов main() и getNumberOfCharacters() не менять.
Изменен должен быть только порядок catch блоков в методе main().

Требования:
•	При возникновении NameIsNullException на экран должна быть выведена строка: "Ошибка: Имя не задано".
•	При возникновении NameIsEmptyException на экран должна быть выведена строка: "Ошибка: Имя пустое".
•	При возникновении любого другого исключения на экран должна быть выведена строка возвращаемая методом toString этого исключения.
•	Если исключений не было, на экран должна быть выведена строка формата: "Имя содержит X символов", где X - количество символов в нулевом параметре переданном в метод main.
•	Класс NameIsEmptyException должен быть потомком класса Exception.
•	Класс NameIsNullException должен быть потомком класса Exception.
*/

public class Solution {
//    public static void main(String[] args) {
//        if (args.length > 0) {
//            try {
//                System.out.println("Имя содержит " + NameChecker.getNumberOfCharacters(args[0]) + " символов");
//            } catch (Exception e) {
//                System.out.println(e.toString());
//            } catch (NameIsNullException e) {
//                System.out.println("Ошибка: Имя не задано");
//            } catch (NameIsEmptyException e) {
//                System.out.println("Ошибка: Имя пустое");
//            }
//        }
//    }
}

