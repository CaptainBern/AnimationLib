package me.captainbern.animationlib.utils.wrappers;

import me.captainbern.animationlib.utils.refs.DataWatcherRef;

public class DataWatcher extends BasicWrapper{

    public DataWatcher(){
        setHandle(DataWatcherRef.create());
    }

    public void write(int index, Object value){
        DataWatcherRef.write(handle, index, value);
    }

    public void watch(int index, Object value) {
        DataWatcherRef.watch(handle, index, value);
    }
}
