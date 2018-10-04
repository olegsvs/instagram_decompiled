package com.instagram.react.modules.base;

import X.AnonymousClass0EH;
import X.AnonymousClass0FO;
import X.AnonymousClass0IE;
import X.AnonymousClass0fz;
import com.facebook.fbreact.specs.NativeRelayConfigSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "RelayAPIConfig")
public final class RelayAPIConfigModule extends NativeRelayConfigSpec {
    private static final String API_PATH = "/api/v1/ads/";
    private static final String GRAPHQL_URL = "%s%s/?locale=%s";
    private static final String MODULE_NAME = "RelayAPIConfig";

    public String getName() {
        return MODULE_NAME;
    }

    public RelayAPIConfigModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public Map getTypedExportedConstants() {
        String B = AnonymousClass0fz.B(API_PATH);
        String C = AnonymousClass0EH.C();
        Map hashMap = new HashMap();
        if (AnonymousClass0FO.Q()) {
            hashMap.put("accessToken", AnonymousClass0FO.I());
            hashMap.put("actorID", AnonymousClass0FO.O());
        }
        hashMap.put("fetchTimeout", Integer.valueOf(30000));
        hashMap.put("retryDelays", Integer.valueOf(JsonMappingException.MAX_REFS_TO_LIST));
        String str = GRAPHQL_URL;
        hashMap.put("graphBatchURI", AnonymousClass0IE.E(str, new Object[]{B, "graphqlbatch", C}));
        hashMap.put("graphURI", AnonymousClass0IE.E(str, new Object[]{B, "graphql", C}));
        return hashMap;
    }
}
