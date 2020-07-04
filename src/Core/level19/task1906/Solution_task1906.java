package Core.level19.task1906;
//Четные символы
/*
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод

Требования:
•	Программа должна считывать имена файлов с консоли (используй BufferedReader).
•	BufferedReader для считывания данных с консоли должен быть закрыт.
•	Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
•	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна записывать во второй файл все байты из первого файла с четным порядковым номером (используй FileWriter).
•	Поток записи в файл (FileWriter) должен быть закрыт.
*/
//"C:\\prog\\1906.txt"
//"C:\\prog\\1906(1).txt"
import java.io.*;

public class Solution_task1906 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine());
             FileWriter fileWriter = new FileWriter(reader.readLine())) {

            int b;
            int i = 0;

            while ((b = fileReader.read()) != -1) {
                if (++i%2 == 0)
                fileWriter.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}