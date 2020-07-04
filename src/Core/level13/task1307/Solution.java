package Core.level13.task1307;
/*
Параметризованый интерфейс
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
    //допишите здесь ваш код
    class StringObject implements SimpleObject <String> {


        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }

}
