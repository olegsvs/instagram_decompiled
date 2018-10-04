package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1ab */
public final class AnonymousClass1ab {
    /* renamed from: B */
    public String f20360B;
    /* renamed from: C */
    public String f20361C;
    /* renamed from: D */
    public HashMap f20362D;
    /* renamed from: E */
    public long f20363E = -1;

    public AnonymousClass1ab() {
        String str = JsonProperty.USE_DEFAULT_NAME;
        this.f20360B = str;
        this.f20361C = str;
    }

    /* renamed from: A */
    public final Map m11933A() {
        Map map = this.f20362D;
        return map != null ? map : Collections.emptyMap();
    }
}
