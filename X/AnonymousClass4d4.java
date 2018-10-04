package X;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.4d4 */
public final class AnonymousClass4d4 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5VW f55807B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0HV f55808C;

    public AnonymousClass4d4(AnonymousClass0HV anonymousClass0HV, AnonymousClass5VW anonymousClass5VW) {
        this.f55808C = anonymousClass0HV;
        this.f55807B = anonymousClass5VW;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1504852582);
        this.f55808C.f2646B.edit().putBoolean("direct_thread_video_call_icon_tapped", true).apply();
        AnonymousClass5VW anonymousClass5VW = this.f55807B;
        Context context = anonymousClass5VW.f65333B.getContext();
        if (!new AnonymousClass0Nr(context).B(false)) {
            new AnonymousClass0Sb(context).Q(C0164R.string.videocall_error_no_connection_title).H(C0164R.string.videocall_error_no_connection_message).O(C0164R.string.ok, null).C().show();
        } else if (anonymousClass5VW.f65333B.f65377j != null) {
            AnonymousClass0WA.C(anonymousClass5VW.f65333B.getContext(), anonymousClass5VW.f65333B.f65382o, anonymousClass5VW.f65333B.f65377j, anonymousClass5VW.f65333B.f65377j.O(), anonymousClass5VW.f65333B, "direct_vc_icon");
        }
        AnonymousClass0cQ.L(this, -1824993578, M);
    }
}
