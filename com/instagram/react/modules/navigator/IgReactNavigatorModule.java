package com.instagram.react.modules.navigator;

import X.AnonymousClass0Cn;
import X.AnonymousClass0Dc;
import X.AnonymousClass0Il;
import X.AnonymousClass0In;
import X.AnonymousClass0Io;
import X.AnonymousClass0LH;
import X.AnonymousClass1Y6;
import X.AnonymousClass5sI;
import X.AnonymousClass5sJ;
import X.AnonymousClass5sK;
import X.AnonymousClass5sL;
import X.AnonymousClass5sM;
import X.AnonymousClass5sN;
import X.AnonymousClass5sO;
import X.AnonymousClass5sP;
import X.AnonymousClass5sQ;
import X.AnonymousClass5sR;
import X.AnonymousClass5sT;
import X.AnonymousClass5sV;
import X.AnonymousClass5sW;
import android.app.Activity;
import android.os.Bundle;
import com.facebook.C0164R;
import com.facebook.fbreact.specs.NativeNavigationSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "NativeNavigation", needsEagerInit = true)
public class IgReactNavigatorModule extends NativeNavigationSpec implements LifecycleEventListener {
    public static final String MODULE_NAME = "NativeNavigation";
    public static final String URL = "url";
    public boolean mIsHostResumed;
    private Map mRoutesMap;

    public void clearRightBarButton(double d) {
    }

    public String getName() {
        return MODULE_NAME;
    }

    public void onHostDestroy() {
    }

    public void reloadReact() {
    }

    public IgReactNavigatorModule(com.facebook.react.bridge.ReactApplicationContext r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.<init>(r4);
        r4.addLifecycleEventListener(r3);
        r2 = r3.getReactApplicationContext();	 Catch:{ IOException -> 0x001a }
        r1 = r2.getAssets();	 Catch:{ IOException -> 0x001a }
        r0 = "react_native_routes.json";	 Catch:{ IOException -> 0x001a }
        r0 = r1.open(r0);	 Catch:{ IOException -> 0x001a }
        r0 = X.AnonymousClass5sI.m28577B(r0, r2);	 Catch:{ IOException -> 0x001a }
        r3.mRoutesMap = r0;	 Catch:{ IOException -> 0x001a }
    L_0x001a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.navigator.IgReactNavigatorModule.<init>(com.facebook.react.bridge.ReactApplicationContext):void");
    }

    private static AnonymousClass0Io configureReactNativeLauncherWithRouteInfo(AnonymousClass0Io anonymousClass0Io, Bundle bundle, ReadableMap readableMap) {
        if (bundle != null) {
            AnonymousClass5sI.m28578C(bundle, readableMap);
            String string = bundle.getString(DialogModule.KEY_TITLE, null);
            boolean z = false;
            boolean z2 = bundle.getBoolean("logoAsTitle", false);
            if (string == null || !z2) {
                z = true;
            }
            AnonymousClass0LH.C(z, "Screen navigationOptions cannot have both 'title' and 'logoAsTitle'");
            anonymousClass0Io = anonymousClass0Io.LSA(string).KPA(z2);
            if (bundle.containsKey("orientation")) {
                anonymousClass0Io.IQA(bundle.getInt("orientation"));
            }
            if (bundle.containsKey("analyticsModule")) {
                anonymousClass0Io.ZMA(bundle.getString("analyticsModule"));
            }
            if (bundle.containsKey("perfLogger_ttiEventName")) {
                anonymousClass0Io.zRA(bundle.getString("perfLogger_ttiEventName"));
            }
            if (bundle.containsKey("fb_analyticsExtras")) {
                anonymousClass0Io.qPA(new AnonymousClass5sK(bundle, readableMap));
            }
        }
        return anonymousClass0Io;
    }

    private AnonymousClass0Io createReactNativeLauncherFromAppKey(AnonymousClass0Cn anonymousClass0Cn, String str, ReadableMap readableMap, ReadableMap readableMap2) {
        return configureReactNativeLauncherWithRouteInfo(AnonymousClass0Il.getInstance().newReactNativeLauncher(anonymousClass0Cn, str).kQA(Arguments.toBundle(readableMap)), Arguments.toBundle(readableMap2), readableMap);
    }

    private AnonymousClass0Io createReactNativeLauncherFromRouteName(AnonymousClass0Cn anonymousClass0Cn, String str, ReadableMap readableMap, ReadableMap readableMap2) {
        return configureReactNativeLauncherWithRouteInfo(AnonymousClass0Il.getInstance().newReactNativeLauncher(anonymousClass0Cn).KRA(str).kQA(Arguments.toBundle(readableMap)), Arguments.toBundle(readableMap2), readableMap);
    }

    private Map createRouteMapFromJson(String str) {
        try {
            return AnonymousClass5sI.m28577B(new ByteArrayInputStream(str.getBytes()), getReactApplicationContext());
        } catch (String str2) {
            AnonymousClass0Dc.S("ReactNative", str2, "Failed to create routes map.", new Object[0]);
            throw new RuntimeException(str2);
        }
    }

    public void dismiss(double d, ReadableMap readableMap) {
        UiThreadUtil.runOnUiThread(new AnonymousClass5sR(this));
    }

