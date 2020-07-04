package Collections.level40.task4010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/*
Коды ошибок

В методе main присутствуют ошибки. Исправь их. Постарайся сделать минимум изменений.

Результатом работы программы должно быть отображение JSON документа по ссылке url.

Требования:
•	У соединения должен быть корректно установлен параметр User-Agent с помощью метода setRequestProperty.
•	В случае, если код ответа не равен 200, должно быть выброшено исключение RuntimeException.
•	В случае, если код ответа равен 200, на экран должна быть выведена информация полученная из InputStream соединения.
•	В методе main должен быть создан новый объект типа URL.
*/

public class Solution {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://jsonplaceholder.typicode.com/posts/1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() != 100) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Server output .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
