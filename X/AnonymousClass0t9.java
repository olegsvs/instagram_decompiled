package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.0t9 */
public final class AnonymousClass0t9 extends BaseAdapter implements ListAdapter {
    /* renamed from: B */
    public boolean f11603B;
    /* renamed from: C */
    public AnonymousClass0mw f11604C;
    /* renamed from: D */
    public boolean f11605D;
    /* renamed from: E */
    private Context f11606E;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public AnonymousClass0t9(Context context, AnonymousClass0mw anonymousClass0mw, boolean z, boolean z2) {
        this.f11606E = context;
        this.f11604C = anonymousClass0mw;
        this.f11605D = z;
        this.f11603B = z2;
    }

    public final int getCount() {
        return this.f11604C.f9944H.size();
    }

    public final Object getItem(int i) {
        return this.f11604C.f9944H.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f11606E).inflate(C0164R.layout.question_answer_row_view, viewGroup, false);
            AnonymousClass1Wd anonymousClass1Wd = new AnonymousClass1Wd();
            anonymousClass1Wd.f19597D = (TextView) view.findViewById(C0164R.id.text);
            anonymousClass1Wd.f19596C = (RadioButton) view.findViewById(C0164R.id.button);
            anonymousClass1Wd.f19595B = view.findViewById(C0164R.id.answer_container);
            view.setTag(anonymousClass1Wd);
        }
        Context context = this.f11606E;
        AnonymousClass1Wd anonymousClass1Wd2 = (AnonymousClass1Wd) view.getTag();
        AnonymousClass0mw anonymousClass0mw = this.f11604C;
        boolean z = this.f11605D;
        boolean z2 = this.f11603B;
        AnonymousClass3QR anonymousClass3QR = (AnonymousClass3QR) anonymousClass0mw.f9944H.get(i);
        anonymousClass1Wd2.f19597D.setText(anonymousClass3QR.f41150F);
        if (z || anonymousClass0mw.m7574C()) {
            anonymousClass1Wd2.f19596C.setVisibility(0);
            anonymousClass1Wd2.f19596C.setChecked(anonymousClass3QR.f41147C);
        }
        if (z2) {
            anonymousClass1Wd2.f19595B.setBackground(AnonymousClass0Ca.m939E(context, C0164R.drawable.grey_answer_row_background));
        } else {
            anonymousClass1Wd2.f19595B.setBackground(AnonymousClass0Ca.m939E(context, C0164R.drawable.white_answer_row_background));
        }
        return view;
    }
}
