package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import com.facebook.C0164R;
import com.facebook.proxygen.TraceFieldType;
import java.util.List;
import java.util.regex.Matcher;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.554 */
public final class AnonymousClass554 {
    /* renamed from: B */
    public static void m25668B(SpannableStringBuilder spannableStringBuilder, AnonymousClass1LU anonymousClass1LU, AnonymousClass1Oq anonymousClass1Oq, int i, boolean z) {
        Matcher D = AnonymousClass189.D(spannableStringBuilder.toString());
        while (D.find()) {
            boolean z2 = z;
            spannableStringBuilder.setSpan(new AnonymousClass54t(z2, anonymousClass1LU, D.group(1), anonymousClass1Oq, i), D.start(1), D.end(1), 33);
        }
    }

    /* renamed from: C */
    public static void m25669C(SpannableStringBuilder spannableStringBuilder, AnonymousClass1LU anonymousClass1LU, AnonymousClass1Oq anonymousClass1Oq, int i, boolean z) {
        Matcher O = AnonymousClass0IE.O(spannableStringBuilder.toString());
        while (O.find()) {
            boolean z2 = z;
            spannableStringBuilder.setSpan(new AnonymousClass54u(z2, anonymousClass1LU, O.group(1), anonymousClass1Oq, i), O.start(1), O.end(1), 33);
        }
    }

