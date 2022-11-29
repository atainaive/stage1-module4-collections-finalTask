package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
    Map<Integer, Set<String>> map = new HashMap<>();

    for (Map.Entry<String, Integer> entry : sourceMap.entrySet()){
        if(map.containsKey(entry.getKey().length())){
            map.get(entry.getKey().length()).add(entry.getKey());
        } else{
            map.put(entry.getKey().length(), new HashSet<>(Set.of(entry.getKey())));
        }
    }

    return map;
    }
}
