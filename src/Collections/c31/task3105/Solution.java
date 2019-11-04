package Collections.c31.task3105;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив

В метод main приходит список аргументов.
Первый аргумент - полный путь к файлу fileName.
Второй аргумент - путь к zip-архиву.
Добавить файл (fileName) внутрь архива в директорию 'new'.
Если в архиве есть файл с таким именем, то заменить его.

Пример входных данных:
C:/result.mp3
C:/pathToTest/test.zip

Файлы внутри test.zip:
a.txt
b.txt

После запуска Solution.main архив test.zip должен иметь такое содержимое:
new/result.mp3
a.txt
b.txt

Подсказка: нужно сначала куда-то сохранить содержимое всех энтри, а потом записать в архив все энтри вместе с добавленным файлом.
Пользоваться файловой системой нельзя.

Требования:
•	В методе main создай ZipInputStream для архивного файла (второй аргумент main). Нужно вычитать из него все содержимое.
•	В методе main создай ZipOutputStream для архивного файла (второй аргумент main).
•	В ZipOutputStream нужно записать содержимое файла, который приходит первым аргументом в main.
•	В ZipOutputStream нужно записать все остальное содержимое, которое было вычитано из ZipInputStream.
•	Потоки для работы с архивом должны быть закрыты.
*/
//C:\prog\SolutionTest\
public class Solution {
    public static void main(String[] args) throws IOException {
        args = new String[] {"allFilesContent.txt", "C:\\prog\\SolutionTest\\zip-zap.zip"};

//        ZipInputStream zis = new ZipInputStream(new FileInputStream(args[1]));
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(args[1]));








//        while (zis.available() > 0) {
//            System.out.println(zis.getNextEntry());
//        }



    }
}