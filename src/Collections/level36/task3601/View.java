package Collections.level36.task3601;

public class View  {
    private Controller controller = new Controller();
    public void fireShowDataEvent() {
        System.out.println(controller.onShowDataList());
    }
}
