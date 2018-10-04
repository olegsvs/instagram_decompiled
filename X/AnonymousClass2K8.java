package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.EditText;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.2K8 */
public final class AnonymousClass2K8 {
    /* renamed from: B */
    public static void m15063B(AnonymousClass2Jp anonymousClass2Jp, Context context, AnonymousClass2bu anonymousClass2bu) {
        Spannable G = AnonymousClass2K8.m15068G(anonymousClass2bu.f31514M);
        if (G != null) {
            AnonymousClass2Jn.m15037B(anonymousClass2Jp.f28893G, G, context);
            AnonymousClass2Jy.m15051F(anonymousClass2Jp.f28891E, G);
            anonymousClass2bu.m16450H(G);
            anonymousClass2bu.invalidateSelf();
        }
    }

    /* renamed from: C */
    public static void m15064C(AnonymousClass2K5 anonymousClass2K5, Context context, Editable editable, Paint paint) {
        AnonymousClass2K5 anonymousClass2K52 = anonymousClass2K5;
        Editable editable2 = editable;
        if (AnonymousClass2Jk.f28880B[anonymousClass2K5.f28939J.ordinal()] != 1) {
            AnonymousClass2Jl.m15035B(editable2);
        } else {
            AnonymousClass2Jl.m15036C(editable2);
        }
        Context context2 = context;
        AnonymousClass2K0.m15054B(anonymousClass2K5, editable2, context2);
        AnonymousClass2Jd.m15022G(editable2, AnonymousClass2KH.class);
        if (AnonymousClass2KF.f28967B[anonymousClass2K5.f28943N.f28963E.ordinal()] == 1) {
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(anonymousClass2K5.f28943N.f28962D);
            int C = anonymousClass2K5.f28943N.m15074C(context2);
            int E = anonymousClass2K5.f28943N.m15076E(context2);
            Object obj = editable2.toString();
            TextPaint textPaint = AnonymousClass2KG.f28968B;
            textPaint.set(paint);
            TextPaint textPaint2 = AnonymousClass2KG.f28968B;
            AnonymousClass2Jd.m15017B(editable2, textPaint);
            textPaint2.setLinearText(true);
            textPaint2.setSubpixelText(true);
            textPaint2.setTextSize((float) dimensionPixelSize);
            Layout staticLayout = new StaticLayout(obj, AnonymousClass2KG.f28968B, E, Alignment.ALIGN_CENTER, 1.0f, null, true);
            for (int i = 0; i < staticLayout.getLineCount(); i++) {
                float B;
                int lineStart = staticLayout.getLineStart(i);
                int lineEnd = staticLayout.getLineEnd(i);
                String replace = obj.substring(lineStart, lineEnd).replace("\n", JsonProperty.USE_DEFAULT_NAME);
                if (AnonymousClass0IE.I().matcher(replace).find()) {
                    B = AnonymousClass2KG.m15078B(replace, dimensionPixelSize, AnonymousClass0nB.C(C, dimensionPixelSize, 160), E);
                } else {
                    B = AnonymousClass2KG.m15078B(replace, dimensionPixelSize, C, E);
                }
                editable2.setSpan(new AnonymousClass2KH(B), lineStart, lineEnd, 17);
            }
        }
        if (anonymousClass2K52 != AnonymousClass2K7.m15062B(editable2)) {
            AnonymousClass2Jd.m15022G(editable2, AnonymousClass2K5.class);
            editable2.setSpan(anonymousClass2K52, 0, editable2.length(), 18);
        }
    }

    /* renamed from: D */
    public static void m15065D(AnonymousClass2K5 anonymousClass2K5, Context context, AnonymousClass2bu anonymousClass2bu) {
        Spannable G = AnonymousClass2K8.m15068G(anonymousClass2bu.f31514M);
        if (G != null) {
            AnonymousClass2K8.m15064C(anonymousClass2K5, context, G, anonymousClass2bu.f31510I);
            anonymousClass2bu.m16450H(G);
        }
    }

    /* renamed from: E */
    public static void m15066E(AnonymousClass2Jp anonymousClass2Jp, EditText editText) {
        CharSequence G = AnonymousClass2K8.m15068G(editText.getHint());
        if (G != null) {
            AnonymousClass2Jn.m15037B(anonymousClass2Jp.f28892F, G, editText.getContext());
            editText.setHint(G);
            editText.invalidate();
        }
    }

    /* renamed from: F */
    public static void m15067F(AnonymousClass2K5 anonymousClass2K5, EditText editText) {
        CharSequence G = AnonymousClass2K8.m15068G(editText.getHint());
        if (G != null) {
            AnonymousClass2K8.m15064C(anonymousClass2K5, editText.getContext(), G, editText.getPaint());
            editText.setHint(G);
        }
    }

    /* renamed from: G */
    private static Editable m15068G(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence instanceof Editable) {
            return (Editable) charSequence;
        }
        return new SpannableStringBuilder(charSequence);
    }
}
