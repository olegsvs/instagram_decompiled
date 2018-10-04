package X;

import android.util.Pair;
import com.fasterxml.jackson.core.JsonGenerator;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.TimeZone;

/* renamed from: X.18G */
public final class AnonymousClass18G {
    /* renamed from: B */
    public static String m9544B(String str, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return AnonymousClass18G.m9551I(((Long) obj).longValue());
        }
        StringBuilder stringBuilder;
        if (obj instanceof AnonymousClass0db) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("{\n");
            AnonymousClass0db anonymousClass0db = (AnonymousClass0db) obj;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            stringBuilder2.append(anonymousClass0db.m6079L(stringBuilder.toString()));
            stringBuilder2.append(str);
            stringBuilder2.append("}");
            return stringBuilder2.toString();
        } else if (!(obj instanceof AnonymousClass0lA)) {
            return obj.toString();
        } else {
            AnonymousClass0lA anonymousClass0lA = (AnonymousClass0lA) obj;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            return anonymousClass0lA.m7241E(stringBuilder.toString());
        }
    }

    /* renamed from: C */
    public static AnonymousClass0lA m9545C(ArrayList arrayList) {
        AnonymousClass0lA B = AnonymousClass0lA.m7236B();
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof String) {
                B.m7239C((String) obj);
            } else if (obj instanceof Integer) {
                B.m7237A(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                B.f9444B.add(Double.valueOf(((Double) obj).doubleValue()));
            } else if (obj instanceof Long) {
                B.f9444B.add(Long.valueOf(((Long) obj).longValue()));
            } else if (obj instanceof Boolean) {
                B.m7240D(((Boolean) obj).booleanValue());
            } else if (obj instanceof ArrayList) {
                B.f9444B.add(AnonymousClass18G.m9545C((ArrayList) obj));
                B.f9445C = true;
            } else if (obj instanceof HashMap) {
                B.m7238B(AnonymousClass18G.m9547E((HashMap) obj));
            }
        }
        return B;
    }

    /* renamed from: D */
    public static HashMap m9546D(AnonymousClass0db anonymousClass0db) {
        HashMap hashMap = new HashMap();
        Iterator anonymousClass23R = new AnonymousClass23R(anonymousClass0db);
        while (anonymousClass23R.hasNext()) {
            Pair pair = (Pair) anonymousClass23R.next();
            if (pair.second instanceof String) {
                hashMap.put(pair.first, (String) pair.second);
            } else if (pair.second instanceof Integer) {
                hashMap.put(pair.first, Integer.toString(((Integer) pair.second).intValue()));
            } else if (pair.second instanceof Double) {
                hashMap.put(pair.first, Double.toString(((Double) pair.second).doubleValue()));
            } else if (pair.second instanceof Long) {
                hashMap.put(pair.first, Long.toString(((Long) pair.second).longValue()));
            } else if (pair.second instanceof Boolean) {
                hashMap.put(pair.first, Boolean.toString(((Boolean) pair.second).booleanValue()));
            }
        }
        return hashMap;
    }

    /* renamed from: E */
    public static AnonymousClass0db m9547E(HashMap hashMap) {
        AnonymousClass0db C = AnonymousClass0db.m6067C();
        for (Object next : hashMap.entrySet()) {
            Object next2;
            if (next2 instanceof Entry) {
                Entry entry = (Entry) next2;
                if (entry.getKey() instanceof String) {
                    String str = (String) entry.getKey();
                    next2 = entry.getValue();
                    if (next2 instanceof String) {
                        C.m6074G(str, (String) next2);
                    } else if (next2 instanceof Integer) {
                        C.m6070C(str, ((Integer) next2).intValue());
                    } else if (next2 instanceof Double) {
                        C.m6069B(str, ((Double) next2).doubleValue());
                    } else if (next2 instanceof Long) {
                        C.m6071D(str, ((Long) next2).longValue());
                    } else if (next2 instanceof Boolean) {
                        C.m6076I(str, ((Boolean) next2).booleanValue());
                    } else if (next2 instanceof ArrayList) {
                        C.m6073F(str, AnonymousClass18G.m9545C((ArrayList) next2));
                    } else if (next2 instanceof HashMap) {
                        C.m6072E(str, AnonymousClass18G.m9547E((HashMap) next2));
                    }
                }
            }
        }
        return C;
    }

    /* renamed from: F */
    public static void m9548F(Object obj) {
        if (obj != null) {
            if (obj instanceof AnonymousClass0db) {
                AnonymousClass0db anonymousClass0db = (AnonymousClass0db) obj;
                if (anonymousClass0db.f7472C) {
                    AnonymousClass0Dc.m1239B(AnonymousClass0db.f7469F, "Recycled ExtraBundle which is already in the pool.");
                }
                anonymousClass0db.m6068A();
                AnonymousClass0db.f7468E.m3260B(anonymousClass0db);
                anonymousClass0db.f7472C = true;
            } else if (obj instanceof AnonymousClass0lA) {
                AnonymousClass0lA anonymousClass0lA = (AnonymousClass0lA) obj;
                if (anonymousClass0lA.f9446D) {
                    AnonymousClass0Dc.m1239B(AnonymousClass0lA.f9443F, "Recycled ExtraJsonArray which is already in the pool.");
                }
                if (anonymousClass0lA.f9445C) {
                    for (int i = 0; i < anonymousClass0lA.f9444B.size(); i++) {
                        AnonymousClass18G.m9548F(anonymousClass0lA.f9444B.get(i));
                    }
                    anonymousClass0lA.f9445C = false;
                }
                if (anonymousClass0lA.f9444B.size() > 32) {
                    anonymousClass0lA.f9444B = new ArrayList(32);
                } else {
                    anonymousClass0lA.f9444B.clear();
                }
                AnonymousClass0lA.f9442E.m3260B(anonymousClass0lA);
                anonymousClass0lA.f9446D = true;
            }
        }
    }

    /* renamed from: G */
    public static void m9549G(AnalyticsEventDebugInfo analyticsEventDebugInfo, String str, Object obj) {
        if (obj instanceof AnonymousClass0NO) {
            analyticsEventDebugInfo.A(new AnalyticsEventEntry(str, ((AnonymousClass0NO) obj).ZVA()));
        } else {
            analyticsEventDebugInfo.A(new AnalyticsEventEntry(str, String.valueOf(obj)));
        }
    }

    /* renamed from: H */
    public static void m9550H(JsonGenerator jsonGenerator, Object obj) {
        if (obj == null) {
            jsonGenerator.writeString((String) null);
        } else if (obj instanceof String) {
            jsonGenerator.writeString((String) obj);
        } else if (obj instanceof Long) {
            jsonGenerator.writeNumber(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            jsonGenerator.writeNumber(((Integer) obj).intValue());
        } else if (obj instanceof Double) {
            jsonGenerator.writeNumber(((Double) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            jsonGenerator.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof AnonymousClass0db) {
            ((AnonymousClass0db) obj).m6080M(jsonGenerator);
        } else if (obj instanceof AnonymousClass0lA) {
            AnonymousClass0lA anonymousClass0lA = (AnonymousClass0lA) obj;
            jsonGenerator.writeStartArray();
            for (int i = 0; i < anonymousClass0lA.f9444B.size(); i++) {
                AnonymousClass18G.m9550H(jsonGenerator, anonymousClass0lA.f9444B.get(i));
            }
            jsonGenerator.writeEndArray();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown value type: ");
            stringBuilder.append(obj.getClass());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: I */
    private static String m9551I(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (j <= currentTimeMillis - 315360000000L || j >= currentTimeMillis + 315360000000L) {
            return Long.toString(j);
        }
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Long.toString(j));
        stringBuilder.append(" (");
        stringBuilder.append(simpleDateFormat.format(new Date(j)));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
