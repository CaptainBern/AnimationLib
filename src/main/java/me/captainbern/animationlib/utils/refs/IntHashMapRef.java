package me.captainbern.animationlib.utils.refs;

import me.captainbern.animationlib.reflection.ClassTemplate;
import me.captainbern.animationlib.reflection.MethodAccessor;
import me.captainbern.animationlib.reflection.NMSClassTemplate;
import me.captainbern.animationlib.reflection.SafeConstructor;

public class IntHashMapRef {

    public static final ClassTemplate<?> TEMPLATE = new NMSClassTemplate("IntHashMap");
    public static final SafeConstructor<?> constructor = TEMPLATE.getConstructor();
    public static final MethodAccessor<Object> get = TEMPLATE.getMethod("get", int.class);
    public static final MethodAccessor<Object> remove = TEMPLATE.getMethod("d", int.class);
    public static final MethodAccessor<Void> put = TEMPLATE.getMethod("a", int.class, Object.class);
    public static final MethodAccessor<Boolean> contains = TEMPLATE.getMethod("b", int.class);
    public static final MethodAccessor<Object> clear = TEMPLATE.getMethod("c");

}
