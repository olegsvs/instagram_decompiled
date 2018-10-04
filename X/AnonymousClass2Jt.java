package X;

import android.content.Context;
import android.text.Spannable;

/* renamed from: X.2Jt */
public final class AnonymousClass2Jt {
    /* renamed from: B */
    public static void m15046B(Context context, Spannable spannable, int i, int i2, int i3) {
        AnonymousClass2K5 B = AnonymousClass2K6.m15057B(null).m15060B("classic");
        AnonymousClass2K5 anonymousClass2K5 = (AnonymousClass2K5) AnonymousClass2Jd.m15019D(spannable, AnonymousClass2K5.class);
        if (anonymousClass2K5 == null) {
            anonymousClass2K5 = B;
        }
        for (AnonymousClass2Js anonymousClass2Js : (AnonymousClass2Js[]) spannable.getSpans(i, i2, AnonymousClass2Js.class)) {
            AnonymousClass2Js anonymousClass2Js2;
            int spanStart = spannable.getSpanStart(anonymousClass2Js2);
            int spanEnd = spannable.getSpanEnd(anonymousClass2Js2);
            int spanFlags = spannable.getSpanFlags(anonymousClass2Js2);
            int i4 = anonymousClass2Js2.f28900B;
            spannable.removeSpan(anonymousClass2Js2);
            if (spanStart < i && spanEnd > i2) {
                AnonymousClass2Js anonymousClass2Js3 = new AnonymousClass2Js(context, anonymousClass2K5, i4);
                anonymousClass2Js2 = new AnonymousClass2Js(context, anonymousClass2K5, i4);
                spannable.setSpan(anonymousClass2Js3, spanStart, i, spanFlags);
                spannable.setSpan(anonymousClass2Js2, i2, spanEnd, spanFlags);
            } else if (spanStart < i) {
                spannable.setSpan(anonymousClass2Js2, spanStart, i, spanFlags);
            } else if (spanEnd > i2) {
                spannable.setSpan(anonymousClass2Js2, i2, spanEnd, spanFlags);
            }
        }
        spannable.setSpan(new AnonymousClass2Js(context, anonymousClass2K5, i3), i, i2, 18);
    }
}
