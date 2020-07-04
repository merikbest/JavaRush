package Core.level19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//И еще один адаптер

/*
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner. Поле инициализировать в конструкторе с одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные только одного человека.

Требования:
•	PersonScanner должен быть интерфейсом.
•	Класс PersonScannerAdapter должен реализовывать интерфейс PersonScanner.
•	Класс PersonScannerAdapter должен содержать приватное поле fileScanner типа Scanner.
•	Класс PersonScannerAdapter должен содержать конструктор с параметром Scanner.
•	Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
•	Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.
*/

public class Solution_task1904 {
    public static void main(String[] args) throws Exception {
        PersonScannerAdapter p = new PersonScannerAdapter(new Scanner("C:\\prog\\1904.txt"));
        System.out.println(p.toString());
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
            Date date = new Date();

            String lName = fileScanner.next();
            String fName = fileScanner.next();
            String mName = fileScanner.next();

            try {
                date = dateFormat.parse(fileScanner.next() + fileScanner.next() + fileScanner.next());
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return new Person(lName,fName,mName,date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
