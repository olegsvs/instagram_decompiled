package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.BlockButton;
import com.instagram.user.follow.UpdatableButton;

/* renamed from: X.4EL */
public final class AnonymousClass4EL extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f51778B;
    /* renamed from: C */
    private final AnonymousClass5S1 f51779C;
    /* renamed from: D */
    private final AnonymousClass0Cm f51780D;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4EL(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5S1 anonymousClass5S1) {
        this.f51778B = context;
        this.f51780D = anonymousClass0Cm;
        this.f51779C = anonymousClass5S1;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        AnonymousClass4Ei anonymousClass4Ei;
        CharSequence charSequence;
        int I = AnonymousClass0cQ.I(this, 827061777);
        if (view == null) {
            Context context = this.f51778B;
            view = (ViewGroup) LayoutInflater.from(context).inflate(C0164R.layout.row_search_user_with_block_button, viewGroup, false);
            anonymousClass4Ei = new AnonymousClass4Ei();
            anonymousClass4Ei.f51856F = view;
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(C0164R.id.row_search_user_with_block_button_container);
            anonymousClass4Ei.f51854D = (CircularImageView) view.findViewById(C0164R.id.row_search_user_imageview);
            anonymousClass4Ei.f51853C = (TextView) view.findViewById(C0164R.id.row_search_user_fullname);
            anonymousClass4Ei.f51855E = (TextView) view.findViewById(C0164R.id.row_search_user_username);
            anonymousClass4Ei.f51852B = (BlockButton) view.findViewById(C0164R.id.block_button);
            anonymousClass4Ei.f51855E.getPaint().setFakeBoldText(true);
            context.getResources().getDimensionPixelOffset(C0164R.dimen.search_row_padding);
            view.setTag(anonymousClass4Ei);
        }
        AnonymousClass0Cm anonymousClass0Cm = this.f51780D;
        anonymousClass4Ei = (AnonymousClass4Ei) view.getTag();
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj;
        boolean z = ((AnonymousClass41g) obj2).f48516B;
        AnonymousClass5S1 anonymousClass5S1 = this.f51779C;
        anonymousClass4Ei.f51854D.setUrl(anonymousClass0Ci.DQ());
        TextView textView = anonymousClass4Ei.f51853C;
        if (TextUtils.isEmpty(anonymousClass0Ci.f1743l)) {
            charSequence = anonymousClass0Ci.f1757z;
        } else {
            charSequence = anonymousClass0Ci.f1743l;
        }
        textView.setText(charSequence);
        anonymousClass4Ei.f51855E.setText(anonymousClass0Ci.uT());
        AnonymousClass15G.C(anonymousClass4Ei.f51855E, anonymousClass0Ci.u());
        UpdatableButton updatableButton = anonymousClass4Ei.f51852B;
        if (AnonymousClass0Co.D(anonymousClass0Cm, anonymousClass0Ci)) {
            updatableButton.setVisibility(8);
        } else {
            updatableButton.f44114B = z;
            updatableButton.setBlueButton(updatableButton.f44114B ^ 1);
            updatableButton.refreshDrawableState();
            updatableButton.setVisibility(0);
            BlockButton.m20583C(updatableButton, anonymousClass0Ci);
            updatableButton.setOnClickListener(new AnonymousClass3kz(updatableButton, anonymousClass0Ci, anonymousClass5S1));
        }
        anonymousClass4Ei.f51856F.setTag(anonymousClass4Ei);
        AnonymousClass0cQ.H(this, 884422278, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj;
        AnonymousClass41g anonymousClass41g = (AnonymousClass41g) obj2;
        anonymousClass0p9.A(0);
    }
}
