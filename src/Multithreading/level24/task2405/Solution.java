package Multithreading.level24.task2405;

/*
Black box

1. Восстанови логику метода someAction для поля solutionAction.
2. Пример вывода смотри в комментарии к методу main.
3. Подсказка: метод someAction анонимного класса поля solutionAction должен вызвать метод сабкласса FirstClass, если param > 0, иначе вызвать метод сабкласса SecondClass.

Не изменяй метод main!

Требования:
•	Вывод на экран должен соответствовать условию задачи.
•	Для вывода должны быть использованы строковые константы объявленные в классе SecondClass.
•	В методе someAction анонимного класса Action созданного в классе Solution должен содержаться вызов метода someAction родительского класса (super.someAction()).
•	В методе someAction анонимного класса Action созданного в классе Solution должен быть создан объект типа FirstClass.
•	В методе someAction анонимного класса Action созданного в классе Solution должен быть создан объект типа SecondClass.
*/


public class Solution implements Action {
    public static int countActionObjects;

    private int param;
    private Action solutionAction = new Action() {

        //!!!!! Изменения могут быть тут
        public void someAction() {
            FirstClass firstClass = new FirstClass() {
                @Override
                public Action getDependantAction() {
                    super.someAction();
                    return null;
                }
            };
            SecondClass secondClass = new SecondClass();

            if (param>0){
                while (param>0){
                    System.out.println(param--);
                }
                firstClass.someAction();
                secondClass.someAction();
                System.out.println(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM.substring(1)+param);
            }
            else {
                secondClass.someAction();
                countActionObjects--;
                System.out.println(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM.substring(1)+param);
            }

            //!!!!! Все изменения должны быть только тут
        }
    };


    public Solution(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * class FirstClass, method someAction
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = 0
     * Count of created Action objects is 2
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = -1
     * Count of created Action objects is 3
     */
    public static void main(String[] args) {
        Solution solution = new Solution(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new Solution(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }
}
