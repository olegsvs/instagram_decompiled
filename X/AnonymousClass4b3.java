package X;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4b3 */
public final class AnonymousClass4b3 implements AnonymousClass0G2 {
    /* renamed from: B */
    public boolean f55580B;
    /* renamed from: C */
    public boolean f55581C;
    /* renamed from: D */
    public AnonymousClass5Ux f55582D;
    /* renamed from: E */
    public String f55583E = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: F */
    public final Map f55584F = new HashMap();
    /* renamed from: G */
    public boolean f55585G;
    /* renamed from: H */
    public final AnonymousClass0Cm f55586H;
    /* renamed from: I */
    private final Runnable f55587I = new AnonymousClass4az(this);
    /* renamed from: J */
    private final SharedPreferences f55588J;

    private AnonymousClass4b3(AnonymousClass0Cm anonymousClass0Cm) {
        this.f55586H = anonymousClass0Cm;
        this.f55588J = AnonymousClass0Mu.B(anonymousClass0Cm, "quickRepliesText");
    }

    /* renamed from: A */
    public final List m24554A() {
        AnonymousClass0Sy.C();
        List arrayList = new ArrayList(this.f55584F.values());
        Collections.sort(arrayList, new AnonymousClass4b1(this));
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: B */
    public static AnonymousClass4b3 m24550B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Sy.C();
        Class cls = AnonymousClass4b3.class;
        AnonymousClass4b3 anonymousClass4b3 = (AnonymousClass4b3) anonymousClass0Cm.A(cls);
        if (anonymousClass4b3 != null) {
            return anonymousClass4b3;
        }
        Object anonymousClass4b32 = new AnonymousClass4b3(anonymousClass0Cm);
        anonymousClass0Cm.D(cls, anonymousClass4b32);
        return anonymousClass4b32;
    }

    /* renamed from: B */
    public final AnonymousClass4gv m24555B(String str) {
        AnonymousClass0Sy.C();
        if (!TextUtils.isEmpty(str)) {
            String toLowerCase = str.toLowerCase(AnonymousClass0EH.E());
            for (AnonymousClass4gv anonymousClass4gv : this.f55584F.values()) {
                if (anonymousClass4gv.f56332D.equals(toLowerCase)) {
                    return anonymousClass4gv;
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public static AnonymousClass4gt m24551C(AnonymousClass4b3 anonymousClass4b3) {
        AnonymousClass0Sy.B();
        String string = anonymousClass4b3.f55588J.getString("quickRepliesCollection", null);
        if (string != null) {
            try {
                return AnonymousClass4gu.parseFromJson(string);
            } catch (Throwable e) {
                AnonymousClass0Gn.F("quick_replies_deserialization", "failed to deserialize", e, 1);
            }
        }
        return null;
    }

    /* renamed from: C */
    public final void m24556C() {
        AnonymousClass0Sy.C();
        if (!this.f55580B) {
            this.f55580B = true;
            AnonymousClass0GG.B(AnonymousClass0Fx.B(), this.f55587I, 573620619);
        }
    }

    /* renamed from: D */
    public static void m24552D(AnonymousClass4b3 anonymousClass4b3) {
        AnonymousClass4gt anonymousClass4gt = new AnonymousClass4gt(new ArrayList(anonymousClass4b3.f55584F.values()), anonymousClass4b3.f55583E);
        try {
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            if (anonymousClass4gt.f56329C != null) {
                createGenerator.writeStringField("modification_token", anonymousClass4gt.f56329C);
            }
            if (anonymousClass4gt.f56328B != null) {
                createGenerator.writeFieldName("quick_replies");
                createGenerator.writeStartArray();
                for (AnonymousClass4gv anonymousClass4gv : anonymousClass4gt.f56328B) {
                    if (anonymousClass4gv != null) {
                        createGenerator.writeStartObject();
                        if (anonymousClass4gv.f56332D != null) {
                            createGenerator.writeStringField("shortcut", anonymousClass4gv.f56332D);
                        }
                        if (anonymousClass4gv.f56331C != null) {
                            createGenerator.writeStringField("text", anonymousClass4gv.f56331C);
                        }
                        if (anonymousClass4gv.f56330B != null) {
                            createGenerator.writeStringField("uuid", anonymousClass4gv.f56330B);
                        }
                        createGenerator.writeEndObject();
                    }
                }
                createGenerator.writeEndArray();
            }
            createGenerator.writeEndObject();
            createGenerator.close();
            String stringWriter2 = stringWriter.toString();
            Editor edit = anonymousClass4b3.f55588J.edit();
            edit.putString("quickRepliesCollection", stringWriter2);
            edit.apply();
            AnonymousClass0F4.f2058E.B(new AnonymousClass4b4());
        } catch (Throwable e) {
            AnonymousClass0Gn.F("quick_replies_serialization", "failed to serialize", e, 1);
        }
    }

    /* renamed from: D */
    public final boolean m24557D() {
        return this.f55584F.size() == 20;
    }

    /* renamed from: E */
    public static void m24553E(AnonymousClass4b3 anonymousClass4b3, List list) {
        anonymousClass4b3.f55584F.clear();
        for (AnonymousClass4gv anonymousClass4gv : list) {
            anonymousClass4b3.f55584F.put(anonymousClass4gv.m24789A(), anonymousClass4gv);
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.f55586H.E(AnonymousClass4b3.class);
    }
}
