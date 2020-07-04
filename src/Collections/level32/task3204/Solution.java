package Collections.level32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
Генератор паролей

Реализуй логику метода getPassword, который должен возвращать ByteArrayOutputStream, в котором будут байты пароля.
Требования к паролю:
1) 8 символов.
2) только цифры и латинские буквы разного регистра.
3) обязательно должны присутствовать цифры, и буквы разного регистра.
Все сгенерированные пароли должны быть уникальные.

Пример правильного пароля:
wMh7smNu

Требования:
•	Класс Solution должен содержать метод getPassword(), который возвращает ByteArrayOutputStream со сгенерированным паролем.
•	Длина пароля должна составлять 8 символов.
•	Пароль должен содержать хотя бы одну цифру.
•	Пароль должен содержать хотя бы одну латинскую букву нижнего регистра.
•	Пароль должен содержать хотя бы одну латинскую букву верхнего регистра.
•	Пароль не должен содержать других символов, кроме цифр и латинских букв разного регистра.
•	Сгенерированные пароли должны быть уникальными.
*/

public class Solution {
    static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    static final String UPPER = LOWER.toUpperCase();
    static final String DIGITS = "1234567890";

    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            StringBuffer password = new StringBuffer();

            String values = LOWER + UPPER + DIGITS;

//            for (int i = 0; i < 8; i++) {
//                password.append(values.charAt((int)(Math.random()*values.length())));
//            }

        for (int i=0; i<3; i++) {
            password.append(LOWER.charAt((int)(Math.random()*26)));
        }
        for (int i=0; i<3; i++) {
            password.append(UPPER.charAt((int)(Math.random()*26)));
        }
        for (int i=0; i<2; i++) {
            password.append(DIGITS.toUpperCase().charAt((int)(Math.random()*10)));
        }

        try {
            outputStream.write(password.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return outputStream;
    }
}
