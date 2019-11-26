package Multithreading.task24.task2407;

import java.util.List;

/*
Реализация интерфейса используя локальный класс

В классе Cat реализуй логику метода toSayable, которая описана в джавадоке.

Требования:
•	В классе Cat должен быть реализован публичный метод toSayable с одним параметром типа int.
•	Метод toSayable должен возвращать объект типа Sayable.
•	Если полученный параметр меньше 1, метод say() должен вернуть строку формата: "name спит.", где name - имя текущего кота.
•	Если полученный параметр больше либо равен 1, метод say() должен вернуть строку формата: "name говорит мяяяу!", где name - имя текущего кота, а количество букв "я" в слове "мяяяу" равно полученному параметру.
•	Программа должна выводить данные на экран.
*/

public class Solution {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}
