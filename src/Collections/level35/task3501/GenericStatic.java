package Collections.level35.task3501;

public class GenericStatic {
    public static <Number> Number someStaticMethod(Number genericObject) {
        System.out.println(genericObject);
        return genericObject;
    }
}
