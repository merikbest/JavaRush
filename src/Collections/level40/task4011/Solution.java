package Collections.level40.task4011;

import java.io.IOException;
import java.net.MalformedURLException;

/*
Свойства URL

Метод decodeURLString должен принимать URL ссылку в виде строки и выводить ее свойства на экран:
- protocol
- authority
- file
- host
- path
- port
- default port
- query
- ref

Если переданная строка не является валидной URL ссылкой, на экран должно быть выведено сообщение формата: "Parameter s is not a valid URL.", где s - полученная в качестве параметра строка.

P.S. Парсить строку не нужно, создай объект типа URL и вызови необходимые тебе методы.

Требования:
•	В методе decodeURLString должен быть создан новый объект типа URL.
•	На экран должно быть выведено свойство protocol ссылки полученной в качестве параметра.
•	На экран должно быть выведено свойство authority ссылки полученной в качестве параметра.
•	На экран должно быть выведено свойство file ссылки полученной в качестве параметра.
•	На экран должно быть выведено свойство host ссылки полученной в качестве параметра.
•	На экран должно быть выведено свойство path ссылки полученной в качестве параметра.
•	На экран должно быть выведено свойство port ссылки полученной в качестве параметра.
•	На экран должно быть выведено свойство default port ссылки полученной в качестве параметра.
•	На экран должно быть выведено свойство query ссылки полученной в качестве параметра.
•	На экран должно быть выведено свойство ref ссылки полученной в качестве параметра.
•	Метод decodeURLString должен выводить сообщение об ошибке на экран для некорректных URL ссылок.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        decodeURLString("https://www.amrood.com/index.htm?language=en#j2se");
    }

    public static void decodeURLString(String s) throws MalformedURLException {

    }
}