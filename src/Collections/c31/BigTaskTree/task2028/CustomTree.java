package Collections.c31.BigTaskTree.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

public class CustomTree extends AbstractList<String> implements Serializable, Cloneable {

    Entry<String> root;

    public CustomTree(Entry<String> root) {
        this.root = root;
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) throws UnsupportedOperationException {
        return super.set(index, element);
    }

    @Override
    public void add(int index, String element) throws UnsupportedOperationException {
        super.add(index, element);
    }

    @Override
    public String remove(int index) throws UnsupportedOperationException {
        return super.remove(index);
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c)  {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) throws UnsupportedOperationException {
        super.removeRange(fromIndex, toIndex);
    }

    @Override
    public int size() {
        return 0;
    }
}
