package com.instagram.react.modules.base;

import X.AnonymousClass0dy;
import X.AnonymousClass0dz;
import X.AnonymousClass0e1;
import X.AnonymousClass168;
import X.AnonymousClass16F;
import X.AnonymousClass16G;
import com.facebook.fbreact.specs.NativeAnalyticsFunnelLoggerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "AnalyticsFunnelLogger")
public class IgReactFunnelLoggerModule extends NativeAnalyticsFunnelLoggerSpec {
    public static final String MODULE_NAME = "AnalyticsFunnelLogger";
    private static final String PREFIX = "IG_ANDROID_";
    private AnonymousClass0dz mFunnelLogger = AnonymousClass0dy.B().f7558B;

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactFunnelLoggerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void addActionToFunnel(String str, double d, String str2, String str3, ReadableMap readableMap) {
        if (str.equals("IG_SETTINGS_FUNNEL")) {
            AnonymousClass0e1 C = AnonymousClass168.C(str);
            if (C != null) {
                this.mFunnelLogger.D(C, str2);
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PREFIX);
        stringBuilder.append(str);
        str = AnonymousClass168.C(stringBuilder.toString());
        if (str == null) {
            return;
        }
        if (str3 != null) {
            addActionToFunnelWithTag(str, (double) ((int) d), str2, str3);
        } else {
            this.mFunnelLogger.C(str, (long) ((int) d), str2);
        }
    }

    private void addActionToFunnelWithTag(AnonymousClass0e1 anonymousClass0e1, double d, String str, String str2) {
        this.mFunnelLogger.E(anonymousClass0e1, (long) ((int) d), str, str2);
    }

    public void addFunnelTag(String str, double d, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PREFIX);
        stringBuilder.append(str);
        str = AnonymousClass168.C(stringBuilder.toString());
        if (str != null) {
            this.mFunnelLogger.A(str, (long) ((int) d), str2);
        }
    }

    public void cancelFunnel(String str, double d) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PREFIX);
        stringBuilder.append(str);
        AnonymousClass0e1 C = AnonymousClass168.C(stringBuilder.toString());
        if (C != null) {
            AnonymousClass0dz anonymousClass0dz = this.mFunnelLogger;
            long j = (long) ((int) d);
            synchronized (anonymousClass0dz) {
                AnonymousClass0dz.J(C);
                AnonymousClass16G B = AnonymousClass16F.B();
                B.f14513E = C;
                anonymousClass0dz.f7560C.sendMessage(anonymousClass0dz.f7560C.obtainMessage(5, B.B(j).A()));
            }
        }
    }

    public void endFunnel(String str, double d) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PREFIX);
        stringBuilder.append(str);
        str = AnonymousClass168.C(stringBuilder.toString());
        if (str != null) {
            this.mFunnelLogger.J(str, (long) ((int) d));
        }
    }

    public void startFunnel(String str, double d) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PREFIX);
        stringBuilder.append(str);
        str = AnonymousClass168.C(stringBuilder.toString());
        if (str != null) {
            this.mFunnelLogger.L(str, (long) ((int) d));
        }
    }
}
