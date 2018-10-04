package X;

import com.facebook.fbuploader.fbmediauploader.serialization.JsonField;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2Qy */
public final class AnonymousClass2Qy implements AnonymousClass1uc {
    /* renamed from: B */
    public static final String f30389B = "AndroidJSONSerializer";

    /* renamed from: B */
    public static AnonymousClass1ub m15708B(Type type) {
        if (type != Integer.TYPE) {
            if (type != Integer.class) {
                if (type != Long.TYPE) {
                    if (type != Long.class) {
                        if (type != Boolean.TYPE) {
                            if (type != Boolean.class) {
                                if (type != Double.TYPE) {
                                    if (type != Double.class) {
                                        if (type != Float.TYPE) {
                                            if (type != Float.class) {
                                                if (type == String.class) {
                                                    return AnonymousClass1ub.STRING;
                                                }
                                                return AnonymousClass1ub.USER_DEFINED_TYPE;
                                            }
                                        }
                                        return AnonymousClass1ub.FLOAT;
                                    }
                                }
                                return AnonymousClass1ub.DOUBLE;
                            }
                        }
                        return AnonymousClass1ub.BOOLEAN;
                    }
                }
                return AnonymousClass1ub.LONG;
            }
        }
        return AnonymousClass1ub.INT;
    }

    /* renamed from: C */
    public static Object m15709C(AnonymousClass2Qy anonymousClass2Qy, Field field, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(AnonymousClass2Qy.m15710D(field));
        return optJSONObject != null ? AnonymousClass2Qy.m15711E(anonymousClass2Qy, optJSONObject, field.getType()) : null;
    }

    /* renamed from: D */
    public static String m15710D(Field field) {
        JsonField jsonField = (JsonField) field.getAnnotation(JsonField.class);
        if (jsonField != null) {
            return jsonField.name();
        }
        AnonymousClass1uX.m13674B(f30389B, null, "JsonField annotation not present on %s method in class %s", field.getName(), field.getDeclaringClass().getName());
        return field.getName();
    }

