package Collections.level40.task4001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/*
POST, а не GET

Исправь ошибки в методе sendPost, чтобы он отправлял POST-запрос с переданными параметрами.
Примечание: метод main в тестировании не участвует,
    но чтобы программа корректно работала локально, можешь зайти на сайт http://requestb.in/,
    создать свой RequestBin и использовать его в main.

Требования:
•	Метод sendPost должен вызвать метод setRequestMethod с параметром "POST".
•	Метод sendPost должен устанавливать флаг doOutput у соединения в true.
•	В OutputStream соединения должны быть записаны переданные в метод sendPost параметры.
•	Метод sendPost должен выводить результат своей работы на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.sendPost(new URL("http://requestb.in/1cse9qt1"), "name=zapp&mood=good&locale=&id=777");
    }

    public void sendPost(URL url, String urlParameters) throws Exception {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String responseLine;
        StringBuilder response = new StringBuilder();

        while ((responseLine = bufferedReader.readLine()) != null) {
            response.append(responseLine);
        }
        bufferedReader.close();

        System.out.println("Response: " + response.toString());
    }
}
