package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.0pG */
public final class AnonymousClass0pG {
    /* renamed from: B */
    private final int f10529B = this.f10530C.getResources().getDimensionPixelOffset(C0164R.dimen.feed_item_label_below_comments_with_translation_bottom_padding);
    /* renamed from: C */
    private final Context f10530C;
    /* renamed from: D */
    private final AnonymousClass0jM f10531D;

    public AnonymousClass0pG(Context context, AnonymousClass0jM anonymousClass0jM) {
        this.f10530C = context;
        this.f10531D = anonymousClass0jM;
    }

    /* renamed from: A */
    public final void m7804A(AnonymousClass0pb anonymousClass0pb, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, boolean z, boolean z2) {
        AnonymousClass0P7 anonymousClass0P72 = anonymousClass0P7;
        Object obj = (anonymousClass0P72.f4028c == null || !anonymousClass0P72.f4028c.f4895O) ? null : 1;
        Context context = this.f10530C;
        Object obj2 = (AnonymousClass0yJ.m8630C() && anonymousClass0P72.wA()) ? 1 : null;
        AnonymousClass0jM anonymousClass0jM = r3.f10531D;
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        AnonymousClass0m3 anonymousClass0m32 = anonymousClass0m3;
        if (anonymousClass0m32.f9715x != AnonymousClass0a4.ADS_HISTORY || TextUtils.isEmpty(anonymousClass0P72.WB)) {
            CharSequence toUpperCase;
            if (z) {
                long longValue = anonymousClass0P72.FA().longValue();
                CharSequence charSequence = null;
                toUpperCase = longValue != 0 ? AnonymousClass0dw.m6138F(context, (double) longValue).toUpperCase(context.getResources().getConfiguration().locale) : null;
                if (z2 && !TextUtils.isEmpty(anonymousClass0P72.m3770Z())) {
                    charSequence = (CharSequence) anonymousClass0jM.f9119F.get(anonymousClass0P72);
                    if (charSequence == null) {
                        Context context2 = anonymousClass0jM.f9117D;
                        int D = AnonymousClass0G5.m1723D(context2, C0164R.attr.textColorBoldLink);
                        AnonymousClass0ps anonymousClass0ps = new AnonymousClass0ps(new SpannableStringBuilder(anonymousClass0P72.m3770Z().toUpperCase(context2.getResources().getConfiguration().locale)));
                        anonymousClass0ps.f10766E = true;
                        anonymousClass0ps.f10767F = true;
                        anonymousClass0ps.f10764C = D;
                        anonymousClass0ps.f10770I = D;
                        charSequence = anonymousClass0ps.m7889C(new AnonymousClass0yK(anonymousClass0P72, false)).m7888B(new AnonymousClass0pt(anonymousClass0P72)).m7887A();
                        for (int length = charSequence.length() - 1; length >= 0; length--) {
                            if (charSequence.charAt(length) == '@') {
                                charSequence.delete(length, length + 1);
                            }
                        }
                        anonymousClass0jM.f9119F.put(anonymousClass0P72, charSequence);
                    }
                }
                if (!TextUtils.isEmpty(toUpperCase) && !TextUtils.isEmpty(charSequence)) {
                    spannableStringBuilder.append(toUpperCase);
                    spannableStringBuilder.append(" • ");
                    spannableStringBuilder.append(charSequence);
                } else if (!TextUtils.isEmpty(toUpperCase)) {
                    spannableStringBuilder.append(toUpperCase);
                } else if (!TextUtils.isEmpty(charSequence)) {
                    spannableStringBuilder.append(charSequence);
                }
            }
            if (obj2 != null) {
                toUpperCase = context.getResources().getText(C0164R.string.close_friends_badge_label);
                spannableStringBuilder.append(" • ");
                spannableStringBuilder.append(toUpperCase);
            }
            if (obj != null) {
                AnonymousClass0tx anonymousClass0tx = anonymousClass0m32.HB;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(anonymousClass0P72.getId());
                stringBuilder.append(anonymousClass0tx.m8206A());
                String stringBuilder2 = stringBuilder.toString();
                CharSequence charSequence2 = (CharSequence) anonymousClass0jM.f9125L.get(stringBuilder2);
                if (charSequence2 == null) {
                    Context context3 = anonymousClass0jM.f9117D;
                    charSequence2 = new SpannableStringBuilder();
                    switch (anonymousClass0tx.ordinal()) {
                        case 0:
                            charSequence2.append(context3.getString(C0164R.string.see_translation));
                            break;
                        case 1:
                            charSequence2.append(context3.getString(C0164R.string.see_original));
                            break;
                        case 2:
                            charSequence2.append(context3.getString(C0164R.string.loading_translation));
                            break;
                        default:
                            break;
                    }
                    if (anonymousClass0tx != AnonymousClass0tx.Loading) {
                        charSequence2.setSpan(new AnonymousClass0yM(false, AnonymousClass0G5.m1723D(context3, C0164R.attr.textColorBoldLink), anonymousClass0P72), 0, charSequence2.length(), 33);
                    }
                    anonymousClass0jM.f9125L.put(stringBuilder2, charSequence2);
                }
                AnonymousClass0pa.m7870B(spannableStringBuilder, charSequence2);
            }
            if (anonymousClass0P72.hC) {
                AnonymousClass0pa.m7870B(spannableStringBuilder, anonymousClass0P72.f4045t);
            }
        } else {
            AnonymousClass0pa.m7870B(spannableStringBuilder, anonymousClass0P72.WB);
        }
        AnonymousClass0pb anonymousClass0pb2 = anonymousClass0pb;
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            if (anonymousClass0pb2.f10667B == null) {
                anonymousClass0pb2.f10667B = (TextView) anonymousClass0pb2.f10668C.inflate();
            }
            anonymousClass0pb2.f10667B.setText(spannableStringBuilder);
            anonymousClass0pb2.f10667B.setMovementMethod(LinkMovementMethod.getInstance());
            if (obj != null) {
                AnonymousClass0Nm.m3448a(anonymousClass0pb2.f10667B, r3.f10529B);
            } else {
                AnonymousClass0Nm.m3448a(anonymousClass0pb2.f10667B, 0);
            }
            anonymousClass0pb2.f10667B.setVisibility(0);
        } else if (anonymousClass0pb2.f10667B != null) {
            anonymousClass0pb2.f10667B.setVisibility(8);
        }
    }

    /* renamed from: B */
    public static View m7803B(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.row_feed_label_below_comments, viewGroup, false);
        inflate.setTag(new AnonymousClass0pb(inflate));
        return inflate;
    }
}