    /* renamed from: E */
    public static Object m15711E(AnonymousClass2Qy anonymousClass2Qy, JSONObject jSONObject, Class cls) {
        try {
            Object newInstance = cls.newInstance();
            for (Field field : newInstance.getClass().getDeclaredFields()) {
                if (!Modifier.isFinal(field.getModifiers())) {
                    Object arrayList;
                    field.setAccessible(true);
                    String D = AnonymousClass2Qy.m15710D(field);
                    AnonymousClass2Qy anonymousClass2Qy2 = anonymousClass2Qy;
                    JSONObject jSONObject2 = jSONObject;
                    if (field.getGenericType() instanceof ParameterizedType) {
                        Type type = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
                        AnonymousClass1ub B = AnonymousClass2Qy.m15708B(type);
                        JSONArray optJSONArray = jSONObject2.optJSONArray(D);
                        if (optJSONArray != null) {
                            arrayList = new ArrayList();
                            int i;
                            if (B != AnonymousClass1ub.USER_DEFINED_TYPE) {
                                for (i = 0; i < optJSONArray.length(); i++) {
                                    try {
                                        arrayList.add(((Class) type).cast(optJSONArray.get(i)));
                                    } catch (Throwable e) {
                                        AnonymousClass1uX.m13674B(f30389B, e, "Cannot index into JSONArray", new Object[0]);
                                    }
                                }
                            } else {
                                Class cls2 = (Class) type;
                                for (i = 0; i < optJSONArray.length(); i++) {
                                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                    if (optJSONObject != null) {
                                        arrayList.add(AnonymousClass2Qy.m15711E(anonymousClass2Qy2, optJSONObject, cls2));
                                    } else {
                                        AnonymousClass1uX.m13674B(f30389B, new IllegalStateException("JSONArray has a null JSONObject"), "Error while parsing JSONArray %s", optJSONArray);
                                    }
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = AnonymousClass2Qy.m15708B(field.getType()) != AnonymousClass1ub.USER_DEFINED_TYPE ? jSONObject2.opt(AnonymousClass2Qy.m15710D(field)) : AnonymousClass2Qy.m15709C(anonymousClass2Qy2, field, jSONObject2);
                    }
                    try {
                        field.set(newInstance, arrayList);
                    } catch (Throwable e2) {
                        AnonymousClass1uX.m13674B(f30389B, e2, "Unable to setValue %s to field %s on object %s", arrayList, field, newInstance);
                    }
                }
            }
            return newInstance;
        } catch (Throwable e22) {
            AnonymousClass1uX.m13674B(f30389B, e22, "Cannot invoke default constructor of %s; constructor threw", cls.getSimpleName());
            return null;
        } catch (Throwable e222) {
            AnonymousClass1uX.m13674B(f30389B, e222, "Cannot invoke default constructor of %s possibly; non-existent", cls.getSimpleName());
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: F */
    private static org.json.JSONObject m15712F(X.AnonymousClass2Qy r12, java.lang.Object r13) {
        /*
        r8 = new org.json.JSONObject;
        r8.<init>();
        r0 = r13.getClass();
        r7 = r0.getDeclaredFields();
        r6 = r7.length;
        r11 = 0;
        r5 = 0;
    L_0x0010:
        if (r5 >= r6) goto L_0x0055;
    L_0x0012:
        r10 = r7[r5];
        r0 = r10.getModifiers();
        r0 = java.lang.reflect.Modifier.isFinal(r0);
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0052;
    L_0x001f:
        r9 = 1;
        r10.setAccessible(r9);
        r0 = X.AnonymousClass2Qy.m15710D(r10);
        r4 = 0;
        r4 = r12.m15713G(r10, r13);	 Catch:{ IllegalAccessException -> 0x003f, JSONException -> 0x0032 }
        r8.put(r0, r4);	 Catch:{ IllegalAccessException -> 0x003f, JSONException -> 0x0030 }
        goto L_0x0052;
    L_0x0030:
        r3 = move-exception;
        goto L_0x0033;
    L_0x0032:
        r3 = move-exception;
    L_0x0033:
        r2 = f30389B;
        r1 = "Error creating JSONObject from %s";
        r0 = new java.lang.Object[r9];
        r0[r11] = r4;
        X.AnonymousClass1uX.m13674B(r2, r3, r1, r0);
        goto L_0x0052;
    L_0x003f:
        r4 = move-exception;
        r3 = f30389B;
        r2 = "Get failed from field %s, Object %s";
        r0 = 2;
        r1 = new java.lang.Object[r0];
        r0 = X.AnonymousClass2Qy.m15710D(r10);
        r1[r11] = r0;
        r1[r9] = r13;
        X.AnonymousClass1uX.m13674B(r3, r4, r2, r1);
    L_0x0052:
        r5 = r5 + 1;
        goto L_0x0010;
    L_0x0055:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2Qy.F(X.2Qy, java.lang.Object):org.json.JSONObject");
    }

    /* renamed from: G */
    private Object m15713G(Field field, Object obj) {
        Type type = field.getType();
        if (field.getGenericType() instanceof ParameterizedType) {
            int i = 0;
            AnonymousClass1ub B = AnonymousClass2Qy.m15708B(((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0]);
            JSONArray jSONArray = new JSONArray();
            List list;
            if (B != AnonymousClass1ub.USER_DEFINED_TYPE) {
                list = (List) field.get(obj);
                while (i < list.size()) {
                    jSONArray.put(list.get(i));
                    i++;
                }
            } else {
                list = (List) field.get(obj);
                while (i < list.size()) {
                    jSONArray.put(AnonymousClass2Qy.m15712F(this, list.get(i)));
                    i++;
                }
            }
            return jSONArray;
        } else if (AnonymousClass2Qy.m15708B(type) != AnonymousClass1ub.USER_DEFINED_TYPE) {
            return field.get(obj);
        } else {
            return field.get(obj) != null ? AnonymousClass2Qy.m15712F(this, field.get(obj)) : null;
        }
    }

    public final String MMA(Object obj) {
        if (obj == null) {
            return null;
        }
        return AnonymousClass2Qy.m15712F(new AnonymousClass2Qy(), obj).toString();
    }

    public final Object RG(String str, Class cls) {
        Object obj;
        if (str != null) {
            if (!str.isEmpty()) {
                obj = null;
                if (obj == null) {
                    return null;
                }
                try {
                    return AnonymousClass2Qy.m15711E(new AnonymousClass2Qy(), new JSONObject(str), cls);
                } catch (Throwable e) {
                    AnonymousClass1uX.m13674B(f30389B, e, "Not a valid JSON string %s", str);
                    return null;
                }
            }
        }
        obj = 1;
        if (obj == null) {
            return AnonymousClass2Qy.m15711E(new AnonymousClass2Qy(), new JSONObject(str), cls);
        }
        return null;
    }
}
