package Collections.level31.task3101;

/*
Проход по дереву файлов

1. На вход метода main() подаются два параметра.
Первый - path - путь к директории, второй - resultFileAbsolutePath - имя (полный путь) существующего файла, который будет содержать результат.
2. Переименовать resultFileAbsolutePath в allFilesContent.txt (используй метод FileUtils.renameFile(), и, если понадобится, FileUtils.isExist()).
3. Для каждого файла в директории path и в ее всех вложенных поддиректориях выполнить следующее:
Если у файла длина в байтах НЕ больше 50, то для всех таких файлов:
3.1. Отсортировать их по имени файла в возрастающем порядке, путь не учитывать при сортировке.
3.2. В allFilesContent.txt последовательно записать содержимое всех файлов из п. 3.1. После каждого тела файла записать "\n".
Все файлы имеют расширение txt.
В качестве разделителя пути используй "/".
Для создания файлов используй конструктор File(String pathname).

Требования:
•	Файл, который приходит вторым параметром в main, должен быть переименован в allFilesContent.txt.
•	Нужно создать поток для записи в переименованный файл.
•	Содержимое всех файлов, размер которых не превышает 50 байт, должно быть записано в файл allFilesContent.txt в отсортированном по имени файла порядке.
•	Поток для записи в файл нужно закрыть.
•	Не используй статические переменные.
*/

import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        args = new String[]{"C:\\prog\\SolutionTest", "C:\\prog\\SolutionTest\\resultFileAbsolutePath.txt"};

        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath,allFilesContent);

        File[] files = new File(args[0]).listFiles();

        for (File f : files) {
            if (f.length() >= 50)
                FileUtils.deleteFile(f);
        }

        Arrays.sort(files);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(allFilesContent))) {
            for(File file : files) {
                try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    while (reader.ready()) {
                        writer.write(reader.readLine() + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}