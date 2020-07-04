package Collections.level39.task3911;

/*
Rollback

Необходимо реализовать метод rollback в классе Software, который будет позволять откатить текущую версию ПО на желаемую.
Все версии следующие после той, на которую откатываемся, должны быть удалены, также не забудь изменить поле currentVersion.
Метод rollback должен вернуть true, если все прошло успешно и false, если желаемая версия не была найдена.

Требования:
Метод rollback должен возвращать false, если желаемая версия не была найдена в versionHistoryMap.
Метод rollback должен удалять из versionHistoryMap только версии ПО, следующие за той, которую передали в качестве параметра.
Метод rollback должен устанавливать currentVersion в соответствие с новым значением и возвращать true в случае успешного отката.
Метод rollback не должен изменять currentVersion и versionHistoryMap, если откат невозможен.
*/

public class Solution {
    public static void main(String[] args) {
//        int n = 3;
//        for (int i = 1; i < 7; i++) {
//            software.addNewVersion(i, "Description of version #" + i);
//        }
//
//        System.out.println("Printing all versions ");
//        for (Map.Entry entry : software.getVersionHistoryMap().entrySet()) {
//            System.out.println(entry.getKey() + " :: " + entry.getValue());
//        }
//        System.out.println("The current version is " + software.getCurrentVersion());
//
//        System.out.println("ROLLING BACK to version " + n);
//        software.rollback(n);
//
//        System.out.println("\nPrinting all versions ");
//        for (Map.Entry entry : software.getVersionHistoryMap().entrySet()) {
//            System.out.println(entry.getKey() + " :: " + entry.getValue());
//        }
//        System.out.println("The current version is " + software.getCurrentVersion());
    }
}
