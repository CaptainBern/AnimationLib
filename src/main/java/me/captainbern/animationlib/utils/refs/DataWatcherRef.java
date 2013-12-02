package me.captainbern.animationlib.utils.refs;

import me.captainbern.animationlib.reflection.BukkitServer;
import me.captainbern.animationlib.reflection.ClassTemplate;
import me.captainbern.animationlib.reflection.MethodAccessor;
import me.captainbern.animationlib.reflection.NMSClassTemplate;

import java.util.List;

public class DataWatcherRef {

    public static final ClassTemplate<Object> dataWatcher= new NMSClassTemplate("DataWatcher");
    public static final MethodAccessor<Void> write = dataWatcher.getMethod("a", int.class, Object.class);
    public static final MethodAccessor<Void> watch = dataWatcher.getMethod("watch", int.class, Object.class);
    public static final MethodAccessor<List<Object>> returnAllWatched = dataWatcher.getMethod("c");
    public static final MethodAccessor<List<Object>> unwatchAndReturnAllWatched = dataWatcher.getMethod("b");
    public static final MethodAccessor<Object> read = dataWatcher.getMethod("i", int.class);
    public static final MethodAccessor<Boolean> isChanged = dataWatcher.getMethod("a");
    public static final MethodAccessor<Boolean> isEmpty = dataWatcher.getMethod("d");

    public static void write(Object datawatcher, int index, Object value) {
        write.invoke(datawatcher, index, value);
    }

    public static void watch(Object datawatcher, int index, Object value) {
        watch.invoke(index, value);
    }

    public static List<Object> getAllWatched(Object datawatcher) {
        return returnAllWatched.invoke(datawatcher);
    }

    public static List<Object> unwatchAndGetAllWatched(Object datawatcher) {
        return unwatchAndReturnAllWatched.invoke(datawatcher);
    }

    public static Object create(Object handle) {
        return dataWatcher.getConstructor(BukkitServer.getNMSClass("Entity")).newInstance(handle);
    }
}
