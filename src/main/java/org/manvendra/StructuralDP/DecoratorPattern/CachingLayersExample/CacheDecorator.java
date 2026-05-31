package main.java.org.manvendra.StructuralDP.DecoratorPattern.CachingLayersExample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheDecorator extends DataSourceDecorator{
    private Map<String, String> cache = new ConcurrentHashMap<>();

    CacheDecorator(DatabaseSource databaseSource) {
        super(databaseSource);
    }

    @Override
    public String getData(String id) {
        // 1. Check if data is in cache
        if (cache.containsKey(id)) {
            System.out.println("[Cache] HIT! Returning data instantly for ID: " + id);
            return cache.get(id);
        }

        // 2. If not, delegate to the wrapped object (the real DB)
        System.out.println("[Cache] MISS! Delegating to underlying source...");
        String data = super.getData(id); // Calls wrapper.readData(id)

        // 3. Store the result in cache for next time
        cache.put(id, data);

        return data;
    }

    // Add-on: Method to manually invalidate cache if needed
    public void invalidateCache(String id) {
        System.out.println("[Cache] Invalidating data for ID: " + id);
        cache.remove(id);
    }
}
