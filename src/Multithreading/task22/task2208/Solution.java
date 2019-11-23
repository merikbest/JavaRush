package Multithreading.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/*
Формируем WHERE

Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'

Требования:
•	Метод getQuery должен принимать один параметр типа Map.
•	Метод getQuery должен иметь тип возвращаемого значения String.
•	Метод getQuery должен быть статическим.
•	Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() != null) {
                if (sb.toString().equals(""))
                    sb.append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
                else
                    sb.append(" and ").append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
            }
        }
        return sb.toString();
    }
}
