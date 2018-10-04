package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONObject;

/* renamed from: X.09o */
public final class AnonymousClass09o implements AnonymousClass0Ui {
    /* renamed from: B */
    private static AnonymousClass0Cm f1121B;

    public final String sL() {
        return "quick_experiments_list";
    }

    public final String tL() {
        return ".json";
    }

    public AnonymousClass09o(AnonymousClass0Cm anonymousClass0Cm) {
        f1121B = anonymousClass0Cm;
    }

    public final String HK() {
        String str = JsonProperty.USE_DEFAULT_NAME;
        try {
            ArrayList arrayList = new ArrayList();
            Object arrayList2 = new ArrayList();
            AnonymousClass0M7 anonymousClass0M7 = AnonymousClass0M7.f3347C;
            if (anonymousClass0M7 == null) {
                return str;
            }
            arrayList.addAll(anonymousClass0M7.mo857D().m3175E());
            arrayList.addAll(anonymousClass0M7.mo861H(f1121B).m3175E());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass26u anonymousClass26u = (AnonymousClass26u) arrayList.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("1. Universe", anonymousClass26u.f26064B);
                jSONObject.put("2. Parameter", anonymousClass26u.f26066D);
                jSONObject.put("3. Value", anonymousClass26u.f26067E);
                jSONObject.put("4. Overridden", anonymousClass26u.f26065C);
                arrayList2.add(jSONObject);
            }
            Collections.sort(arrayList2, new AnonymousClass09n(this));
            return arrayList2.toString();
        } catch (Throwable e) {
            AnonymousClass0Dc.m1244G("QuickExperimentsValueLogger", "Unable to create log", e);
            return str;
        }
    }
}
