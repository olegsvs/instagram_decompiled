package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0Qu */
public final class AnonymousClass0Qu {
    /* renamed from: E */
    private static final Pattern f4503E = Pattern.compile("\\{([\\w_\\d]+)\\}");
    /* renamed from: B */
    public final Map f4504B = new AnonymousClass0O7();
    /* renamed from: C */
    public AnonymousClass18t f4505C;
    /* renamed from: D */
    public AnonymousClass23t f4506D = AnonymousClass23t.f25537C;

    /* renamed from: A */
    public final void m4070A(AnonymousClass0Qu anonymousClass0Qu, Set set) {
        for (Entry entry : anonymousClass0Qu.f4504B.entrySet()) {
            if (set == null || set.contains(entry.getKey())) {
                this.f4504B.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: B */
    public final AnonymousClass0gK m4071B() {
        Object obj;
        for (Entry value : this.f4504B.entrySet()) {
            if (((AnonymousClass0RE) value.getValue()).isStreaming()) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj != null) {
            AnonymousClass0gK anonymousClass18s = new AnonymousClass18s(this.f4505C);
            for (Entry value2 : this.f4504B.entrySet()) {
                ((AnonymousClass0RE) value2.getValue()).FC((String) value2.getKey(), anonymousClass18s);
            }
            AnonymousClass18t anonymousClass18t = this.f4505C;
            if (anonymousClass18t == null) {
                return anonymousClass18s;
            }
            anonymousClass18t.pe(0, anonymousClass18s.getContentLength());
            return anonymousClass18s;
        } else if (this.f4505C == null) {
            try {
                return new AnonymousClass0gJ(m4075F(), this.f4506D);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            throw new IllegalArgumentException("The request without a file entity is not listenable");
        }
    }

    /* renamed from: C */
    public final String m4072C() {
        return m4073D(false);
    }

    /* renamed from: D */
    public final String m4073D(boolean z) {
        List F = m4075F();
        if (z) {
            Collections.sort(F, new AnonymousClass23m(this));
        }
        return AnonymousClass0gM.m6615C(F, "UTF-8", this.f4506D);
    }

    /* renamed from: E */
    public final String m4074E(String str) {
        if (this.f4504B.size() == 0) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("?");
        stringBuilder.append(m4072C());
        return stringBuilder.toString();
    }

    /* renamed from: F */
    public final List m4075F() {
        List linkedList = new LinkedList();
        for (Entry entry : this.f4504B.entrySet()) {
            if (entry.getValue() instanceof AnonymousClass0RD) {
                linkedList.add(new AnonymousClass0gL((String) entry.getKey(), ((AnonymousClass0RD) entry.getValue()).f4616B));
            }
        }
        return linkedList;
    }

    /* renamed from: G */
    public final String m4076G(String str, boolean z) {
        Matcher matcher = f4503E.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            Object group = matcher.group(1);
            AnonymousClass0RE anonymousClass0RE = (AnonymousClass0RE) this.f4504B.get(group);
            if (anonymousClass0RE == null || !(anonymousClass0RE instanceof AnonymousClass0RD)) {
                throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("can't find string param %s to format the string", group));
            }
            matcher.appendReplacement(stringBuffer, ((AnonymousClass0RD) anonymousClass0RE).f4616B);
            if (z) {
                this.f4504B.remove(group);
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: H */
    public final AnonymousClass0Qu m4077H(String str, String str2) {
        AnonymousClass0LH.m2924B(str != null);
        if (str2 != null) {
            this.f4504B.put(str, new AnonymousClass0RD(str2));
        }
        return this;
    }

    /* renamed from: I */
    public final AnonymousClass0Qu m4078I(String str, byte[] bArr) {
        AnonymousClass0LH.m2924B(str != null);
        this.f4504B.put(str, new AnonymousClass1aW(bArr, "application/octet-stream"));
        return this;
    }

    /* renamed from: J */
    public final AnonymousClass0Qu m4079J(String str, byte[] bArr, String str2) {
        AnonymousClass0LH.m2924B(str != null);
        this.f4504B.put(str, new AnonymousClass1aW(bArr, str2));
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(m4072C());
        for (Entry entry : this.f4504B.entrySet()) {
            if (((AnonymousClass0RE) entry.getValue()).isStreaming()) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("&");
                }
                stringBuilder.append((String) entry.getKey());
                stringBuilder.append("=");
                stringBuilder.append("FILE");
            }
        }
        return stringBuilder.toString();
    }
}
