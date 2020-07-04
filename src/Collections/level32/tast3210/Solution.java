package Collections.level32.tast3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Используем RandomAccessFile

В метод main приходят три параметра:
1) fileName - путь к файлу;
2) number - число, позиция в файле;
3) text - текст.

Считать текст с файла начиная с позиции number, длинной такой же как и длинна переданного текста в третьем параметре.
Если считанный текст такой же как и text, то записать в конец файла строку 'true', иначе записать 'false'.
Используй RandomAccessFile и его методы seek(long pos), read(byte[] b, int off, int len), write(byte[] b).
Используй один из конструкторов класса String для конвертации считанной строчки в текст.

Требования:
•	В методе main класса Solution необходимо использовать RandomAccessFile, который должен использовать файл, который приходит первым параметром.
•	В методе main класса Solution программа должна устанавливать позицию в файле, которая передана во втором параметре.
•	В методе main класса Solution программа должна считывать данные с файла при помощи метода read(byte[] b, int off, int len).
•	Запись должна происходить в конец файла.
•	Если считанный текст такой же как и text, то программа должна записать в конец переданного файла строку 'true'.
•	Если считанный текст НЕ такой же как и text, то программа должна записать в конец переданного файла строку 'false'.
*/

public class Solution {
    public static void main(String... args) {
//        String fileName = args[0];
//        int number = Integer.parseInt(args[1]);
//        String text = args[2];

        String fileName = "C:\\Users\\Miroslav\\IdeaProjects\\JavaRush\\src\\Collections\\c32\\task3201\\testfile.txt";
        int number = 8;
        String text = "asd";

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            byte[] fileText = new byte[text.length()];

            raf.seek(number);
            raf.read(fileText,0,fileText.length);

            raf.seek(raf.length());

            if (text.equals(new String(fileText))) {
                raf.write("true".getBytes());
            } else
                raf.write("false".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
