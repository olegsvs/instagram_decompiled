package com.facebook.quicklog;

import X.AnonymousClass0K2;
import X.AnonymousClass0KD;
import X.AnonymousClass0KI;
import X.AnonymousClass0KJ;
import X.AnonymousClass0KM;
import X.AnonymousClass0KQ;
import X.AnonymousClass0KR;
import X.AnonymousClass0NN;
import X.AnonymousClass0db;
import X.AnonymousClass0lA;
import X.AnonymousClass1Cc;
import X.AnonymousClass1Ij;
import X.AnonymousClass1Il;
import X.AnonymousClass1wW;
import android.util.SparseArray;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

public class PerformanceLoggingEvent implements Runnable, AnonymousClass0KI {
    /* renamed from: a */
    public static final AnonymousClass0KJ f3002a = new AnonymousClass1Ij(StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS);
    /* renamed from: b */
    public static int f3003b = 255;
    /* renamed from: c */
    public static int f3004c = 24;
    /* renamed from: B */
    public short f3005B;
    /* renamed from: C */
    public boolean f3006C;
    /* renamed from: D */
    public SparseArray f3007D;
    /* renamed from: E */
    public SparseArray f3008E;
    /* renamed from: F */
    public int f3009F;
    /* renamed from: G */
    public int f3010G;
    /* renamed from: H */
    public long f3011H;
    /* renamed from: I */
    public AnonymousClass0K2 f3012I;
    /* renamed from: J */
    public ArrayList f3013J = new ArrayList();
    /* renamed from: K */
    public ArrayList f3014K = new ArrayList();
    /* renamed from: L */
    public int f3015L;
    /* renamed from: M */
    public boolean f3016M;
    /* renamed from: N */
    public boolean f3017N;
    /* renamed from: O */
    public String f3018O;
    /* renamed from: P */
    public AnonymousClass1wW f3019P;
    /* renamed from: Q */
    public long f3020Q;
    /* renamed from: R */
    public PerformanceLoggingEvent f3021R;
    /* renamed from: S */
    public AnonymousClass0KD f3022S;
    /* renamed from: T */
    public AnonymousClass0KM f3023T;
    /* renamed from: U */
    public short f3024U;
    /* renamed from: V */
    public int f3025V;
    /* renamed from: W */
    public int f3026W;
    /* renamed from: X */
    public ArrayList f3027X = new ArrayList();
    /* renamed from: Y */
    public int f3028Y;
    /* renamed from: Z */
    public int f3029Z = ((f3003b & 1) << f3004c);

    public final void mBA() {
    }

    public PerformanceLoggingEvent() {
        clear();
    }

    /* renamed from: A */
    public final void m2806A(List list, List list2) {
        if (list != null) {
            this.f3013J.addAll(list);
            this.f3014K.addAll(list2);
        }
    }

    /* renamed from: B */
    public final String m2807B() {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = this.f3027X;
        int size = list.size();
        for (String append : list) {
            stringBuilder.append(append);
            if (size > 1) {
                stringBuilder.append(",");
            }
            size--;
        }
        return stringBuilder.toString();
    }

    /* renamed from: C */
    public final boolean m2808C(long j) {
        return (j & this.f3011H) != 0;
    }

    /* renamed from: D */
    public final void m2809D(int i) {
        int i2 = this.f3029Z & -16711681;
        this.f3029Z = i2;
        this.f3029Z = ((i & 255) << 16) | i2;
    }

    /* renamed from: E */
    public final void m2810E(String str) {
        if (this.f3019P == null) {
            this.f3019P = new AnonymousClass1wW();
        }
        AnonymousClass1wW anonymousClass1wW = this.f3019P;
        int size = anonymousClass1wW.f24519C.size() - 1;
        if (size < 0 || anonymousClass1wW.f24519C.get(size) == null) {
            anonymousClass1wW.f24519C.add(str);
        } else {
            anonymousClass1wW.f24519C.set(size, str);
        }
    }

    public final void clear() {
        this.f3028Y = 0;
        this.f3018O = null;
        this.f3025V = 0;
        this.f3013J.clear();
        this.f3014K.clear();
        this.f3027X.clear();
        this.f3023T = null;
        this.f3021R = null;
        this.f3022S = null;
        this.f3007D = null;
        this.f3008E = null;
        AnonymousClass1wW anonymousClass1wW = this.f3019P;
        if (anonymousClass1wW != null) {
            anonymousClass1wW.f24518B.clear();
            anonymousClass1wW.f24519C.clear();
        }
    }

    public short getActionId() {
        return this.f3005B;
    }

    public int getEventId() {
        return this.f3028Y;
    }

    public String getLegacyMarkerName() {
        return this.f3018O;
    }

    public final /* bridge */ /* synthetic */ Object hO() {
        return this.f3021R;
    }

