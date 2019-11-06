package Collections.c32.task3202;

import java.io.*;

/*
Читаем из потока

Реализуй логику метода getAllDataFromInputStream. Он должен вернуть StringWriter, содержащий все данные из переданного потока.
Возвращаемый объект ни при каких условиях не должен быть null.
Метод main не участвует в тестировании.

Требования:
•	Публичный статический метод getAllDataFromInputStream (InputStream) должен существовать.
•	Метод getAllDataFromInputStream (InputStream) должен возвращать StringWriter.
•	Метод getAllDataFromInputStream (InputStream) должен вернуть StringWriter, который содержит все данные из переданного потока.
•	Возвращаемый объект ни при каких условиях не должен быть null.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter writer = new StringWriter();

        try {
            while (is.available() > 0) {
                byte[] buf = new byte[1024];
                int len = is.read(buf);
                String s = new String(buf, 0, len);
                writer.append(s);
            }
        } catch (Exception e) {
            return new StringWriter();
        }

        return writer;
    }
}
