package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.3bv */
public final class AnonymousClass3bv implements OnPreDrawListener {
    /* renamed from: B */
    public final /* synthetic */ String f42678B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass16W f42679C;

    public AnonymousClass3bv(AnonymousClass16W anonymousClass16W, String str) {
        this.f42679C = anonymousClass16W;
        this.f42678B = str;
    }

    public final boolean onPreDraw() {
        this.f42679C.f14555G.getViewTreeObserver().removeOnPreDrawListener(this);
        TextView textView = this.f42679C.f14555G;
        TextView textView2 = this.f42679C.f14555G;
        CharSequence charSequence = this.f42678B;
        Context context = textView2.getContext();
        Drawable mutate = ((BitmapDrawable) AnonymousClass0Ca.E(context, C0164R.drawable.verified_profile)).mutate();
        int i = 0;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate.setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(context, C0164R.color.blue_5)));
        float E = AnonymousClass0Nm.E(context.getResources().getDisplayMetrics(), 2);
        CharSequence charSequence2 = charSequence;
        CharSequence ellipsize = TextUtils.ellipsize(charSequence2, textView2.getPaint(), (((float) textView2.getWidth()) - E) - ((float) mutate.getIntrinsicWidth()), TruncateAt.END, false, null);
        CharSequence valueOf = SpannableStringBuilder.valueOf(ellipsize);
        valueOf.append(" ");
        AnonymousClass2JU anonymousClass2JU = new AnonymousClass2JU(mutate);
        if (ellipsize.length() >= charSequence.length()) {
            i = (int) E;
        }
        anonymousClass2JU.f28822C = i;
        valueOf.setSpan(anonymousClass2JU, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        return true;
    }
}
