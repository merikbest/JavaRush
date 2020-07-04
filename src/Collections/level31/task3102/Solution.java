package Collections.level31.task3102;

/*
Находим все файлы

Реализовать логику метода getFileTree, который должен в директории root найти список всех файлов включая вложенные.
Используй очередь, рекурсию не используй.
Верни список всех путей к найденным файлам, путь к директориям возвращать не надо.
Путь должен быть абсолютный.

Требования:
•	Метод getFileTree должен принимать аргументом String root, по которому нужно найти все вложенные файлы.
•	Метод getFileTree должен возвращать список строк.
•	Нужно реализовать метод getFileTree: найти все файлы по указанному пути и добавить их в список.
•	Метод getFileTree должен быть вызван только 1 раз (рекурсию не использовать).
*/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public static List<String> getFileTree(String root) throws IOException {
        Queue<File> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        if (new File(root).isDirectory())
            queue.add(new File(root));
        else list.add(root);
        while (!queue.isEmpty()) {
            File currentFile = queue.poll();
            for (File file : currentFile.listFiles())
                if (file.isDirectory())
                    queue.add(file);
                else list.add(file.getAbsolutePath());
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
//        Files.walkFileTree(Paths.get("C:\\prog\\SolutionTest"), new MyFileVisitor());
    }
}

//class MyFileVisitor extends SimpleFileVisitor<Path> {
//    @Override
//    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//        System.out.println(file.getFileName());
//        return FileVisitResult.CONTINUE;
//    }
//}


