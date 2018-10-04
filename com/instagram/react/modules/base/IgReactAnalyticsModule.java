package com.instagram.react.modules.base;

import X.AnonymousClass0NN;
import X.AnonymousClass0db;
import X.AnonymousClass0lA;
import com.facebook.fbreact.specs.NativeAnalyticsSpec;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "Analytics")
public class IgReactAnalyticsModule extends NativeAnalyticsSpec {
    public static final String MODULE_NAME = "Analytics";

    public String getName() {
        return MODULE_NAME;
    }

    public void logCounter(String str, double d) {
    }

    public IgReactAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass0NN getAnalyticsEvent(java.lang.String r2, java.lang.String r3) {
        /*
        r1 = this;
        r0 = r2.hashCode();
        switch(r0) {
            case -1581452433: goto L_0x004e;
            case 656693737: goto L_0x0044;
            case 963638032: goto L_0x003a;
            case 1229418656: goto L_0x0030;
            case 1326426600: goto L_0x0026;
            case 1491939820: goto L_0x001c;
            case 1514698072: goto L_0x0012;
            case 1671672458: goto L_0x0008;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x0058;
    L_0x0008:
        r0 = "dismiss";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0058;
    L_0x0010:
        r0 = 1;
        goto L_0x0059;
    L_0x0012:
        r0 = "next_tapped";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0058;
    L_0x001a:
        r0 = 3;
        goto L_0x0059;
    L_0x001c:
        r0 = "step_view_loaded";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0058;
    L_0x0024:
        r0 = 0;
        goto L_0x0059;
    L_0x0026:
        r0 = "resend_blocked";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0058;
    L_0x002e:
        r0 = 4;
        goto L_0x0059;
    L_0x0030:
        r0 = "next_blocked";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0058;
    L_0x0038:
        r0 = 2;
        goto L_0x0059;
    L_0x003a:
        r0 = "resend_tapped";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0058;
    L_0x0042:
        r0 = 5;
        goto L_0x0059;
    L_0x0044:
        r0 = "this_wasnt_me";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0058;
    L_0x004c:
        r0 = 7;
        goto L_0x0059;
    L_0x004e:
        r0 = "this_was_me";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0058;
    L_0x0056:
        r0 = 6;
        goto L_0x0059;
    L_0x0058:
        r0 = -1;
    L_0x0059:
        switch(r0) {
            case 0: goto L_0x0097;
            case 1: goto L_0x0090;
            case 2: goto L_0x0089;
            case 3: goto L_0x0082;
            case 4: goto L_0x007b;
            case 5: goto L_0x0074;
            case 6: goto L_0x006d;
            case 7: goto L_0x0066;
            default: goto L_0x005c;
        };
    L_0x005c:
        r0 = new X.5sF;
        r0.<init>(r1, r3);
        r0 = X.AnonymousClass0NN.B(r2, r0);
        return r0;
    L_0x0066:
        r0 = X.AnonymousClass0Fr.CheckpointThisWasntMeTapped;
        r0 = r0.A();
        return r0;
    L_0x006d:
        r0 = X.AnonymousClass0Fr.CheckpointThisWasMeTapped;
        r0 = r0.A();
        return r0;
    L_0x0074:
        r0 = X.AnonymousClass0Fr.CheckpointResendTapped;
        r0 = r0.A();
        return r0;
    L_0x007b:
        r0 = X.AnonymousClass0Fr.CheckpointResendBlocked;
        r0 = r0.A();
        return r0;
    L_0x0082:
        r0 = X.AnonymousClass0Fr.CheckpointNextTapped;
        r0 = r0.A();
        return r0;
    L_0x0089:
        r0 = X.AnonymousClass0Fr.CheckpointNextBlocked;
        r0 = r0.A();
        return r0;
    L_0x0090:
        r0 = X.AnonymousClass0Fr.CheckpointDismiss;
        r0 = r0.A();
        return r0;
    L_0x0097:
        r0 = X.AnonymousClass0Fr.CheckpointScreenLoaded;
        r0 = r0.A();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.base.IgReactAnalyticsModule.getAnalyticsEvent(java.lang.String, java.lang.String):X.0NN");
    }

    public void logEvent(String str, ReadableMap readableMap, String str2) {
        AnonymousClass0NN analyticsEvent = getAnalyticsEvent(str, str2);
        setDataAsExtra(analyticsEvent, readableMap);
        analyticsEvent.R();
    }

    public void logRealtimeEvent(String str, ReadableMap readableMap, String str2) {
        AnonymousClass0NN analyticsEvent = getAnalyticsEvent(str, str2);
        setDataAsExtra(analyticsEvent, readableMap);
        analyticsEvent.S();
    }

    private static AnonymousClass0lA obtainExtraArray(ReadableArray readableArray) {
        AnonymousClass0lA B = AnonymousClass0lA.B();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i).ordinal()) {
                case 0:
                    B.C("null");
                    break;
                case 1:
                    B.D(readableArray.getBoolean(i));
                    break;
                case 2:
                    B.f9444B.add(Double.valueOf(readableArray.getDouble(i)));
                    break;
                case 3:
                    B.C(readableArray.getString(i));
                    break;
                case 4:
                    B.B(obtainExtraBundle(readableArray.getMap(i)));
                    break;
                case 5:
                    B.f9444B.add(obtainExtraArray(readableArray.getArray(i)));
                    B.f9445C = true;
                    break;
                default:
                    throw new JSApplicationCausedNativeException("Unknown data type");
            }
        }
        return B;
    }

    private static AnonymousClass0db obtainExtraBundle(ReadableMap readableMap) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        AnonymousClass0db C = AnonymousClass0db.C();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey).ordinal()) {
                case 0:
                    C.G(nextKey, "null");
                    break;
                case 1:
                    C.I(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 2:
                    C.B(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 3:
                    C.G(nextKey, readableMap.getString(nextKey));
                    break;
                case 4:
                    C.E(nextKey, obtainExtraBundle(readableMap.getMap(nextKey)));
                    break;
                case 5:
                    C.F(nextKey, obtainExtraArray(readableMap.getArray(nextKey)));
                    break;
                default:
                    throw new JSApplicationCausedNativeException("Unknown data type");
            }
        }
        return C;
    }

    private static void setDataAsExtra(AnonymousClass0NN anonymousClass0NN, ReadableMap readableMap) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey).ordinal()) {
                case 0:
                    anonymousClass0NN.F(nextKey, "null");
                    break;
                case 1:
                    anonymousClass0NN.H(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 2:
                    anonymousClass0NN.A(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 3:
                    anonymousClass0NN.F(nextKey, readableMap.getString(nextKey));
                    break;
                case 4:
                    anonymousClass0NN.D(nextKey, obtainExtraBundle(readableMap.getMap(nextKey)));
                    break;
                case 5:
                    anonymousClass0NN.E(nextKey, obtainExtraArray(readableMap.getArray(nextKey)));
                    break;
                default:
                    throw new JSApplicationCausedNativeException("Unknown data type");
            }
        }
    }
}
