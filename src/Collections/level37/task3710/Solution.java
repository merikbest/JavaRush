package Collections.level37.task3710;

/*
Decorator

Создай класс RedShapeDecorator в пакете decorators. Он должен расширять функциональность объектов типа Shape не меняя их структуру.

Я уже создал абстрактный класс ShapeDecorator, поэтому:
1) Класс RedShapeDecorator сделай наследником класса ShapeDecorator.
2) Реализуй приватный метод setBorderColor() с одним параметром типа Shape.
Он должен выводить на экран фразу "Setting the border color for XXX to red.", где XXX - имя конкретного декорируемого класса (можешь воспользоваться методами getClass().getSimpleName() вызванными на объекте полученном в качестве параметра).
3) Переопредели метод draw(), в нем сначала измени цвет отображаемого объекта с помощью метода setBorderColor(), а потом нарисуй его.

Требования:
•	Класс RedShapeDecorator должен быть потомком класса ShapeDecorator.
•	Метод setBorderColor() должен выводить на экран фразу соответствующую условию задачи.
•	Метод setBorderColor() должен быть приватным.
•	В методе draw() класса RedShapeDecorator должен быть изменен цвет декорируемого объекта и вызван его метод draw().
•	Публичный конструктор класса RedShapeDecorator должен принимать один параметр типа Shape.
*/

import Collections.level37.task3710.shapes.Circle;
import Collections.level37.task3710.shapes.Shape;

public class Solution {
    public static void main(String[] args) {
        Shape circle = new Circle();
//        Shape redCircle = new RedShapeDecorator(new Circle()); //ERROR
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());//ERROR

        System.out.println("Simple circle");
        circle.draw();

//        System.out.println("\nApplied RedShapeDecorator to the circle");
//        redCircle.draw();
//
//        System.out.println("\nApplied RedShapeDecorator to the rectangle");
//        redRectangle.draw();
    }
}
