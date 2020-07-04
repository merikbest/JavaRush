package Core.level18.task1815;

import java.util.List;

public class Solution {

    public interface TableInterface {
        void setModel(List rows);
        String getHeaderText();
        void setHeaderText(String newHeaderText);
    }





    public class TableInterfaceWrapper implements TableInterface {
        private TableInterface component;

        public TableInterfaceWrapper(TableInterface component) {
            this.component = component;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            component.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return component.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            component.setHeaderText(newHeaderText);
        }
    }

    public static void main(String[] args) {
    }
}
