package com.facebook.catalyst.modules.fbinfo;

import X.AnonymousClass0bc;
import X.AnonymousClass0bd;
import X.AnonymousClass5dt;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.fbreact.specs.NativeBuildInfoSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ReactModule(name = "BuildInfo")
public final class BuildInfoModule extends NativeBuildInfoSpec {
    public static final String NAME = "BuildInfo";

    public String getName() {
        return NAME;
    }

    public BuildInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static List getSupportedAbis() {
        if (VERSION.SDK_INT >= 21) {
            return Arrays.asList(Build.SUPPORTED_ABIS);
        }
        return Arrays.asList(new String[]{Build.CPU_ABI, Build.CPU_ABI2});
    }

    public Map getTypedExportedConstants() {
        Map hashMap = new HashMap();
        Context reactApplicationContext = getReactApplicationContext();
        AnonymousClass0bd B = AnonymousClass0bc.B(reactApplicationContext);
        AnonymousClass5dt anonymousClass5dt = new AnonymousClass5dt(reactApplicationContext);
        hashMap.put("androidDeviceCpuAbis", getSupportedAbis());
        hashMap.put("appMajorVersion", anonymousClass5dt.f67666B);
        hashMap.put("appVersion", anonymousClass5dt.f67667C);
        hashMap.put("buildBranchName", B.f6825C);
        hashMap.put("buildRevision", B.f6826D);
        hashMap.put("buildTime", Long.valueOf(B.f6824B / 1000));
        hashMap.put("buildVersion", String.valueOf(anonymousClass5dt.f67668D));
        hashMap.put("bundleIdentifier", reactApplicationContext.getPackageName());
        return hashMap;
    }
}
