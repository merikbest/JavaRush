package Collections.level34.CollectionsTask;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {

    private static final Object PRESENT = new Object();
    private transient HashMap<E,Object> map;

    public AmigoSet() {
        map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        addAll(collection);
    }

    @Override
    public boolean add(E e) {
        return null == map.put(e,PRESENT);
    }

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    protected Object clone() throws InternalError {
        try {
            HashMap<E, Object> copyMap = (HashMap) map.clone();
            AmigoSet<E> copySet = new AmigoSet<>();
            copySet.map = copyMap;
            return copySet;
        } catch (Exception e) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(map.size());
            objectOutputStream.writeFloat(HashMapReflectionHelper.callHiddenMethod(map, "loadFactor"));
            objectOutputStream.writeInt(HashMapReflectionHelper.callHiddenMethod(map, "capacity"));
            for (Map.Entry<E, Object> entry : map.entrySet())
                objectOutputStream.writeObject(entry.getKey());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            int size = objectInputStream.readInt();
            float loadFactor = objectInputStream.readFloat();
            int capacity = objectInputStream.readInt();
            this.map = new HashMap<>(capacity,loadFactor);
            for (int i = 0; i < size; i++) {
                Object o = objectInputStream.readObject();
                map.put((E) o, PRESENT);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
