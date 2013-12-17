package me.captainbern.animationlib.utils;

import com.google.common.collect.BiMap;

import java.util.Map;

public class UtilUtil {

    public static <K, V> K getKeyAtValue(Map<K, V> map, V value) {
        if(map instanceof BiMap) {
            return ((BiMap<K, V>) map).inverse().get(value);
        }
        for(Map.Entry<K, V> entry : map.entrySet()) {
            if(entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
