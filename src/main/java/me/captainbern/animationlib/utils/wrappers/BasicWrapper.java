package me.captainbern.animationlib.utils.wrappers;

public class BasicWrapper {

    protected Object handle;

    protected void setHandle(Object handle){
        if(handle == null){
            throw new UnsupportedOperationException("Cannot set handle to null!");
        }
        this.handle = handle;
    }

    public Object getHandle(){
        return handle;
    }
}
