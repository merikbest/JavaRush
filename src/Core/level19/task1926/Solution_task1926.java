package Core.level19.task1926;
/*
Перевертыши

1. Считать с консоли имя файла. Считать содержимое файла.
2. Для каждой строки в файле:
2.1. переставить все символы в обратном порядке.
2.2. вывести на экран.
3. Закрыть потоки.

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА

Требования:
•	Программа должна считывать имя файла с консоли (используй BufferedReader).
•	BufferedReader для считывания данных с консоли должен быть закрыт.
•	Программа должна считывать содержимое файла (используй FileReader).
•	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна выводить в консоль все символы из файла в обратном порядке.
*/

//C:\prog\1926.txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_task1926 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader freader = new BufferedReader(new FileReader(reader.readLine()))) {

            while (freader.ready()){
                StringBuffer buffer = new StringBuffer(freader.readLine());
                System.out.println(buffer.reverse());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}