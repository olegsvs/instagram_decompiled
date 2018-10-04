package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0164R;
import java.util.ArrayList;

/* renamed from: X.1Xt */
public final class AnonymousClass1Xt {
    /* renamed from: B */
    public Context f19889B;
    /* renamed from: C */
    public AnonymousClass0x4 f19890C;
    /* renamed from: D */
    public AnonymousClass0r1 f19891D;
    /* renamed from: E */
    public AnonymousClass0r2 f19892E;
    /* renamed from: F */
    private CharSequence[] f19893F;

    public AnonymousClass1Xt(Context context, AnonymousClass0r1 anonymousClass0r1, AnonymousClass0r2 anonymousClass0r2) {
        this.f19889B = context;
        this.f19891D = anonymousClass0r1;
        this.f19892E = anonymousClass0r2;
    }

    /* renamed from: B */
    public static CharSequence[] m11795B(AnonymousClass1Xt anonymousClass1Xt) {
        if (anonymousClass1Xt.f19893F == null) {
            Resources resources = anonymousClass1Xt.f19889B.getResources();
            ArrayList arrayList = new ArrayList();
            arrayList.add(resources.getString(C0164R.string.hide_this));
            CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
            anonymousClass1Xt.f19893F = charSequenceArr;
            arrayList.toArray(charSequenceArr);
        }
        return anonymousClass1Xt.f19893F;
    }
}
