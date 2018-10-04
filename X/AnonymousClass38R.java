package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.38R */
public final class AnonymousClass38R {
    /* renamed from: B */
    public static SharedPreferences f38228B;

    /* renamed from: B */
    public static int m18721B(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        int i3 = 1;
        if (i != 2) {
            if (i != 1) {
                return -1;
            }
            if (i2 == 2) {
                i3 = -1;
            }
        }
        return i3;
    }

    /* renamed from: C */
    public static AnonymousClass38Q m18722C(Map map) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (intValue == 1) {
                    arrayList.add(str);
                } else if (intValue == 2) {
                    arrayList2.add(str);
                }
            }
        }
        return new AnonymousClass38Q(arrayList, arrayList2);
    }

    /* renamed from: D */
    public static Map m18723D(Context context, String str) {
        Map hashMap = new HashMap();
        String E = AnonymousClass38R.m18724E(context, str);
        return E != null ? AnonymousClass38R.m18728I(E) : hashMap;
    }

    /* renamed from: E */
    public static String m18724E(Context context, String str) {
        if (str != null) {
            str = StringFormatUtil.formatStrLocaleSafe("%sFaceEffectBadgeStateMap", str);
            if (str != null) {
                context = f38228B;
                if (context != null) {
                    return context.getString(str, new JSONObject().toString());
                }
            }
        }
        return null;
    }

    /* renamed from: F */
    public static int m18725F(AnonymousClass0Cm anonymousClass0Cm) {
        anonymousClass0Cm = StringFormatUtil.formatStrLocaleSafe("%sPortraitNuxCount", anonymousClass0Cm.f1759C);
        SharedPreferences sharedPreferences = f38228B;
        return sharedPreferences != null ? sharedPreferences.getInt(anonymousClass0Cm, 0) : 0;
    }

    /* renamed from: G */
    public static void m18726G(Context context) {
        if (f38228B == null) {
            f38228B = context.getApplicationContext().getSharedPreferences("FaceEffectPreferences", 0);
        }
    }

    /* renamed from: H */
    public static Map m18727H(Map map, Map map2) {
        if (map != null && map2 != null) {
            for (Entry entry : map2.entrySet()) {
                if (AnonymousClass38R.m18732M(map, (String) entry.getKey(), ((Integer) entry.getValue()).intValue())) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        } else if (map == null || map2 != null) {
            if (map2 == null || map != null) {
                return new HashMap();
            }
            return map2;
        }
        return map;
    }

    /* renamed from: I */
    public static Map m18728I(String str) {
        Map hashMap = new HashMap();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    hashMap.put(str2, Integer.valueOf(((Integer) jSONObject.get(str2)).intValue()));
                }
            } catch (JSONException e) {
                e.getMessage();
            }
        }
        return hashMap;
    }

    /* renamed from: J */
    public static Map m18729J(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        if (anonymousClass0Cm != null) {
            String str = anonymousClass0Cm.f1759C;
            if (str != null) {
                return AnonymousClass38R.m18723D(context, str);
            }
        }
        return Collections.emptyMap();
    }

    /* renamed from: K */
    public static void m18730K(Context context, AnonymousClass0Cm anonymousClass0Cm, Map map, List list, boolean z) {
        anonymousClass0Cm = StringFormatUtil.formatStrLocaleSafe("%sFaceEffectBadgeStateMap", anonymousClass0Cm.f1759C);
        if (anonymousClass0Cm != null) {
            context = AnonymousClass38R.m18731L(map, list);
            if (f38228B == null) {
                return;
            }
            if (z || context != null) {
                f38228B.edit().remove(anonymousClass0Cm).putString(anonymousClass0Cm, new JSONObject(map).toString()).apply();
            }
        }
    }

    /* renamed from: L */
    public static boolean m18731L(Map map, List list) {
        boolean z = false;
        if (list != null) {
            if (!list.isEmpty()) {
                for (AnonymousClass36h anonymousClass36h : list) {
                    if (!anonymousClass36h.f37888R) {
                        if (!anonymousClass36h.m18537C()) {
                            String str = anonymousClass36h.f37882L;
                            int i = anonymousClass36h.f37876F;
                            if (AnonymousClass38R.m18732M(map, str, i)) {
                                map.put(str, Integer.valueOf(i));
                                if (!z) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: M */
    private static boolean m18732M(Map map, String str, int i) {
        boolean containsKey = map.containsKey(str);
        Integer num = containsKey ? (Integer) map.get(str) : null;
        if (containsKey) {
            if (num == null || AnonymousClass38R.m18721B(num.intValue(), i) >= 0) {
                return false;
            }
        }
        return true;
    }
}