    /* renamed from: D */
    public static void m25670D(AnonymousClass1Oq anonymousClass1Oq, Context context, SpannableStringBuilder spannableStringBuilder) {
        AnonymousClass1Ot anonymousClass1Ot = anonymousClass1Oq.f18018B;
        Object obj = anonymousClass1Ot != null ? anonymousClass1Ot.f18070d : null;
        if (TextUtils.isEmpty(obj)) {
            obj = anonymousClass1Oq.H(context);
        }
        if (obj != null) {
            spannableStringBuilder.append(" ").append(obj);
            int B = AnonymousClass53x.m25660B(spannableStringBuilder.toString());
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(AnonymousClass0Ca.C(context, C0164R.color.grey_5));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" ");
            stringBuilder.append(obj);
            spannableStringBuilder.setSpan(foregroundColorSpan, B - AnonymousClass53x.m25660B(stringBuilder.toString()), B, 33);
        }
    }

    /* renamed from: E */
    public static String m25671E(Context context, AnonymousClass1Oq anonymousClass1Oq) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(anonymousClass1Oq.U());
        String K = anonymousClass1Oq.K(context);
        if (K != null) {
            stringBuilder.append(" ");
            stringBuilder.append(K);
        }
        return stringBuilder.toString();
    }

    /* renamed from: F */
    public static SpannableStringBuilder m25672F(Context context, AnonymousClass1Oq anonymousClass1Oq, int i, AnonymousClass1LU anonymousClass1LU, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        AnonymousClass1Oq anonymousClass1Oq2 = anonymousClass1Oq;
        AnonymousClass1Ot anonymousClass1Ot = anonymousClass1Oq2.f18018B;
        boolean isEmpty = TextUtils.isEmpty(anonymousClass1Ot != null ? anonymousClass1Ot.f18067a : null);
        Context context2 = context;
        boolean z2 = i;
        AnonymousClass1LU anonymousClass1LU2 = anonymousClass1LU;
        boolean z3 = z;
        AnonymousClass1Ot anonymousClass1Ot2;
        if (isEmpty) {
            spannableStringBuilder.append(anonymousClass1Oq2.U());
            AnonymousClass554.m25670D(anonymousClass1Oq2, context, spannableStringBuilder);
            anonymousClass1Ot2 = anonymousClass1Oq2.f18018B;
            List<AnonymousClass1Ov> list = anonymousClass1Ot2 != null ? anonymousClass1Ot2.f18058R : null;
            if (list != null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(C0164R.attr.textColorBoldLink, typedValue, true);
                int i2 = typedValue.data;
                for (AnonymousClass1Ov anonymousClass1Ov : list) {
                    Object anonymousClass54v;
                    String str = anonymousClass1Ov.f18077C;
                    switch (anonymousClass1Ov.f18079E.ordinal()) {
                        case 0:
                            anonymousClass54v = new AnonymousClass54v(true, i2, anonymousClass1LU2, str, anonymousClass1Oq2, z2);
                            break;
                        case 1:
                            anonymousClass54v = new AnonymousClass54w(true, i2, anonymousClass1LU2, anonymousClass1Oq2, z2);
                            break;
                        case 2:
                            anonymousClass54v = new AnonymousClass54x(true, i2, anonymousClass1LU2, anonymousClass1Oq2, z2);
                            break;
                        case 3:
                            anonymousClass54v = new AnonymousClass54y(true, i2, anonymousClass1LU2, anonymousClass1Oq2, z2);
                            break;
                        case 4:
                            anonymousClass54v = new AnonymousClass54z(true, i2, anonymousClass1LU2, anonymousClass1Oq2, z2, str);
                            break;
                        case 5:
                        case 6:
                        case 8:
                        case 10:
                            anonymousClass54v = new AnonymousClass552(true, i2, anonymousClass1LU2, anonymousClass1Oq2, z2);
                            break;
                        case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                            anonymousClass54v = new AnonymousClass550(true, i2, anonymousClass1Ov, anonymousClass1Oq2, anonymousClass1LU2, z2);
                            break;
                        case 9:
                            anonymousClass54v = new AnonymousClass551(true, i2, anonymousClass1LU2, anonymousClass1Oq2, z2);
                            break;
                        case 11:
                            anonymousClass54v = new AnonymousClass553(true, i2, anonymousClass1LU2, anonymousClass1Oq2, z2);
                            break;
                        default:
                            throw new IndexOutOfBoundsException("Unhandled newsfeed story link type");
                    }
                    if (anonymousClass1Ov.f18078D < 0 || anonymousClass1Ov.f18076B >= spannableStringBuilder.length()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("length: ");
                        stringBuilder.append(spannableStringBuilder.length());
                        stringBuilder.append(", start: ");
                        stringBuilder.append(anonymousClass1Ov.f18078D);
                        stringBuilder.append(", end: ");
                        stringBuilder.append(anonymousClass1Ov.f18076B);
                        AnonymousClass0Gn.L("NewsfeedStoryUtil.addLink()", new IndexOutOfBoundsException(stringBuilder.toString()));
                    } else {
                        spannableStringBuilder.setSpan(anonymousClass54v, anonymousClass1Ov.f18078D, anonymousClass1Ov.f18076B, 33);
                    }
                }
            }
            AnonymousClass554.m25668B(spannableStringBuilder, anonymousClass1LU2, anonymousClass1Oq2, z2, z3);
            AnonymousClass554.m25669C(spannableStringBuilder, anonymousClass1LU2, anonymousClass1Oq2, z2, z3);
        } else {
            anonymousClass1Ot2 = anonymousClass1Oq2.f18018B;
            for (CharSequence charSequence : (anonymousClass1Ot2 != null ? anonymousClass1Ot2.f18067a : null).split("\\{|\\}")) {
                if (charSequence.contains("|")) {
                    Object anonymousClass53p;
                    AnonymousClass53x anonymousClass53x = new AnonymousClass53x(charSequence);
                    anonymousClass53x.f59719B = spannableStringBuilder;
                    anonymousClass53x.f59719B.append(anonymousClass53x.f59722E);
                    if ((TextUtils.isEmpty(anonymousClass53x.f59723F) ^ 1) != 0) {
                        Object obj = (!anonymousClass53x.f59724G.equalsIgnoreCase("user") || TextUtils.isEmpty((CharSequence) anonymousClass53x.f59725H.get("username"))) ? null : 1;
                        if (obj != null) {
                            anonymousClass53p = new AnonymousClass53p(anonymousClass53x, anonymousClass53x.f59721D, anonymousClass53x.f59720C, anonymousClass1LU2, anonymousClass1Oq2, z2);
                        } else {
                            obj = (!anonymousClass53x.f59724G.equalsIgnoreCase("user") || TextUtils.isEmpty((CharSequence) anonymousClass53x.f59725H.get("id"))) ? null : 1;
                            if (obj != null) {
                                anonymousClass53p = new AnonymousClass53q(anonymousClass53x, anonymousClass53x.f59721D, anonymousClass53x.f59720C, anonymousClass1LU2, anonymousClass1Oq2, z2);
                            } else {
                                obj = (!anonymousClass53x.f59724G.equalsIgnoreCase("likes_chrono") || TextUtils.isEmpty((CharSequence) anonymousClass53x.f59725H.get("media"))) ? null : 1;
                                if (obj != null) {
                                    anonymousClass53p = new AnonymousClass53r(anonymousClass53x, anonymousClass53x.f59721D, anonymousClass53x.f59720C, anonymousClass1LU2, anonymousClass1Oq2, z2);
                                } else {
                                    obj = (!anonymousClass53x.f59724G.equalsIgnoreCase("location") || TextUtils.isEmpty((CharSequence) anonymousClass53x.f59725H.get("id"))) ? null : 1;
                                    if (obj != null) {
                                        anonymousClass53p = new AnonymousClass53s(anonymousClass53x, anonymousClass53x.f59721D, anonymousClass53x.f59720C, anonymousClass1LU2, anonymousClass1Oq2, z2);
                                    } else {
                                        obj = (!anonymousClass53x.f59724G.equalsIgnoreCase("tag") || TextUtils.isEmpty((CharSequence) anonymousClass53x.f59725H.get("name"))) ? null : 1;
                                        if (obj != null) {
                                            anonymousClass53p = new AnonymousClass53t(anonymousClass53x, anonymousClass53x.f59721D, anonymousClass53x.f59720C, anonymousClass1LU2, anonymousClass1Oq2, z2);
                                        } else {
                                            obj = (!anonymousClass53x.f59724G.equalsIgnoreCase("live_likers") || TextUtils.isEmpty((CharSequence) anonymousClass53x.f59725H.get(TraceFieldType.BroadcastId))) ? null : 1;
                                            if (obj != null) {
                                                anonymousClass53p = new AnonymousClass53u(anonymousClass53x, anonymousClass53x.f59721D, anonymousClass53x.f59720C, anonymousClass1LU2, anonymousClass1Oq2, z2);
                                            } else {
                                                obj = (!anonymousClass53x.f59724G.equalsIgnoreCase("story_viewer_list") || TextUtils.isEmpty((CharSequence) anonymousClass53x.f59725H.get("reel_id"))) ? null : 1;
                                                anonymousClass53p = obj != null ? new AnonymousClass53v(anonymousClass53x, anonymousClass53x.f59721D, anonymousClass53x.f59720C, anonymousClass1LU2, anonymousClass1Oq2, z2) : null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        anonymousClass53p = new AnonymousClass53w(anonymousClass53x, anonymousClass53x.f59721D, anonymousClass53x.f59720C);
                    }
                    if (anonymousClass53p != null && AnonymousClass53x.m25660B(anonymousClass53x.f59719B.toString()) - AnonymousClass53x.m25660B(anonymousClass53x.f59722E) >= 0) {
                        SpannableStringBuilder spannableStringBuilder2 = anonymousClass53x.f59719B;
                        spannableStringBuilder2.setSpan(anonymousClass53p, AnonymousClass53x.m25660B(spannableStringBuilder2.toString()) - AnonymousClass53x.m25660B(anonymousClass53x.f59722E), AnonymousClass53x.m25660B(anonymousClass53x.f59719B.toString()), 33);
                    }
                } else {
                    spannableStringBuilder.append(charSequence);
                }
            }
            AnonymousClass554.m25670D(anonymousClass1Oq2, context2, spannableStringBuilder);
            AnonymousClass554.m25668B(spannableStringBuilder, anonymousClass1LU2, anonymousClass1Oq2, z2, z3);
            AnonymousClass554.m25669C(spannableStringBuilder, anonymousClass1LU2, anonymousClass1Oq2, z2, z3);
        }
        return spannableStringBuilder;
    }

    /* renamed from: G */
    public static String m25673G(String str, int i, int i2) {
        if (i >= 0 && i2 <= AnonymousClass53x.m25660B(str)) {
            if (i2 >= i) {
                return str.substring(i, i2);
            }
        }
        return null;
    }
}
