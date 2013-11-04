package me.captainbern.animationlib.utils;

import java.lang.reflect.Method;

public class DataWatcher extends Object{
	
	private Object datawatcher;
	
	public DataWatcher(){
		try {
			datawatcher = ReflectionUtil.getNMSClass("DataWatcher");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void write(int i, Object object){
		try{
		Method method = datawatcher.getClass().getMethod("a", int.class, Object.class);
		method.invoke(datawatcher, i, object);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Object getDataWatcherObject(){
		return datawatcher;
	}
}
