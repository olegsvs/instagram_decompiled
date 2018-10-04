package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.11a */
public final class AnonymousClass11a {
    /* renamed from: B */
    public static boolean m8810B(AnonymousClass0XM anonymousClass0XM, String str, JsonParser jsonParser) {
        if ("fb_connect_upsell".equals(str)) {
            anonymousClass0XM.f6151E = AnonymousClass1Vk.parseFromJson(jsonParser);
            return true;
        } else if ("vk_connect_upsell".equals(str)) {
            anonymousClass0XM.f6157K = AnonymousClass1Vk.parseFromJson(jsonParser);
            return true;
        } else if ("ci_connect_upsell".equals(str)) {
            anonymousClass0XM.f6149C = AnonymousClass1Vk.parseFromJson(jsonParser);
            return true;
        } else if ("generic_megaphone".equals(str)) {
            anonymousClass0XM.f6152F = AnonymousClass1N2.parseFromJson(jsonParser);
            return true;
        } else if ("rux".equals(str)) {
            anonymousClass0XM.f6155I = AnonymousClass1Xj.parseFromJson(jsonParser);
            return true;
        } else if ("fb_upsell".equals(str)) {
            anonymousClass0XM.f6150D = AnonymousClass1Vj.parseFromJson(jsonParser);
            return true;
        } else if (!"activator".equals(str)) {
            return false;
        } else {
            anonymousClass0XM.f6148B = AnonymousClass3UN.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass0XM parseFromJson(JsonParser jsonParser) {
        AnonymousClass0XM anonymousClass0XM = new AnonymousClass0XM();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass11a.m8810B(anonymousClass0XM, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        if (anonymousClass0XM.f6151E != null) {
            anonymousClass0XM.f6156J = AnonymousClass0lg.FB_CONNECT;
            anonymousClass0XM.f6154H = anonymousClass0XM.f6151E;
        } else if (anonymousClass0XM.f6157K != null) {
            anonymousClass0XM.f6156J = AnonymousClass0lg.VK_CONNECT;
            anonymousClass0XM.f6154H = anonymousClass0XM.f6157K;
        } else if (anonymousClass0XM.f6149C != null) {
            anonymousClass0XM.f6156J = AnonymousClass0lg.CONTACT_IMPORT_CONNECT;
            anonymousClass0XM.f6154H = anonymousClass0XM.f6149C;
        } else if (anonymousClass0XM.f6152F != null) {
            anonymousClass0XM.f6156J = AnonymousClass0lg.GENERIC;
            anonymousClass0XM.f6154H = anonymousClass0XM.f6152F;
        } else if (anonymousClass0XM.f6155I != null) {
            anonymousClass0XM.f6156J = AnonymousClass0lg.RUX;
            anonymousClass0XM.f6154H = anonymousClass0XM.f6155I;
        } else if (anonymousClass0XM.f6150D != null) {
            anonymousClass0XM.f6156J = AnonymousClass0lg.FB_UPSELL;
            anonymousClass0XM.f6154H = anonymousClass0XM.f6150D;
        } else if (anonymousClass0XM.f6148B != null) {
            anonymousClass0XM.f6156J = AnonymousClass0lg.ACTIVATOR;
            anonymousClass0XM.f6154H = anonymousClass0XM.f6148B;
        }
        return anonymousClass0XM;
    }
}