    public final void run() {
        int i;
        StringBuilder stringBuilder;
        AnonymousClass0NN B = AnonymousClass0NN.m3291B("perf", null);
        AnonymousClass1Cc A = AnonymousClass0KR.f3046B.m2829A();
        this.f3012I.mo695A(this, A, null, null);
        for (int i2 = 0; i2 < A.f15531B; i2++) {
            B.m3298F(A.m9909G(i2), String.valueOf(A.m9910H(i2)));
        }
        B.m3294B("marker_id", getEventId());
        B.m3294B("instance_id", this.f3015L);
        B.m3294B("sample_rate", this.f3026W);
        B.m3295C("time_since_boot_ms", this.f3020Q);
        B.m3294B("duration_ms", this.f3009F);
        B.m3294B("action_id", getActionId());
        B.m3294B("duration_since_prev_action_ms", this.f3010G);
        B.m3294B("prev_action_id", this.f3024U);
        B.m3298F("method", AnonymousClass0KQ.m2820C(this.f3017N, this.f3016M));
        AnonymousClass0KM anonymousClass0KM = this.f3023T;
        if (anonymousClass0KM != null) {
            AnonymousClass0lA B2 = AnonymousClass0lA.m7236B();
            anonymousClass0KM.m2816A(new AnonymousClass1Il(B2));
            B.m3297E("points", B2);
        }
        Iterator it = this.f3013J.iterator();
        Iterator it2 = this.f3014K.iterator();
        SparseArray sparseArray = new SparseArray();
        while (it.hasNext()) {
            AnonymousClass0db C;
            AnonymousClass0lA B3;
            String str = (String) it.next();
            String str2 = (String) it.next();
            Integer num = (Integer) it2.next();
            if (sparseArray.indexOfKey(num.intValue()) < 0) {
                C = AnonymousClass0db.m6067C();
                sparseArray.put(num.intValue(), C);
                switch (num.intValue()) {
                    case 1:
                        B.m3296D("annotations", C);
                        break;
                    case 2:
                        B.m3296D("annotations_int", C);
                        break;
                    case 3:
                        B.m3296D("annotations_string_array", C);
                        break;
                    case 4:
                        B.m3296D("annotations_int_array", C);
                        break;
                    case 5:
                        B.m3296D("annotations_double", C);
                        break;
                    case 6:
                        B.m3296D("annotations_double_array", C);
                        break;
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        B.m3296D("annotations_bool", C);
                        break;
                    case 8:
                        B.m3296D("annotations_bool_array", C);
                        break;
                    default:
                        break;
                }
            }
            C = (AnonymousClass0db) sparseArray.get(num.intValue());
            switch (num.intValue()) {
                case 1:
                    C.m6074G(str, str2);
                    continue;
                case 2:
                    C.m6070C(str, Integer.parseInt(str2));
                    continue;
                case 3:
                    B3 = AnonymousClass0lA.m7236B();
                    for (String C2 : str2.split(",,,")) {
                        B3.m7239C(C2);
                    }
                    break;
                case 4:
                    B3 = AnonymousClass0lA.m7236B();
                    for (String str22 : str22.split(",,,")) {
                        if (!str22.isEmpty()) {
                            B3.f9444B.add(Long.valueOf(Long.parseLong(str22)));
                        }
                    }
                    break;
                case 5:
                    C.m6069B(str, Double.parseDouble(str22));
                    continue;
                case 6:
                    B3 = AnonymousClass0lA.m7236B();
                    for (String str222 : str222.split(",,,")) {
                        if (!str222.isEmpty()) {
                            B3.f9444B.add(Double.valueOf(Double.parseDouble(str222)));
                        }
                    }
                    break;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    C.m6076I(str, Boolean.parseBoolean(str222));
                    continue;
                case 8:
                    B3 = AnonymousClass0lA.m7236B();
                    for (String str2222 : str2222.split(",,,")) {
                        if (!str2222.isEmpty()) {
                            B3.m7240D(Boolean.valueOf(str2222).booleanValue());
                        }
                    }
                    break;
                default:
                    continue;
            }
            C.m6073F(str, B3);
        }
        B.m3298F("trace_tags", m2807B());
        B.m3298F("marker", AnonymousClass0KQ.m2819B(getActionId()));
        B.m3294B("value", this.f3009F);
        String str3 = null;
        if (this.f3025V != 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("markerStart called multiple times without end or cancel");
        } else {
            stringBuilder = null;
        }
        AnonymousClass0KM anonymousClass0KM2 = this.f3023T;
        if (anonymousClass0KM2 != null) {
            ArrayList arrayList = anonymousClass0KM2.f3039C;
            if (arrayList != null) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                Object obj = null;
                for (i = 0; i < size; i++) {
                    str2222 = (String) arrayList.get(i);
                    if (!str2222.equals(obj)) {
                        stringBuilder = AnonymousClass0KR.m2821B(stringBuilder);
                        stringBuilder.append("intermediatePoint called multiple times for the same key: ");
                        stringBuilder.append('<');
                        stringBuilder.append((String) arrayList.get(i));
                        stringBuilder.append('>');
                        obj = str2222;
                    }
                }
            }
        }
        if (stringBuilder != null) {
            str3 = stringBuilder.toString();
        }
        if (str3 != null) {
            B.m3298F("error", str3);
        }
        B.m3310R();
        f3002a.m2813C(this);
    }

    public final /* bridge */ /* synthetic */ void uPA(Object obj) {
        this.f3021R = (PerformanceLoggingEvent) obj;
    }
}
