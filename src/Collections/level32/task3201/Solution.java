package Collections.level32.task3201;

/*
Запись в существующий файл

В метод main приходят три параметра:
1) fileName - путь к файлу;
2) number - число, позиция в файле;
3) text - текст.
Записать text в файл fileName начиная с позиции number.
Запись должна производиться поверх старых данных, содержащихся в файле.
Если файл слишком короткий, то записать в конец файла.
Используй RandomAccessFile и его методы seek и write.

Требования:
•	В методе main класса Solution необходимо использовать RandomAccessFile.
•	В методе main класса Solution программа должна записывать данные в файл при помощи метода write класса RandomAccessFile.
•	Запись в файл должна происходить с указанной позиции с заменой содержимого.
•	Если файл слишком короткий, то запись text должна происходить в конец файла.
*/

import java.io.IOException;
import java.io.RandomAccessFile;


public class Solution {
    public static void main(String... args) {
//        String fileName = args[0];
//        int number = Integer.parseInt(args[1]);
//        String text = args[2];

        String fileName = "C:\\Users\\Miroslav\\IdeaProjects\\JavaRush\\src\\Collections\\c32\\task3201\\testfile.txt";
        int number = 10;
        String text = "asd";

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {

            if (raf.length() < number) {
                raf.seek(raf.length());
            } else
                raf.seek(number);

            raf.write(text.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
