package Core.level19.task1921;

public class test {
    public static void main(String[] args) {
        String line = "Zmishenko Valery Alvertovich 31 12 1987";
        String nameStr = line.replaceAll("[\\d]", "").trim();

        System.out.println(nameStr);
    }
}