    public void getSavedInstanceState(double d, String str, Callback callback) {
        if (AnonymousClass0In.D(getCurrentActivity(), str) != null) {
            callback.invoke(new Object[]{Arguments.fromBundle(AnonymousClass0In.D(getCurrentActivity(), str).f19939B.I())});
            return;
        }
        callback.invoke(new Object[]{Integer.valueOf(0)});
    }

    public Map getTypedExportedConstants() {
        return new HashMap();
    }

    public void navigate(double d, String str, ReadableMap readableMap) {
        IgReactNavigatorModule igReactNavigatorModule = this;
        if (str.equals("IgExternalUrlRoute")) {
            openURL(readableMap);
        }
        Map map = this.mRoutesMap;
        if (map != null) {
            if (map.get(str) != null) {
                Activity B = AnonymousClass0In.B(getCurrentActivity());
                if (B != null) {
                    AnonymousClass0Io createReactNativeLauncherFromAppKey;
                    ReadableMap readableMap2 = null;
                    Bundle bundle = ((Bundle) this.mRoutesMap.get(str)).getBundle("navigationOptions");
                    if (bundle != null) {
                        readableMap2 = Arguments.fromBundle(bundle);
                    }
                    AnonymousClass0Cn E = AnonymousClass0In.E(B);
                    if (((Bundle) this.mRoutesMap.get(str)).containsKey("isFromRegistry")) {
                        createReactNativeLauncherFromAppKey = createReactNativeLauncherFromAppKey(E, str, readableMap, readableMap2);
                    } else {
                        createReactNativeLauncherFromAppKey = createReactNativeLauncherFromRouteName(E, str, readableMap, readableMap2);
                    }
                    UiThreadUtil.runOnUiThread(new AnonymousClass5sO(igReactNavigatorModule, createReactNativeLauncherFromAppKey, B, d));
                }
            }
        }
    }

    public void onHostPause() {
        this.mIsHostResumed = false;
    }

    public void onHostResume() {
        this.mIsHostResumed = true;
    }

    public void openURL(double d, String str) {
        UiThreadUtil.runOnUiThread(new AnonymousClass5sL(this, str));
    }

    private void openURL(ReadableMap readableMap) {
        String string = readableMap.getString(URL);
        AnonymousClass0LH.E(string);
        UiThreadUtil.runOnUiThread(new AnonymousClass5sN(this, string, new AnonymousClass5sM(this, readableMap)));
    }

    public void pop(double d) {
        UiThreadUtil.runOnUiThread(new AnonymousClass5sQ(this));
    }

    public void popToScreen(double d, double d2) {
        UiThreadUtil.runOnUiThread(new AnonymousClass5sP(this, d2));
    }

    private static int resourceForActionType(String str) {
        if (str.equals(AnonymousClass5sW.DONE.f69544B)) {
            return C0164R.drawable.check;
        }
        if (str.equals(AnonymousClass5sW.NEXT.f69544B)) {
            return C0164R.drawable.nav_arrow_next;
        }
        if (str.equals(AnonymousClass5sW.RELOAD.f69544B)) {
            return C0164R.drawable.nav_refresh;
        }
        if (str.equals(AnonymousClass5sW.CANCEL.f69544B)) {
            return C0164R.drawable.instagram_x_outline_24;
        }
        if (str.equals(AnonymousClass5sW.BACK.f69544B)) {
            return C0164R.drawable.instagram_arrow_back_24;
        }
        if (str.equals(AnonymousClass5sW.MORE.f69544B)) {
            return C0164R.drawable.instagram_more_vertical_outline_24;
        }
        if (str.equals(AnonymousClass5sW.DIRECT.f69544B)) {
            return C0164R.drawable.instagram_direct_outline_24;
        }
        if (!str.equals(AnonymousClass5sW.LOADING.f69544B)) {
            if (!str.equals(AnonymousClass5sW.NONE.f69544B)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported ActionType: ");
                stringBuilder.append(str);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        return 0;
    }

    public void setBarLeftAction(double d, ReadableMap readableMap) {
        if (readableMap.hasKey("icon")) {
            String string = readableMap.getString("icon");
            UiThreadUtil.runOnUiThread(new AnonymousClass5sT(this, d, string, resourceForActionType(string)));
        }
    }

    public void setBarPrimaryAction(double d, ReadableMap readableMap) {
        ReadableMap readableMap2 = readableMap;
        String str = null;
        String string = readableMap.hasKey(DialogModule.KEY_TITLE) ? readableMap.getString(DialogModule.KEY_TITLE) : null;
        if (readableMap.hasKey("icon")) {
            str = readableMap.getString("icon");
        }
        UiThreadUtil.runOnUiThread(new AnonymousClass5sV(this, d, string, str, readableMap2, str != null ? resourceForActionType(str) : 0));
    }

    public void setBarTitle(double d, String str) {
        UiThreadUtil.runOnUiThread(new AnonymousClass5sJ(this, d, str));
    }

    public void setInstanceStateToSave(double d, String str, ReadableMap readableMap) {
        d = Arguments.toBundle(readableMap);
        AnonymousClass1Y6 D = AnonymousClass0In.D(getCurrentActivity(), str);
        if (D != null) {
            D.f19939B.R(d);
        }
    }

    public void updateNativeRoutesConfiguration(String str) {
        this.mRoutesMap = createRouteMapFromJson(str);
    }
}
