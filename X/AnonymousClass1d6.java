package X;

import com.fasterxml.jackson.core.JsonParser;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1d6 */
public enum AnonymousClass1d6 {
    HIDE("hide");
    
    /* renamed from: E */
    private static final Map f20704E = null;
    /* renamed from: B */
    public String f20705B;

    static {
        f20704E = new HashMap();
        AnonymousClass1d6[] values = AnonymousClass1d6.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass1d6 anonymousClass1d6 = values[i];
            f20704E.put(anonymousClass1d6.f20705B, anonymousClass1d6);
            i++;
        }
    }

    private AnonymousClass1d6(String str) {
        this.f20705B = str;
    }

    public static AnonymousClass1d6 parseFromJson(JsonParser jsonParser) {
        return (AnonymousClass1d6) f20704E.get(jsonParser.getText());
    }
}
