package me.captainbern.animationlib.utils.wrappers;

import me.captainbern.animationlib.utils.refs.IntHashMapRef;

public class IntHashMap <T> extends BasicWrapper {

    public IntHashMap() {
        this.setHandle(IntHashMapRef.constructor.newInstance());
    }

    public IntHashMap(Object handle) {
        this.setHandle(handle);
    }

    @SuppressWarnings("unchecked")
    public T get(int key) {
        return (T) IntHashMapRef.get.invoke(handle, key);
    }

    public boolean contains(int key) {
        return IntHashMapRef.contains.invoke(handle, key);
    }

    @SuppressWarnings("unchecked")
    public T remove(int key) {
        return (T) IntHashMapRef.remove.invoke(handle, key);
    }

    public void put(int key, Object value) {
        IntHashMapRef.put.invoke(handle, key, value);
    }

    public void clear() {
        IntHashMapRef.clear.invoke(handle);
    }
}
