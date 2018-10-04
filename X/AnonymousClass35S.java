package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.35S */
public final class AnonymousClass35S extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f37693B;
    /* renamed from: C */
    private final AnonymousClass35P f37694C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass35S(Context context, AnonymousClass35P anonymousClass35P) {
        this.f37693B = context;
        this.f37694C = anonymousClass35P;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1811774513);
        if (view == null) {
            view = (TextView) LayoutInflater.from(this.f37693B).inflate(C0164R.layout.aggregated_engagement_view, viewGroup, false);
            view.setMovementMethod(LinkMovementMethod.getInstance());
        }
        AnonymousClass35R anonymousClass35R = (AnonymousClass35R) obj;
        TextView textView = (TextView) view;
        Integer num = anonymousClass35R.f37690B;
        String str = anonymousClass35R.f37692D;
        int i2 = anonymousClass35R.f37691C.f37689B;
        AnonymousClass35P anonymousClass35P = this.f37694C;
        Context context = textView.getContext();
        int intValue = num.intValue();
        Resources resources = context.getResources();
        CharSequence spannableString = new SpannableString(resources.getString(C0164R.string.original_post));
        spannableString.setSpan(new AnonymousClass35O(anonymousClass35P, str, context), 0, spannableString.length(), 18);
        Object quantityString = resources.getQuantityString(i2, intValue, new Object[]{Integer.valueOf(intValue)});
        CharSequence spannableStringBuilder = new SpannableStringBuilder(quantityString);
        int indexOf = quantityString.indexOf("{original_post}");
        spannableStringBuilder.replace(indexOf, 15 + indexOf, spannableString);
        textView.setText(spannableStringBuilder);
        AnonymousClass0cQ.H(this, 1792466112, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass35R anonymousClass35R = (AnonymousClass35R) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
