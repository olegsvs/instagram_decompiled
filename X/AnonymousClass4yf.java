package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.4yf */
public final class AnonymousClass4yf implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4yo f59035B;

    public AnonymousClass4yf(AnonymousClass4yo anonymousClass4yo) {
        this.f59035B = anonymousClass4yo;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -502860094);
        AnonymousClass0IL anonymousClass0IL = this.f59035B;
        AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(anonymousClass0IL.getContext());
        Context activity = anonymousClass0IL.getActivity();
        CharSequence[] charSequenceArr = new CharSequence[2];
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(activity.getResources().getString(C0164R.string.related_business_report));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass0Ca.C(activity, C0164R.color.red_4)), 0, spannableStringBuilder.length(), 18);
        charSequenceArr[0] = spannableStringBuilder;
        charSequenceArr[1] = activity.getString(C0164R.string.cancel);
        anonymousClass0Sb.G(charSequenceArr, new AnonymousClass4yn(anonymousClass0IL)).E(true).F(true).Q(C0164R.string.related_business_report_title).C().show();
        AnonymousClass0cQ.L(this, 2066612138, M);
    }
}
