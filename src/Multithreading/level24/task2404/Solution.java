package Multithreading.level24.task2404;

/*
Рефакторинг Rectangle

В классе Rectangle:
1. Измени методы getHeight и getWidth, чтобы они возвращали объекты типов HasHeight и HasWidth соответственно.
2. Для этого внутри методов getHeight и getWidth создай локальные классы - реализации интерфейсов.
3. Переименуй getHeight в castToHasHeight, getWidth в castToHasWidth (на имени метода нажми Shift+F6).
4. Убери наследование интерфейсов в классе Rectangle.

P.S. Ожидается, что после внесения требуемых изменений, закомментированный код в методе станет рабочим и должен быть раскомментирован.

Требования:
•	В класса Rectangle должен быть реализован метод castToHasHeight.
•	В класса Rectangle должен быть реализован метод castToHasWidth.
•	Метод castToHasHeight должен возвращать объект типа HasHeight.
•	Метод castToHasWidth должен возвращать объект типа HasWidth.
•	Объект возвращаемый методом castToHasHeight должен вычислять высоту, как разницу между y координатами.
•	Объект возвращаемый методом castToHasWidth должен вычислять ширину, как разницу между x координатами.
•	Класс Rectangle не должен реализовывать интерфейс HasHeight.
•	Класс Rectangle не должен реализовывать интерфейс HasWidth.
  

*/
public class Solution {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
//        System.out.println(getHeight(rectangle));
//        System.out.println(getWidth(rectangle));
        /////////////////////expected//////////////////
        System.out.println(getHeight(rectangle.castToHasHeight()));
        System.out.println(getWidth(rectangle.castToHasWidth()));
    }

    public static double getHeight(HasHeight rectangle) {
        return rectangle.getHeight();
    }

    public static double getWidth(HasWidth rectangle) {
        return rectangle.getWidth();
    }


    public static class Rectangle {
        private Point point1;
        private Point point2;

        public Rectangle(double x1, double y1, double x2, double y2) {
            point1 = new Point(x1, y1);
            point2 = new Point(x2, y2);
        }

        HasHeight castToHasHeight() {
            return new HasHeight() {
                @Override
                public double getHeight() {
                    return Math.abs(point1.getY() - point2.getY());
                }
            };
        }

        HasWidth castToHasWidth() {
            return new HasWidth() {
                @Override
                public double getWidth() {
                    return Math.abs(point1.getX() - point2.getX());
                }
            };
        }

//        public double getHeight() {
//            return Math.abs(point1.getY() - point2.getY());
//        }
//
//        public double getWidth() {
//            return Math.abs(point1.getX() - point2.getX());
//        }
    }
}