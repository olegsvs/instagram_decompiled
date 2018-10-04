package X;

import android.content.Context;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.50S */
public final class AnonymousClass50S extends AnonymousClass1UG {
    /* renamed from: D */
    private static final Pattern f59248D = Pattern.compile("^.*(\\d{3} \\d{3}).*Instagram.*$");
    /* renamed from: B */
    private final AnonymousClass5Z5 f59249B;
    /* renamed from: C */
    private final AtomicBoolean f59250C = new AtomicBoolean(false);

    public AnonymousClass50S(AnonymousClass5Z5 anonymousClass5Z5) {
        AnonymousClass0LH.E(anonymousClass5Z5);
        this.f59249B = anonymousClass5Z5;
    }

    /* renamed from: A */
    public final void m25577A(Context context, SmsMessage[] smsMessageArr) {
        smsMessageArr = AnonymousClass50S.m25576C(smsMessageArr);
        if (smsMessageArr != null) {
            this.f59249B.m27563A(smsMessageArr.replaceAll("\\s", JsonProperty.USE_DEFAULT_NAME));
        }
    }

    /* renamed from: B */
    private static String m25575B(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = f59248D.matcher(str);
            if (matcher.matches() && matcher.groupCount() == 1) {
                return matcher.group(1);
            }
        }
        return null;
    }

    /* renamed from: B */
    public final void m25578B(Context context) {
        if (!this.f59250C.getAndSet(true)) {
            super.B(context);
        }
    }

    /* renamed from: C */
    private static String m25576C(SmsMessage[] smsMessageArr) {
        if (smsMessageArr != null) {
            for (SmsMessage messageBody : smsMessageArr) {
                String B = AnonymousClass50S.m25575B(messageBody.getMessageBody());
                if (B != null) {
                    return B;
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public final void m25579C(Context context) {
        if (this.f59250C.getAndSet(false)) {
            super.C(context);
        }
    }
}
