package Collections.c31.task3107;

/*
Null Object Pattern

Почитай на вики про паттерн "Null Object".
Используй Files, чтобы в конструкторе класса Solution правильно инициализировать поле fileData объектом ConcreteFileData.
Если возникли какие-то проблемы со чтением файла по пути pathToFile, то инициализируй поле объектом NullFileData.

Требования:
•	Конструктор Solution должен инициализировать поле fileData объектом ConcreteFileData.
•	Если в конструкторе Solution возникла ошибка, нужно инициализировать поле fileData объектом NullFileData.
•	Конструктор Solution должен корректно устанавливать значение поля hidden у объекта ConcreteFileData.
•	Конструктор Solution должен корректно устанавливать значение поля executable у объекта ConcreteFileData.
•	Конструктор Solution должен корректно устанавливать значение поля directory у объекта ConcreteFileData.
•	Конструктор Solution должен корректно устанавливать значение поля writable у объекта ConcreteFileData.
*/

import java.nio.file.Files;
import java.nio.file.Paths;

public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        try {
            fileData = new ConcreteFileData(Files.isHidden(Paths.get(pathToFile)), Files.isExecutable(Paths.get(pathToFile)),
                                            Files.isDirectory(Paths.get(pathToFile)),Files.isWritable(Paths.get(pathToFile)));
        } catch (Exception e) {
            fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}
