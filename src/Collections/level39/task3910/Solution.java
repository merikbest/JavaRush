package Collections.level39.task3910;

/*
isPowerOfThree

Исправь ошибку в методе isPowerOfThree(int n), он должен возвращать true, если n является целочисленной степенью числа 3. Иначе - false.

Требования:
•	Метод isPowerOfThree должен возвращать true, если n является целочисленной степенью числа 3.
•	Метод isPowerOfThree должен возвращать false, если n не является целочисленной степенью числа 3.
•	Метод isPowerOfThree должен быть публичным.
•	Метод isPowerOfThree должен быть статическим.
*/
public class Solution {
    public static void main(String[] args) {

    }

    public static boolean isPowerOfThree(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }
}
