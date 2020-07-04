package Core.level20.task2021;

import java.io.*;

/*
Сериализация под запретом

Запрети сериализацию класса SubSolution используя NotSerializableException.
Сигнатуры классов менять нельзя.

Требования:
•	Класс Solution должен поддерживать интерфейс Serializable.
•	Класс SubSolution должен быть создан внутри класса Solution.
•	Класс SubSolution должен быть потомком класса Solution.
•	При попытке сериализовать объект типа SubSolution должно возникать исключение NotSerializableException.
•	При попытке десериализовать объект типа SubSolution должно возникать исключение NotSerializableException.
*/

public class Task2021 implements Serializable {

    public static class SubSolution extends Task2021 {

        private void writeObject (ObjectOutputStream objectOut) throws IOException {
            throw new NotSerializableException();
        }

        private void readObject (ObjectInputStream objectInput) throws IOException, ClassNotFoundException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}
