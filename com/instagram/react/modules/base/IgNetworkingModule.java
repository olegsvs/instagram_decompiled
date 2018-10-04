package com.instagram.react.modules.base;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Dc;
import X.AnonymousClass0G7;
import X.AnonymousClass0GA;
import X.AnonymousClass0Iu;
import X.AnonymousClass0Ix;
import X.AnonymousClass0LH;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Qu;
import X.AnonymousClass0RB;
import X.AnonymousClass0Xx;
import X.AnonymousClass0Y0;
import X.AnonymousClass0a8;
import X.AnonymousClass0aB;
import X.AnonymousClass0aG;
import X.AnonymousClass0gO;
import X.AnonymousClass16y;
import X.AnonymousClass23n;
import X.AnonymousClass23x;
import X.AnonymousClass5sB;
import X.AnonymousClass5sC;
import X.AnonymousClass5sD;
import X.AnonymousClass5sE;
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.SparseArray;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

@ReactModule(name = "Networking")
public class IgNetworkingModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    public static final String MODULE_NAME = "Networking";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    public static final Class TAG = IgNetworkingModule.class;
    private final Object mEnqueuedRequestMonitor = new Object();
    private final SparseArray mEnqueuedRequests = new SparseArray();
    private final AnonymousClass0RB mResponseHandler = new AnonymousClass5sB(this);

    public String getName() {
        return MODULE_NAME;
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public IgNetworkingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void abortRequest(int i) {
        AnonymousClass0Y0 removeRequest = removeRequest(this, i);
        if (removeRequest != null) {
            removeRequest.A();
        }
    }

    private static void addAllHeaders(AnonymousClass0aB anonymousClass0aB, AnonymousClass0aG[] anonymousClass0aGArr) {
        if (anonymousClass0aGArr != null) {
            for (Object add : anonymousClass0aGArr) {
                anonymousClass0aB.f6463C.add(add);
            }
        }
    }

    private void buildMultipartRequest(AnonymousClass0aB anonymousClass0aB, AnonymousClass0aG[] anonymousClass0aGArr, ReadableArray readableArray) {
        AnonymousClass0Qu anonymousClass0Qu = new AnonymousClass0Qu();
        int size = readableArray.size();
        int i = 0;
        while (i < size) {
            ReadableMap map = readableArray.getMap(i);
            String string = map.getString("fieldName");
            if (string != null) {
                if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                    anonymousClass0Qu.H(string, map.getString(REQUEST_BODY_KEY_STRING));
                } else if (map.hasKey("uri")) {
                    String string2 = map.getString("uri");
                    String string3 = map.getString("name");
                    String string4 = map.getString("type");
                    if (string3 == null || string4 == null) {
                        throw new IllegalArgumentException("Incomplete payload for URI formData part");
                    }
                    ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
                    Uri parse = Uri.parse(string2);
                    AnonymousClass0LH.B(string != null);
                    anonymousClass0Qu.f4504B.put(string, new AnonymousClass23n(contentResolver, parse, string3, string4));
                } else {
                    throw new IllegalArgumentException("Unrecognized FormData part.");
                }
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Attribute 'name' missing for formData part at index ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        AnonymousClass0Qu D = AnonymousClass16y.D(AnonymousClass16y.B(anonymousClass0Qu, Collections.EMPTY_SET, Collections.EMPTY_MAP));
        addAllHeaders(anonymousClass0aB, anonymousClass0aGArr);
        anonymousClass0aB.f6462B = D.B();
    }

    public static AnonymousClass0a8 buildRequest(IgNetworkingModule igNetworkingModule, String str, String str2, ReadableArray readableArray, ReadableMap readableMap) {
        AnonymousClass0aB anonymousClass0aB = new AnonymousClass0aB(AnonymousClass0G7.F(AnonymousClass0Cd.f1698B.B()));
        AnonymousClass0aG[] extractHeaders = extractHeaders(readableArray);
        if ("GET".equalsIgnoreCase(str)) {
            anonymousClass0aB.f6464D = AnonymousClass0Pu.GET;
            anonymousClass0aB.f6466F = str2;
            addAllHeaders(anonymousClass0aB, extractHeaders);
        } else if (ReactWebViewManager.HTTP_METHOD_POST.equalsIgnoreCase(str)) {
            anonymousClass0aB.f6464D = AnonymousClass0Pu.f4247G;
            anonymousClass0aB.f6466F = str2;
            if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                buildSimpleRequest(anonymousClass0aB, extractHeaders, readableMap.getString(REQUEST_BODY_KEY_STRING));
            } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                igNetworkingModule.buildMultipartRequest(anonymousClass0aB, extractHeaders, readableMap.getArray(REQUEST_BODY_KEY_FORMDATA));
            } else {
                throw new IllegalArgumentException("Unsupported POST data type");
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported HTTP request method ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return anonymousClass0aB.B();
    }

    private static void buildSimpleRequest(AnonymousClass0aB anonymousClass0aB, AnonymousClass0aG[] anonymousClass0aGArr, String str) {
        String str2 = null;
        if (anonymousClass0aGArr != null) {
            for (AnonymousClass0aG anonymousClass0aG : anonymousClass0aGArr) {
                if (anonymousClass0aG.f6478B.equalsIgnoreCase(CONTENT_TYPE_HEADER_NAME)) {
                    str2 = anonymousClass0aG.f6479C;
                } else {
                    anonymousClass0aB.f6463C.add(anonymousClass0aG);
                }
            }
        }
        if (str2 != null) {
            anonymousClass0aB.f6462B = new AnonymousClass23x(str, str2);
            return;
        }
        throw new IllegalArgumentException("Payload is set but no content-type header specified");
    }

    private static AnonymousClass0aG[] extractHeaders(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array == null || array.size() != 2) {
                throw new JSApplicationCausedNativeException("Unexpected structure of headers array");
            }
            arrayList.add(new AnonymousClass0aG(array.getString(0), array.getString(1)));
        }
        return (AnonymousClass0aG[]) arrayList.toArray(new AnonymousClass0aG[arrayList.size()]);
    }

    private RCTDeviceEventEmitter getEventEmitter() {
        return (RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class);
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    public static byte[] inputStreamToByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[DexStore.LOAD_RESULT_MIXED_MODE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private void onDataReceived(int i, String str) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushString(str);
        getEventEmitter().emit("didReceiveNetworkData", createArray);
    }

    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass0Y0 anonymousClass0Y0 = (AnonymousClass0Y0) this.mEnqueuedRequests.valueAt(i);
                if (anonymousClass0Y0 != null) {
                    anonymousClass0Y0.A();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    public static void onRequestError(IgNetworkingModule igNetworkingModule, int i, String str) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushString(str);
        igNetworkingModule.getEventEmitter().emit("didCompleteNetworkResponse", createArray);
    }

    public static void onRequestSuccess(IgNetworkingModule igNetworkingModule, int i, AnonymousClass5sE anonymousClass5sE, String str) {
        igNetworkingModule.onResponseReceived(i, anonymousClass5sE);
        String str2 = JsonProperty.USE_DEFAULT_NAME;
        if (str.equals("text")) {
            str2 = new String(anonymousClass5sE.f69495B, Charset.forName("UTF-8"));
        } else if (str.equals("base64")) {
            str2 = Base64.encodeToString(anonymousClass5sE.f69495B, 2);
        }
        igNetworkingModule.onDataReceived(i, str2);
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushNull();
        igNetworkingModule.getEventEmitter().emit("didCompleteNetworkResponse", createArray);
    }

    private void onResponseReceived(int i, AnonymousClass5sE anonymousClass5sE) {
        WritableMap translateHeaders = translateHeaders(anonymousClass5sE.f69496C);
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushInt(anonymousClass5sE.f69497D);
        createArray.pushMap(translateHeaders);
        getEventEmitter().emit("didReceiveNetworkResponse", createArray);
    }

    private void registerRequest(int i, AnonymousClass0Y0 anonymousClass0Y0) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, anonymousClass0Y0);
        }
    }

    public static AnonymousClass0Y0 removeRequest(IgNetworkingModule igNetworkingModule, int i) {
        AnonymousClass0Y0 anonymousClass0Y0;
        synchronized (igNetworkingModule.mEnqueuedRequestMonitor) {
            anonymousClass0Y0 = (AnonymousClass0Y0) igNetworkingModule.mEnqueuedRequests.get(i);
            igNetworkingModule.mEnqueuedRequests.remove(i);
        }
        return anonymousClass0Y0;
    }

    @ReactMethod
    public void sendRequest(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i2, boolean z2) {
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3);
        } catch (Throwable e) {
            AnonymousClass0Dc.C(TAG, "Error while preparing request", e);
            onRequestError(this, i, e.getMessage());
        }
    }

    private void sendRequestInternal(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3) {
        AnonymousClass0Xx D = AnonymousClass0Xx.B(new AnonymousClass5sC(this, str, str2, readableArray, readableMap)).C(AnonymousClass0gO.f8154B).D(this.mResponseHandler);
        registerRequest(i, D.f6233B);
        AnonymousClass0GA anonymousClass0Iu = new AnonymousClass0Iu(D);
        anonymousClass0Iu.f2849B = new AnonymousClass5sD(this, i, str3);
        AnonymousClass0Ix.D(anonymousClass0Iu);
    }

    private static WritableMap translateHeaders(AnonymousClass0aG[] anonymousClass0aGArr) {
        WritableMap createMap = Arguments.createMap();
        for (AnonymousClass0aG anonymousClass0aG : anonymousClass0aGArr) {
            String str = anonymousClass0aG.f6478B;
            if (createMap.hasKey(str)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(createMap.getString(str));
                stringBuilder.append(", ");
                stringBuilder.append(anonymousClass0aG.f6479C);
                createMap.putString(str, stringBuilder.toString());
            } else {
                createMap.putString(str, anonymousClass0aG.f6479C);
            }
        }
        return createMap;
    }
}
