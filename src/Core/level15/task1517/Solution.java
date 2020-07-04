package Core.level15.task1517;

public class Solution {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        A /= A;
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
