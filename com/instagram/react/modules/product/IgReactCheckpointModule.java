package com.instagram.react.modules.product;

import X.AnonymousClass0Cn;
import X.AnonymousClass0EE;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Gs;
import X.AnonymousClass0HE;
import X.AnonymousClass0HF;
import X.AnonymousClass0IW;
import X.AnonymousClass0In;
import X.AnonymousClass0Iw;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Q6;
import X.AnonymousClass0Sb;
import X.AnonymousClass0i7;
import X.AnonymousClass0mR;
import X.AnonymousClass1BX;
import X.AnonymousClass1TQ;
import X.AnonymousClass2Na;
import X.AnonymousClass3Wk;
import X.AnonymousClass3a3;
import X.AnonymousClass5sf;
import X.AnonymousClass5sg;
import X.AnonymousClass5sh;
import X.AnonymousClass5si;
import X.AnonymousClass5sj;
import X.AnonymousClass5t8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeIGCheckpointReactModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ReactModule(name = "IGCheckpointReactModule")
public class IgReactCheckpointModule extends NativeIGCheckpointReactModuleSpec {
    private static final String ALERT_MESSAGE_KEY = "alert_message";
    private static final String ALERT_TITLE_KEY = "alert_title";
    private static final String BIG_BLUE_TOKEN = "bigBlueToken";
    private static final String GOOGLE_OAUTH_TOKEN = "googleOAuthToken";
    public static final String MODULE_NAME = "IGCheckpointReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public void logoutAllUsersWithReactTag(double d) {
    }

    public IgReactCheckpointModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void closeCheckpoint(double d) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.finish();
        }
        onCheckpointCompleted();
    }

    public static void closeCheckpointWithAlert(IgReactCheckpointModule igReactCheckpointModule, ReadableMap readableMap, int i) {
        Context currentActivity = igReactCheckpointModule.getCurrentActivity();
        if (readableMap.hasKey(ALERT_TITLE_KEY) && readableMap.hasKey(ALERT_MESSAGE_KEY) && currentActivity != null) {
            String string = readableMap.getString(ALERT_TITLE_KEY);
            CharSequence string2 = readableMap.getString(ALERT_MESSAGE_KEY);
            AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(currentActivity);
            anonymousClass0Sb.R(string);
            anonymousClass0Sb.I(string2);
            anonymousClass0Sb.O(17039370, new AnonymousClass5sh(igReactCheckpointModule, i));
            anonymousClass0Sb.C().show();
            return;
        }
        igReactCheckpointModule.closeCheckpoint((double) i);
    }

    public void continueChallengeWithData(ReadableMap readableMap, double d) {
        AnonymousClass1TQ.B(getReactApplicationContext(), new AnonymousClass5sg(this, readableMap, d, AnonymousClass0In.E(getCurrentActivity())));
    }

    private static Map convertParams(ReadableMap readableMap) {
        Map hashMap = new HashMap();
        putAll(hashMap, readableMap);
        return hashMap;
    }

    public void extractCountryCodeAndNumber(String str, Promise promise) {
        Context reactApplicationContext = getReactApplicationContext();
        String str2 = AnonymousClass3a3.E(reactApplicationContext).f28032B;
        String str3 = AnonymousClass3a3.E(reactApplicationContext).f28033C;
        String A = AnonymousClass3a3.E(reactApplicationContext).A();
        String str4 = JsonProperty.USE_DEFAULT_NAME;
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(str3)) {
                str4 = str.substring(str3.length());
            } else if (str.startsWith(A)) {
                str4 = str.substring(A.length());
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("country", str2);
        createMap.putString("countryCode", str3);
        createMap.putString("phoneNumber", str4);
        promise.resolve(createMap);
    }

    public void fetchBBT(Promise promise) {
        if (AnonymousClass0i7.B().E()) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString(BIG_BLUE_TOKEN, AnonymousClass0i7.B().C());
            promise.resolve(createMap);
            return;
        }
        promise.reject(new Throwable());
    }

    public void fetchFacebookToken(Promise promise) {
        AnonymousClass0EE C = AnonymousClass0In.C(getCurrentActivity());
        AnonymousClass0Cn E = AnonymousClass0In.E(getCurrentActivity());
        AnonymousClass0mR anonymousClass0mR = AnonymousClass0mR.DELTA_CHALLENGE;
        C.registerLifecycleListener(new AnonymousClass5t8(E, anonymousClass0mR, promise, C));
        new AnonymousClass3Wk(E, C, AnonymousClass2Na.CHALLENGE_CLEAR_LOGIN, C).A(anonymousClass0mR);
    }

    public void fetchGoogleOAuthToken(double d, Promise promise) {
        List<String> C = AnonymousClass1BX.C(getReactApplicationContext(), null, null);
        if (C.isEmpty()) {
            promise.reject(new Throwable());
            return;
        }
        WritableMap createMap = Arguments.createMap();
        d = GOOGLE_OAUTH_TOKEN;
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : C) {
            stringBuilder.append(append);
            stringBuilder.append(",");
        }
        createMap.putString(d, stringBuilder.toString());
        promise.resolve(createMap);
    }

    public void generateURIWithPreviewDataString(String str, Promise promise) {
        getReactApplicationContext();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("imagePreviewURI", null);
        if (!TextUtils.isEmpty(str)) {
            createMap.putString("imagePreviewURI", AnonymousClass0Gs.D(str));
        }
        promise.resolve(createMap);
    }

    private AnonymousClass0Iw getGenericCallback(Promise promise) {
        return new AnonymousClass5si(this, promise);
    }

    public void goToHomeScreen() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        AnonymousClass0IW.Q(intent, getReactApplicationContext());
    }

    private static void onCheckpointCompleted() {
        AnonymousClass0HE B = AnonymousClass0HF.B();
        if (B != null) {
            B.A();
        }
    }

    public void proceedAndUpdateChallengeWithParams(ReadableMap readableMap, ReadableMap readableMap2, double d, Promise promise) {
        AnonymousClass1TQ.C(getReactApplicationContext(), convertParams(readableMap), new AnonymousClass5sj(this, AnonymousClass0In.E(getCurrentActivity()), readableMap2, (int) d, promise));
    }

    public void proceedChallengeWithParams(ReadableMap readableMap, Promise promise) {
        AnonymousClass1TQ.C(getReactApplicationContext(), convertParams(readableMap), getGenericCallback(promise));
    }

    public static void putAll(Map map, ReadableMap readableMap) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (readableMap.getType(nextKey) == ReadableType.String) {
                map.put(nextKey, readableMap.getString(nextKey));
            }
        }
    }

    public void replayChallengeWithParams(ReadableMap readableMap, Promise promise) {
        Context reactApplicationContext = getReactApplicationContext();
        Map convertParams = convertParams(readableMap);
        AnonymousClass1TQ.D(reactApplicationContext, "challenge/replay/", AnonymousClass0Pu.f4247G, getGenericCallback(promise), convertParams, true, true);
    }

    public static void reportSoftError(AnonymousClass0Q6 anonymousClass0Q6) {
        if (anonymousClass0Q6.A()) {
            AnonymousClass0Gn.G("Checkpoint native module error", anonymousClass0Q6.f4287B);
        }
    }

    public void resetChallengeWithReactTag(double d) {
        AnonymousClass1TQ.D(getReactApplicationContext(), "challenge/reset/", AnonymousClass0Pu.f4247G, new AnonymousClass5sf(this, d, AnonymousClass0In.E(getCurrentActivity())), null, Double.MIN_VALUE, true);
    }
}
