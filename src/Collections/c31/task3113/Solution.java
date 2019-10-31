package Collections.c31.task3113;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/*
Что внутри папки?

Напиши программу, которая будет считать подробную информацию о папке и выводить ее на консоль.

Первым делом считай путь к папке с консоли.
Если введенный путь не является директорией - выведи "[полный путь] - не папка" и заверши работу.
Затем посчитай и выведи следующую информацию:

Всего папок - [количество папок в директории и поддиректориях]
Всего файлов - [количество файлов в директории и поддиректориях]
Общий размер - [общее количество байт, которое хранится в директории]

Используй только классы и методы из пакета java.nio.

Квадратные скобки [ ] выводить на экран не нужно.

Требования:
•	Метод main должен считывать путь к папке с консоли.
•	Если введенный путь не является директорией - нужно вывести "[полный путь] - не папка" и завершить работу.
•	Используй только классы и методы из пакета java.nio.
•	На консоль должна быть выведена следующая информация: "Всего папок - [количество папок в директории и поддиректориях]".
•	На консоль должна быть выведена следующая информация: "Всего файлов - [количество файлов в директории и поддиректориях]".
•	На консоль должна быть выведена следующая информация: "Общий размер - [общее количество байт, которое хранится в директории]".
*/
//C:\prog\SolutionTest
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Path path = Paths.get(reader.readLine());
        reader.close();

        if (!Files.isDirectory(path)) {
            System.out.println(path.toAbsolutePath().toString() + " - не папка");
        } else {
            MyFileVisitor myFileVisitor = new MyFileVisitor();
            Files.walkFileTree(path, myFileVisitor);

            System.out.println("Всего папок - " + myFileVisitor.getDerictories());
            System.out.println("Всего файлов - " + myFileVisitor.getFiles());
            System.out.println("Общий размер - " + myFileVisitor.getSize());
        }
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {
    private int derictories = -1;
    private int files = 0;
    private long size = 0;

    public int getDerictories() {
        return derictories;
    }

    public int getFiles() {
        return files;
    }

    public long getSize() {
        return size;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            files++;
            size = size + attrs.size();
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        derictories++;
        return FileVisitResult.CONTINUE;
    }
}
