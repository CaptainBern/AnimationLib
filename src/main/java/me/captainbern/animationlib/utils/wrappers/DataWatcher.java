package me.captainbern.animationlib.utils.wrappers;

import me.captainbern.animationlib.utils.PlayerUtil;
import me.captainbern.animationlib.utils.refs.DataWatcherRef;
import org.bukkit.entity.Entity;

import java.util.List;

public class DataWatcher extends BasicWrapper{

    public DataWatcher(Entity entity){
        setHandle(DataWatcherRef.create(PlayerUtil.getHandle(entity)));
    }

    public void write(int index, Object value){
        DataWatcherRef.write(handle, index, value);
    }

    public void watch(int index, Object value) {
        DataWatcherRef.watch(handle, index, value);
    }

    public List<Object> getAllWatched() {
        return DataWatcherRef.returnAllWatched.invoke(getHandle());
    }

    public List<Object> unwatchAndGetAllWatched() {
        return DataWatcherRef.unwatchAndReturnAllWatched.invoke(getHandle());
    }
}
