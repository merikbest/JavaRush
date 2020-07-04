package Collections.level38.task3809;

/*
Annotation + Reflection

Разберись в коде и исправьте ошибку.
Ориентируйся на ожидаемый вывод.
Сделай минимально возможные изменения.

Требования:
•	Программа должна выводить данные на экран.
•	Вывод на экран должен соответствовать ожидаемому.
•	Аннотация(@interface) LongPositive должна быть отмечена двумя другими аннотациями.
•	Аннотация(@interface) LongPositive должна применяться только к полям.
•	Аннотация(@interface) LongPositive должна быть доступна во время выполнения программы.
*/

public class Solution {
    public static void main(String[] args) throws IllegalAccessException {
        JavaRushBankAccount account = new JavaRushBankAccount("Mr.Smith");
        System.out.println("Проверка №1:");
        ReflectionAnnotationUtil.check(account);

        System.out.println("Проверка №2:");
        account.setAmount(100);
        ReflectionAnnotationUtil.check(account);

        System.out.println("Проверка №3:");
        ReflectionAnnotationUtil.check(new IncorrectAccount());
/* Ожидаемый вывод:

Проверка №1:
Поле amount в классе JavaRushBankAccount имеет аннотацию LongPositive, но его значение не положительное.
Проверка №2:
Проверка №3:
Поле amountString в классе IncorrectAccount имеет аннотацию LongPositive, но его тип String.

*/
    }
}
