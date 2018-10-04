package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.switchbutton.IgSwitch;
import java.io.File;

/* renamed from: X.67b */
public final class AnonymousClass67b {
    /* renamed from: B */
    public ListView f71987B;
    /* renamed from: C */
    public LinearLayout f71988C;
    /* renamed from: D */
    public TextView f71989D;
    /* renamed from: E */
    public View f71990E;
    /* renamed from: F */
    public final ViewStub f71991F;
    /* renamed from: G */
    public TextView f71992G;
    /* renamed from: H */
    public final AnonymousClass0IJ f71993H;
    /* renamed from: I */
    public AnonymousClass6G8 f71994I;
    /* renamed from: J */
    public File f71995J;
    /* renamed from: K */
    public View f71996K;
    /* renamed from: L */
    public IgSwitch f71997L;
    /* renamed from: M */
    public View f71998M;
    /* renamed from: N */
    public File f71999N;
    /* renamed from: O */
    public final AnonymousClass0Cm f72000O;
    /* renamed from: P */
    public boolean f72001P;
    /* renamed from: Q */
    public AnonymousClass5MC f72002Q;
    /* renamed from: R */
    public View f72003R;
    /* renamed from: S */
    private final ViewStub f72004S;

    public AnonymousClass67b(AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0Cm anonymousClass0Cm, View view) {
        this.f71993H = anonymousClass0IJ;
        this.f72000O = anonymousClass0Cm;
        this.f71991F = (ViewStub) view.findViewById(C0164R.id.iglive_capture_end_stub);
        this.f72004S = (ViewStub) view.findViewById(C0164R.id.iglive_capture_rights_manager_end_screen_stub);
    }

    /* renamed from: A */
    public final void m29108A(AnonymousClass6Fy anonymousClass6Fy) {
        Context context = this.f71993H.getContext();
        CharSequence string = context.getString(C0164R.string.live_broadcast_end_dialog_confirm);
        String string2 = context.getString(C0164R.string.cancel);
        CharSequence[] charSequenceArr = new CharSequence[]{string, string2};
        new AnonymousClass0Sb(context).G(charSequenceArr, new AnonymousClass67R(this, charSequenceArr, string, anonymousClass6Fy)).E(true).F(true).C().show();
    }

    /* renamed from: B */
    public static void m29105B(AnonymousClass67b anonymousClass67b, int i) {
        Context context = anonymousClass67b.f71993H.getContext();
        CharSequence string = context.getString(i);
        View inflate = anonymousClass67b.f72004S.inflate();
        TextView textView = (TextView) inflate.findViewById(C0164R.id.body);
        View findViewById = inflate.findViewById(C0164R.id.finish_button);
        findViewById.getLayoutParams().width = AnonymousClass0Nm.J(context) / 2;
        findViewById.findViewById(C0164R.id.finish_button).setOnClickListener(new AnonymousClass67S(anonymousClass67b));
        textView.setText(string);
    }

    /* renamed from: C */
    public static void m29106C(AnonymousClass67b anonymousClass67b, boolean z) {
        anonymousClass67b.f71989D.setText(anonymousClass67b.f71993H.getString(z ? C0164R.string.share : C0164R.string.iglive_discard));
    }

    /* renamed from: D */
    public static void m29107D(AnonymousClass67b anonymousClass67b, boolean z) {
        if (!z) {
            anonymousClass67b.f71996K = anonymousClass67b.f71990E.findViewById(C0164R.id.iglive_replay_description);
            anonymousClass67b.f71997L = (IgSwitch) anonymousClass67b.f71990E.findViewById(C0164R.id.iglive_replay_switch);
            AnonymousClass67b.m29106C(anonymousClass67b, true);
            anonymousClass67b.f71997L.setChecked(true);
            anonymousClass67b.f71997L.setToggleListener(new AnonymousClass67V(anonymousClass67b));
            anonymousClass67b.f71990E.findViewById(C0164R.id.iglive_broadcast_end_message).setVisibility(8);
            anonymousClass67b.f71989D.setVisibility(0);
            anonymousClass67b.f71996K.setVisibility(0);
            anonymousClass67b.f71997L.setVisibility(0);
        }
    }
}
