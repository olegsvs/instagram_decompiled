package X;

import android.text.TextUtils;
import android.widget.Toast;
import com.facebook.C0164R;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: X.60M */
public final class AnonymousClass60M extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass60N f70800B;

    public AnonymousClass60M(AnonymousClass60N anonymousClass60N) {
        this.f70800B = anonymousClass60N;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        CharSequence A;
        int I = AnonymousClass0cQ.I(this, 236601689);
        super.onFail(anonymousClass0Q6);
        this.f70800B.f70803D.f62383C = true;
        String string = this.f70800B.getString(C0164R.string.request_error);
        if (anonymousClass0Q6.B()) {
            A = ((AnonymousClass5zO) anonymousClass0Q6.f4288C).A();
            if (!TextUtils.isEmpty(A)) {
                Toast.makeText(this.f70800B.getActivity(), A, 1).show();
                AnonymousClass0cQ.H(this, 2000566987, I);
            }
        }
        A = string;
        Toast.makeText(this.f70800B.getActivity(), A, 1).show();
        AnonymousClass0cQ.H(this, 2000566987, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -425895876);
        super.onFinish();
        this.f70800B.f70803D.f62384D = false;
        AnonymousClass0cQ.H(this, -1656728019, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 895713204);
        super.onStart();
        this.f70800B.f70803D.f62384D = true;
        AnonymousClass0cQ.H(this, 2092586999, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int I = AnonymousClass0cQ.I(this, 1453761396);
        AnonymousClass5zO anonymousClass5zO = (AnonymousClass5zO) obj;
        int I2 = AnonymousClass0cQ.I(this, -400814203);
        super.onSuccess(anonymousClass5zO);
        AnonymousClass5zi anonymousClass5zi = this.f70800B.f70804E;
        for (Entry entry : anonymousClass5zO.f70690C.entrySet()) {
            String str2 = (String) entry.getKey();
            ((List) anonymousClass5zi.f70709C.get(str2)).addAll((Collection) anonymousClass5zO.f70691D.get(str2));
            anonymousClass5zi.f70708B.put(str2, entry.getValue());
        }
        AnonymousClass5z9 anonymousClass5z9 = this.f70800B.f70805F;
        AnonymousClass5zi anonymousClass5zi2 = this.f70800B.f70804E;
        anonymousClass5z9.m28716F(AnonymousClass0Ow.D((Collection) anonymousClass5zi2.f70709C.get(this.f70800B.f70802C)));
        anonymousClass5zi2 = this.f70800B.f70804E;
        AnonymousClass5zM anonymousClass5zM = (AnonymousClass5zM) anonymousClass5zi2.f70708B.get(this.f70800B.f70802C);
        AnonymousClass5LD anonymousClass5LD = this.f70800B.f70803D;
        if (anonymousClass5zM.f70685C) {
            str = null;
        } else {
            str = anonymousClass5zM.f70684B;
        }
        anonymousClass5LD.f62385E = str;
        AnonymousClass0cQ.H(this, -147785566, I2);
        AnonymousClass0cQ.H(this, -1632614760, I);
    }
}
