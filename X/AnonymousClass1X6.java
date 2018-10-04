package X;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;

/* renamed from: X.1X6 */
public abstract class AnonymousClass1X6 implements InputFilter {
    /* renamed from: B */
    public final Context f19680B;

    /* renamed from: A */
    public abstract String m11753A(char c);

    /* renamed from: B */
    public abstract String m11754B();

    /* renamed from: C */
    public abstract boolean m11755C(char c);

    public AnonymousClass1X6(Context context) {
        this.f19680B = context;
    }

    /* renamed from: D */
    public void m11756D(String str) {
        AnonymousClass0IG.m2167I(str);
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequence, i, i2);
        if (charSequence instanceof Spanned) {
            TextUtils.copySpansFrom((Spanned) charSequence, i5, i6, Object.class, spannableStringBuilder, 0);
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i2 - i; i9++) {
            char charAt = charSequence.charAt(i9 + i);
            if (!m11755C(charAt)) {
                int i10 = i9 + i8;
                CharSequence A = m11753A(charAt);
                spannableStringBuilder.replace(i10, i10 + 1, A);
                i10 = 1;
                i8 += A.length() - 1;
                if (i7 == 0) {
                    if (!TextUtils.isEmpty(A)) {
                        i10 = 0;
                    }
                }
                i7 = i10;
            }
        }
        if (i7 != 0) {
            m11756D(m11754B());
        }
        return spannableStringBuilder;
    }
}
