package Collections.c36.Shortener.tests;


import Collections.c36.Shortener.HashMapStorageStrategy;
import Collections.c36.Shortener.Helper;
import Collections.c36.Shortener.Shortener;
import Collections.c36.Shortener.strategy.HashBiMapStorageStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SpeedTest {

    public long getTimeToGetIds(Shortener shortener, Set<String> strings, Set<Long> ids) {
        Date start = new Date();
        for (String s : strings)
            ids.add(shortener.getId(s));
        return new Date().getTime() - start.getTime();
    }

    public long getTimeToGetStrings(Shortener shortener, Set<Long> ids, Set<String> strings) {
        Date start = new Date();
        for (Long id : ids)
            strings.add(shortener.getString(id));
        return new Date().getTime() - start.getTime();
    }

    @Test
    public void testHashMapStorage() {
        Shortener shortener1 = new Shortener(new HashMapStorageStrategy());
        Shortener shortener2 = new Shortener(new HashBiMapStorageStrategy());
        Set<String> origStrings = new HashSet<>();
        Set<Long> ids = new HashSet<>();
        for (int i = 0; i < 10000; i++)
            origStrings.add(Helper.generateRandomString());
        Assert.assertTrue(getTimeToGetIds(shortener1, origStrings, ids) > getTimeToGetIds(shortener2, origStrings, ids));
        Assert.assertEquals(getTimeToGetStrings(shortener1, ids, origStrings), getTimeToGetStrings(shortener2, ids, origStrings), 30);
    }
}