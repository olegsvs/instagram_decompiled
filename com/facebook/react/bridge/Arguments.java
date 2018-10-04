package com.facebook.react.bridge;

import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class Arguments {

    /* renamed from: com.facebook.react.bridge.Arguments$1 */
    public final class C00831 extends AbstractList {
        public final /* synthetic */ Object val$objects;

        public C00831(Object obj) {
            this.val$objects = obj;
        }

        public final Object get(int i) {
            return Array.get(this.val$objects, i);
        }

        public final int size() {
            return Array.getLength(this.val$objects);
        }
    }

    private static void addEntry(WritableNativeMap writableNativeMap, String str, Object obj) {
        Object makeNativeObject = makeNativeObject(obj);
        if (makeNativeObject == null) {
            writableNativeMap.putNull(str);
        } else if (makeNativeObject instanceof Boolean) {
            writableNativeMap.putBoolean(str, ((Boolean) makeNativeObject).booleanValue());
        } else if (makeNativeObject instanceof Integer) {
            writableNativeMap.putInt(str, ((Integer) makeNativeObject).intValue());
        } else if (makeNativeObject instanceof Number) {
            writableNativeMap.putDouble(str, ((Number) makeNativeObject).doubleValue());
        } else if (makeNativeObject instanceof String) {
            writableNativeMap.putString(str, (String) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeArray) {
            writableNativeMap.putArray(str, (WritableNativeArray) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeMap) {
            writableNativeMap.putMap(str, (WritableNativeMap) makeNativeObject);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not convert ");
            stringBuilder.append(makeNativeObject.getClass());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static WritableArray createArray() {
        return new WritableNativeArray();
    }

    public static WritableMap createMap() {
        return new WritableNativeMap();
    }

    public static WritableArray fromArray(Object obj) {
        WritableArray createArray = createArray();
        int i = 0;
        int length;
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            length = strArr.length;
            while (i < length) {
                createArray.pushString(strArr[i]);
                i++;
            }
        } else if (obj instanceof Bundle[]) {
            Bundle[] bundleArr = (Bundle[]) obj;
            length = bundleArr.length;
            while (i < length) {
                createArray.pushMap(fromBundle(bundleArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            length = iArr.length;
            while (i < length) {
                createArray.pushInt(iArr[i]);
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            r2 = fArr.length;
            while (i < r2) {
                createArray.pushDouble((double) fArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            r2 = dArr.length;
            while (i < r2) {
                createArray.pushDouble(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            length = zArr.length;
            while (i < length) {
                createArray.pushBoolean(zArr[i]);
                i++;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown array type ");
            stringBuilder.append(obj.getClass());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return createArray;
    }

    public static WritableMap fromBundle(Bundle bundle) {
        WritableMap createMap = createMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                createMap.putNull(str);
            } else if (obj.getClass().isArray()) {
                createMap.putArray(str, fromArray(obj));
            } else if (obj instanceof String) {
                createMap.putString(str, (String) obj);
            } else if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    createMap.putInt(str, ((Integer) obj).intValue());
                } else {
                    createMap.putDouble(str, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Bundle) {
                createMap.putMap(str, fromBundle((Bundle) obj));
            } else if (obj instanceof List) {
                createMap.putArray(str, fromList((List) obj));
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not convert ");
                stringBuilder.append(obj.getClass());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return createMap;
    }

    public static WritableNativeArray fromJavaArgs(Object[] objArr) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : objArr) {
            if (obj == null) {
                writableNativeArray.pushNull();
            } else {
                Class cls = obj.getClass();
                if (cls == Boolean.class) {
                    writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (cls == Integer.class) {
                    writableNativeArray.pushDouble(((Integer) obj).doubleValue());
                } else if (cls == Double.class) {
                    writableNativeArray.pushDouble(((Double) obj).doubleValue());
                } else if (cls == Float.class) {
                    writableNativeArray.pushDouble(((Float) obj).doubleValue());
                } else if (cls == String.class) {
                    writableNativeArray.pushString(obj.toString());
                } else if (cls == WritableNativeMap.class) {
                    writableNativeArray.pushMap((WritableNativeMap) obj);
                } else if (cls == WritableNativeArray.class) {
                    writableNativeArray.pushArray((WritableNativeArray) obj);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot convert argument of type ");
                    stringBuilder.append(cls);
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
        return writableNativeArray;
    }

    public static WritableArray fromList(List list) {
        WritableArray createArray = createArray();
        for (Object next : list) {
            if (next == null) {
                createArray.pushNull();
            } else if (next.getClass().isArray()) {
                createArray.pushArray(fromArray(next));
            } else if (next instanceof Bundle) {
                createArray.pushMap(fromBundle((Bundle) next));
            } else if (next instanceof List) {
                createArray.pushArray(fromList((List) next));
            } else if (next instanceof String) {
                createArray.pushString((String) next);
            } else if (next instanceof Integer) {
                createArray.pushInt(((Integer) next).intValue());
            } else if (next instanceof Number) {
                createArray.pushDouble(((Number) next).doubleValue());
            } else if (next instanceof Boolean) {
                createArray.pushBoolean(((Boolean) next).booleanValue());
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown value type ");
                stringBuilder.append(next.getClass());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return createArray;
    }

    public static WritableNativeArray makeNativeArray(Object obj) {
        if (obj == null) {
            return new WritableNativeArray();
        }
        return makeNativeArray(new C00831(obj));
    }

    public static WritableNativeArray makeNativeArray(List list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list != null) {
            for (Object makeNativeObject : list) {
                Object makeNativeObject2 = makeNativeObject(makeNativeObject);
                if (makeNativeObject2 == null) {
                    writableNativeArray.pushNull();
                } else if (makeNativeObject2 instanceof Boolean) {
                    writableNativeArray.pushBoolean(((Boolean) makeNativeObject2).booleanValue());
                } else if (makeNativeObject2 instanceof Integer) {
                    writableNativeArray.pushInt(((Integer) makeNativeObject2).intValue());
                } else if (makeNativeObject2 instanceof Double) {
                    writableNativeArray.pushDouble(((Double) makeNativeObject2).doubleValue());
                } else if (makeNativeObject2 instanceof String) {
                    writableNativeArray.pushString((String) makeNativeObject2);
                } else if (makeNativeObject2 instanceof WritableNativeArray) {
                    writableNativeArray.pushArray((WritableNativeArray) makeNativeObject2);
                } else if (makeNativeObject2 instanceof WritableNativeMap) {
                    writableNativeArray.pushMap((WritableNativeMap) makeNativeObject2);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not convert ");
                    stringBuilder.append(makeNativeObject2.getClass());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        return writableNativeArray;
    }

    public static WritableNativeMap makeNativeMap(Bundle bundle) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                addEntry(writableNativeMap, str, bundle.get(str));
            }
        }
        return writableNativeMap;
    }

    public static WritableNativeMap makeNativeMap(Map map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                addEntry(writableNativeMap, (String) entry.getKey(), entry.getValue());
            }
        }
        return writableNativeMap;
    }

    private static Object makeNativeObject(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte))) {
            if (!(obj instanceof Short)) {
                if (obj.getClass().isArray()) {
                    return makeNativeArray(obj);
                }
                if (obj instanceof List) {
                    return makeNativeArray((List) obj);
                }
                if (obj instanceof Map) {
                    return makeNativeMap((Map) obj);
                }
                return obj instanceof Bundle ? makeNativeMap((Bundle) obj) : obj;
            }
        }
        return new Double(((Number) obj).doubleValue());
    }

    public static Bundle toBundle(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        Bundle bundle = new Bundle();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey).ordinal()) {
                case 0:
                    bundle.putString(nextKey, null);
                    break;
                case 1:
                    bundle.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 2:
                    bundle.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 3:
                    bundle.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 4:
                    bundle.putBundle(nextKey, toBundle(readableMap.getMap(nextKey)));
                    break;
                case 5:
                    bundle.putSerializable(nextKey, toList(readableMap.getArray(nextKey)));
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not convert object with key: ");
                    stringBuilder.append(nextKey);
                    stringBuilder.append(".");
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return bundle;
    }

    public static ArrayList toList(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i).ordinal()) {
                case 0:
                    arrayList.add(null);
                    break;
                case 1:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 2:
                    double d = readableArray.getDouble(i);
                    if (d != Math.rint(d)) {
                        arrayList.add(Double.valueOf(d));
                        break;
                    }
                    arrayList.add(Integer.valueOf((int) d));
                    break;
                case 3:
                    arrayList.add(readableArray.getString(i));
                    break;
                case 4:
                    arrayList.add(toBundle(readableArray.getMap(i)));
                    break;
                case 5:
                    arrayList.add(toList(readableArray.getArray(i)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object in array.");
            }
        }
        return arrayList;
    }
}
