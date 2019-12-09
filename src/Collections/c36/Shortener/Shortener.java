package Collections.c36.Shortener;

import Collections.c36.Shortener.strategy.StorageStrategy;

public class Shortener {
    private Long lastId = 0L;
    private StorageStrategy storageStrategy;

    public Shortener(StorageStrategy storageStrategy) {
        this.storageStrategy = storageStrategy;
    }

    public synchronized  Long getId(String string) {
        if (storageStrategy != null)
            return storageStrategy.getKey(string);
        else
            lastId++;
            storageStrategy.put(lastId,string);

        return lastId;
    }

    public synchronized  String getString(Long id) {
        return storageStrategy.getValue(id);
    }
}
