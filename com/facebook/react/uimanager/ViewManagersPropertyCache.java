package com.facebook.react.uimanager;

import X.AnonymousClass0Df;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class ViewManagersPropertyCache {
    private static final Map CLASS_PROPS_CACHE = new HashMap();
    private static final Map EMPTY_PROPS_MAP = new HashMap();

    public abstract class PropSetter {
        private static final Object[] SHADOW_ARGS = new Object[1];
        private static final Object[] SHADOW_GROUP_ARGS = new Object[2];
        private static final Object[] VIEW_MGR_ARGS = new Object[2];
        private static final Object[] VIEW_MGR_GROUP_ARGS = new Object[3];
        public final Integer mIndex;
        public final String mPropName;
        public final String mPropType;
        public final Method mSetter;

        public abstract Object extractProperty(ReactStylesDiffMap reactStylesDiffMap);

        public PropSetter(ReactProp reactProp, String str, Method method) {
            this.mPropName = reactProp.name();
            if (!"__default_type__".equals(reactProp.customType())) {
                str = reactProp.customType();
            }
            this.mPropType = str;
            this.mSetter = method;
            this.mIndex = null;
        }

        public PropSetter(ReactPropGroup reactPropGroup, String str, Method method, int i) {
            this.mPropName = reactPropGroup.names()[i];
            if (!"__default_type__".equals(reactPropGroup.customType())) {
                str = reactPropGroup.customType();
            }
            this.mPropType = str;
            this.mSetter = method;
            this.mIndex = Integer.valueOf(i);
        }

        public final String getPropName() {
            return this.mPropName;
        }

        public final String getPropType() {
            return this.mPropType;
        }

        public final void updateShadowNodeProp(ReactShadowNode reactShadowNode, ReactStylesDiffMap reactStylesDiffMap) {
            try {
                if (this.mIndex == null) {
                    Object[] objArr = SHADOW_ARGS;
                    objArr[0] = extractProperty(reactStylesDiffMap);
                    this.mSetter.invoke(reactShadowNode, objArr);
                    Arrays.fill(objArr, null);
                    return;
                }
                Object[] objArr2 = SHADOW_GROUP_ARGS;
                objArr2[0] = this.mIndex;
                objArr2[1] = extractProperty(reactStylesDiffMap);
                this.mSetter.invoke(reactShadowNode, objArr2);
                Arrays.fill(objArr2, null);
            } catch (Throwable th) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error while updating prop ");
                stringBuilder.append(this.mPropName);
                AnonymousClass0Df.B(ViewManager.class, stringBuilder.toString(), th);
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error while updating property '");
                stringBuilder.append(this.mPropName);
                stringBuilder.append("' in shadow node of type: ");
                stringBuilder.append(reactShadowNode.getViewClass());
                JSApplicationIllegalArgumentException jSApplicationIllegalArgumentException = new JSApplicationIllegalArgumentException(stringBuilder.toString(), th);
            }
        }

        public final void updateViewProp(ViewManager viewManager, View view, ReactStylesDiffMap reactStylesDiffMap) {
            try {
                Object[] objArr;
                if (this.mIndex == null) {
                    objArr = VIEW_MGR_ARGS;
                    objArr[0] = view;
                    objArr[1] = extractProperty(reactStylesDiffMap);
                    this.mSetter.invoke(viewManager, objArr);
                } else {
                    VIEW_MGR_GROUP_ARGS[0] = view;
                    objArr = VIEW_MGR_GROUP_ARGS;
                    objArr[1] = this.mIndex;
                    objArr[2] = extractProperty(reactStylesDiffMap);
                    this.mSetter.invoke(viewManager, objArr);
                }
                Arrays.fill(objArr, null);
            } catch (Throwable th) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error while updating prop ");
                stringBuilder.append(this.mPropName);
                AnonymousClass0Df.B(ViewManager.class, stringBuilder.toString(), th);
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error while updating property '");
                stringBuilder.append(this.mPropName);
                stringBuilder.append("' of a view managed by: ");
                stringBuilder.append(viewManager.getName());
                JSApplicationIllegalArgumentException jSApplicationIllegalArgumentException = new JSApplicationIllegalArgumentException(stringBuilder.toString(), th);
            }
        }
    }

    public final class ArrayPropSetter extends PropSetter {
        public ArrayPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "Array", method);
        }

        public final Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getArray(this.mPropName);
        }
    }

    public final class BooleanPropSetter extends PropSetter {
        private final boolean mDefaultValue;

        public BooleanPropSetter(ReactProp reactProp, Method method, boolean z) {
            super(reactProp, "boolean", method);
            this.mDefaultValue = z;
        }

        public final Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getBoolean(this.mPropName, this.mDefaultValue) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public final class BoxedBooleanPropSetter extends PropSetter {
        public BoxedBooleanPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "boolean", method);
        }

        public final Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            if (reactStylesDiffMap.isNull(this.mPropName)) {
                return null;
            }
            return reactStylesDiffMap.getBoolean(this.mPropName, false) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public final class BoxedIntPropSetter extends PropSetter {
        public BoxedIntPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "number", method);
        }

        public BoxedIntPropSetter(ReactPropGroup reactPropGroup, Method method, int i) {
            super(reactPropGroup, "number", method, i);
        }

        public final Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return !reactStylesDiffMap.isNull(this.mPropName) ? Integer.valueOf(reactStylesDiffMap.getInt(this.mPropName, 0)) : null;
        }
    }

    public final class DoublePropSetter extends PropSetter {
        private final double mDefaultValue;

        public DoublePropSetter(ReactProp reactProp, Method method, double d) {
            super(reactProp, "number", method);
            this.mDefaultValue = d;
        }

        public DoublePropSetter(ReactPropGroup reactPropGroup, Method method, int i, double d) {
            super(reactPropGroup, "number", method, i);
            this.mDefaultValue = d;
        }

        public final Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return Double.valueOf(reactStylesDiffMap.getDouble(this.mPropName, this.mDefaultValue));
        }
    }

    public final class DynamicPropSetter extends PropSetter {
        public DynamicPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "mixed", method);
        }

        public DynamicPropSetter(ReactPropGroup reactPropGroup, Method method, int i) {
            super(reactPropGroup, "mixed", method, i);
        }

        public final Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getDynamic(this.mPropName);
        }
    }

    public final class FloatPropSetter extends PropSetter {
        private final float mDefaultValue;

        public FloatPropSetter(ReactProp reactProp, Method method, float f) {
            super(reactProp, "number", method);
            this.mDefaultValue = f;
        }

        public FloatPropSetter(ReactPropGroup reactPropGroup, Method method, int i, float f) {
            super(reactPropGroup, "number", method, i);
            this.mDefaultValue = f;
        }

        public final Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return Float.valueOf(reactStylesDiffMap.getFloat(this.mPropName, this.mDefaultValue));
        }
    }

    public final class IntPropSetter extends PropSetter {
        private final int mDefaultValue;

        public IntPropSetter(ReactProp reactProp, Method method, int i) {
            super(reactProp, "number", method);
            this.mDefaultValue = i;
        }

        public IntPropSetter(ReactPropGroup reactPropGroup, Method method, int i, int i2) {
            super(reactPropGroup, "number", method, i);
            this.mDefaultValue = i2;
        }

        public final Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return Integer.valueOf(reactStylesDiffMap.getInt(this.mPropName, this.mDefaultValue));
        }
    }

    public final class MapPropSetter extends PropSetter {
        public MapPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "Map", method);
        }

        public final Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getMap(this.mPropName);
        }
    }

    public final class StringPropSetter extends PropSetter {
        public StringPropSetter(ReactProp reactProp, Method method) {
            super(reactProp, "String", method);
        }

        public final Object extractProperty(ReactStylesDiffMap reactStylesDiffMap) {
            return reactStylesDiffMap.getString(this.mPropName);
        }
    }

    public static void clear() {
        CLASS_PROPS_CACHE.clear();
        EMPTY_PROPS_MAP.clear();
    }

    private static PropSetter createPropSetter(ReactProp reactProp, Method method, Class cls) {
        if (cls == Dynamic.class) {
            return new DynamicPropSetter(reactProp, method);
        }
        if (cls == Boolean.TYPE) {
            return new BooleanPropSetter(reactProp, method, reactProp.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return new IntPropSetter(reactProp, method, reactProp.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new FloatPropSetter(reactProp, method, reactProp.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new DoublePropSetter(reactProp, method, reactProp.defaultDouble());
        }
        if (cls == String.class) {
            return new StringPropSetter(reactProp, method);
        }
        if (cls == Boolean.class) {
            return new BoxedBooleanPropSetter(reactProp, method);
        }
        if (cls == Integer.class) {
            return new BoxedIntPropSetter(reactProp, method);
        }
        if (cls == ReadableArray.class) {
            return new ArrayPropSetter(reactProp, method);
        }
        if (cls == ReadableMap.class) {
            return new MapPropSetter(reactProp, method);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unrecognized type: ");
        stringBuilder.append(cls);
        stringBuilder.append(" for method: ");
        stringBuilder.append(method.getDeclaringClass().getName());
        stringBuilder.append("#");
        stringBuilder.append(method.getName());
        throw new RuntimeException(stringBuilder.toString());
    }

    private static void createPropSetters(ReactPropGroup reactPropGroup, Method method, Class cls, Map map) {
        ReactPropGroup reactPropGroup2 = reactPropGroup;
        String[] names = reactPropGroup.names();
        reactPropGroup = null;
        Method method2 = method;
        if (cls == Dynamic.class) {
            while (reactPropGroup < names.length) {
                map.put(names[reactPropGroup], new DynamicPropSetter(reactPropGroup2, method, reactPropGroup));
                reactPropGroup++;
            }
        } else if (cls == Integer.TYPE) {
            while (reactPropGroup < names.length) {
                map.put(names[reactPropGroup], new IntPropSetter(reactPropGroup2, method, reactPropGroup, reactPropGroup2.defaultInt()));
                reactPropGroup++;
            }
        } else if (cls == Float.TYPE) {
            while (reactPropGroup < names.length) {
                map.put(names[reactPropGroup], new FloatPropSetter(reactPropGroup2, method, reactPropGroup, reactPropGroup2.defaultFloat()));
                reactPropGroup++;
            }
        } else if (cls == Double.TYPE) {
            while (reactPropGroup < names.length) {
                map.put(names[reactPropGroup], new DoublePropSetter(reactPropGroup2, method2, reactPropGroup, reactPropGroup2.defaultDouble()));
                reactPropGroup++;
            }
        } else if (cls == Integer.class) {
            while (reactPropGroup < names.length) {
                map.put(names[reactPropGroup], new BoxedIntPropSetter(reactPropGroup2, method, reactPropGroup));
                reactPropGroup++;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unrecognized type: ");
            stringBuilder.append(cls);
            stringBuilder.append(" for method: ");
            stringBuilder.append(method.getDeclaringClass().getName());
            stringBuilder.append("#");
            stringBuilder.append(method.getName());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void extractPropSettersFromShadowNodeClassDefinition(Class cls, Map map) {
        for (Method method : cls.getDeclaredMethods()) {
            Class[] parameterTypes;
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map.put(reactProp.name(), createPropSetter(reactProp, method, parameterTypes[0]));
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Wrong number of args for prop setter: ");
                    stringBuilder.append(cls.getName());
                    stringBuilder.append("#");
                    stringBuilder.append(method.getName());
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Wrong number of args for group prop setter: ");
                    stringBuilder.append(cls.getName());
                    stringBuilder.append("#");
                    stringBuilder.append(method.getName());
                    throw new RuntimeException(stringBuilder.toString());
                } else if (parameterTypes[0] == Integer.TYPE) {
                    createPropSetters(reactPropGroup, method, parameterTypes[1], map);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Second argument should be property index: ");
                    stringBuilder.append(cls.getName());
                    stringBuilder.append("#");
                    stringBuilder.append(method.getName());
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
    }

    private static void extractPropSettersFromViewManagerClassDefinition(Class cls, Map map) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            Class[] parameterTypes;
            StringBuilder stringBuilder;
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Wrong number of args for prop setter: ");
                    stringBuilder.append(cls.getName());
                    stringBuilder.append("#");
                    stringBuilder.append(method.getName());
                    throw new RuntimeException(stringBuilder.toString());
                } else if (View.class.isAssignableFrom(parameterTypes[0])) {
                    map.put(reactProp.name(), createPropSetter(reactProp, method, parameterTypes[1]));
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("First param should be a view subclass to be updated: ");
                    stringBuilder.append(cls.getName());
                    stringBuilder.append("#");
                    stringBuilder.append(method.getName());
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 3) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Wrong number of args for group prop setter: ");
                    stringBuilder.append(cls.getName());
                    stringBuilder.append("#");
                    stringBuilder.append(method.getName());
                    throw new RuntimeException(stringBuilder.toString());
                } else if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("First param should be a view subclass to be updated: ");
                    stringBuilder.append(cls.getName());
                    stringBuilder.append("#");
                    stringBuilder.append(method.getName());
                    throw new RuntimeException(stringBuilder.toString());
                } else if (parameterTypes[1] == Integer.TYPE) {
                    createPropSetters(reactPropGroup, method, parameterTypes[2], map);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Second argument should be property index: ");
                    stringBuilder.append(cls.getName());
                    stringBuilder.append("#");
                    stringBuilder.append(method.getName());
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
    }

    public static Map getNativePropSettersForShadowNodeClass(Class cls) {
        for (Class cls2 : cls.getInterfaces()) {
            if (cls2 == ReactShadowNode.class) {
                return EMPTY_PROPS_MAP;
            }
        }
        Map map = (Map) CLASS_PROPS_CACHE.get(cls);
        if (map != null) {
            return map;
        }
        Map hashMap = new HashMap(getNativePropSettersForShadowNodeClass(cls.getSuperclass()));
        extractPropSettersFromShadowNodeClassDefinition(cls, hashMap);
        CLASS_PROPS_CACHE.put(cls, hashMap);
        return hashMap;
    }

    public static Map getNativePropSettersForViewManagerClass(Class cls) {
        if (cls == ViewManager.class) {
            return EMPTY_PROPS_MAP;
        }
        Map map = (Map) CLASS_PROPS_CACHE.get(cls);
        if (map != null) {
            return map;
        }
        Map hashMap = new HashMap(getNativePropSettersForViewManagerClass(cls.getSuperclass()));
        extractPropSettersFromViewManagerClassDefinition(cls, hashMap);
        CLASS_PROPS_CACHE.put(cls, hashMap);
        return hashMap;
    }
}
