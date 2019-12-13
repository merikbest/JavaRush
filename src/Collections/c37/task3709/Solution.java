package Collections.c37.task3709;

/*
Security Proxy

Необходимо создать класс SecurityProxyConnector в пакете connectors, который будет производить проверку безопасности перед подключением. В случае, если проверка не пройдена, соединение не должно быть установлено.

Для клиента (в данном случае класс Solution) использование SecurityProxyConnector ничем не должно отличаться от использования класса SimpleConnector.

P.S. Тебе понадобятся поля типов SecurityChecker и SimpleConnector в классе SecurityProxyConnector.

Требования:
•	В классе SecurityProxyConnector должно быть создано поле типа SimpleConnector.
•	В классе SecurityProxyConnector должно быть создано поле типа SecurityChecker.
•	Конструктор класса SecurityProxyConnector должен принимать один параметр типа String и инициализировать поле типа SimpleConnector.
•	Метод connect класса SecurityProxyConnector должен выполнять проверку безопасности с помощью вызова метода performSecurityCheck у объекта типа SecurityChecker.
•	Если проверка безопасности была пройдена, должно быть выполнено подключение.
•	Если проверка безопасности не была пройдена, подключение не должно быть выполнено.
•	Класс SecurityProxyConnector должен поддерживать интерфейс Connector.
*/

import Collections.c37.task3709.connectors.Connector;
import Collections.c37.task3709.connectors.SecurityProxyConnector;
import Collections.c37.task3709.connectors.SimpleConnector;

public class Solution {
    public static void main(String[] args) {
        Connector securityProxyConnector = new SecurityProxyConnector("google.com");
        Connector simpleConnector = new SimpleConnector("javarush.ru");

        System.out.println("Connecting with SimpleConnector...");
        simpleConnector.connect();

        System.out.println("----------------------------------------------------");

        System.out.println("Connecting with SecurityProxyConnector...");
        securityProxyConnector.connect();
    }
}
