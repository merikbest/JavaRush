package Collections.c32.task3212;
/*
Service Locator

Прочитать о паттерне Service locator.

Реализуй логику метода getService(String jndiName) в ServiceLocator.
В нем будет реализована работа с контекстом и кэшем.

1) Верни из кэша нужный сервис.
2) Если в кэше нет нужного сервиса то:
2.1) Создай контекст.
2.2) Возьми у контекста нужный сервис.
2.3) Добавь сервис в кеш и верни его.

Требования:
•	Класс ServiceLocator должен содержать метод Service getService(String jndiName).
•	Если нужный сервис находится в кэше, метод getService(String jndiName) должен возвращать сервис из кэша.
•	Если нужный сервис НЕ находится в кэше, метод getService(String jndiName) должен создавать контекст.
•	Если нужный сервис НЕ находится в кэше, метод getService(String jndiName) должен искать нужный сервис в контексте.
•	Если нужный сервис НЕ находится в кэше, метод getService(String jndiName) должен добавлять в кэш сервис, найденный в контексте и возвращать его.
*/
public class Solution {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();

    }
}