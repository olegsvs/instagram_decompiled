package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5Y8 */
public class AnonymousClass5Y8 implements AnonymousClass4tg {
    /* renamed from: B */
    private final Matcher f66022B;

    public AnonymousClass5Y8(String str) {
        this.f66022B = Pattern.compile(str).matcher(JsonProperty.USE_DEFAULT_NAME);
    }

    public final boolean uW(String str) {
        return this.f66022B.reset(str).find();
    }
}
