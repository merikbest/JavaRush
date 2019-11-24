package Multithreading.task23.task2305;

/*
Inner

Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.

Требования:
•	В классе Solution должен быть реализован метод getTwoSolutions.
•	Метод getTwoSolutions должен быть статическим.
•	Метод getTwoSolutions должен быть публичным.
•	Метод getTwoSolutions должен возвращать массив типа Solution заполненный согласно заданию.
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {

    }

    public static Solution[] getTwoSolutions() {
        Solution [] solution = new Solution[2];
        solution[0] = new Solution();
        solution[1] = new Solution();
        solution[0].innerClasses[0] = solution[1].innerClasses[0] = new Solution().new InnerClass();
        solution[0].innerClasses[1] = solution[1].innerClasses[1] = new Solution().new InnerClass();
        return solution;
    }

    public static void main(String[] args) {


    }
}
