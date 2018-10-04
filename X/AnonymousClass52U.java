package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.52U */
public final class AnonymousClass52U extends AnonymousClass0nJ {
    /* renamed from: B */
    public final AnonymousClass3Kj f59458B;
    /* renamed from: C */
    public List f59459C;
    /* renamed from: D */
    private final Context f59460D;
    /* renamed from: E */
    private AnonymousClass52W f59461E;

    public AnonymousClass52U(Context context, List list, AnonymousClass52W anonymousClass52W, AnonymousClass3Kj anonymousClass3Kj) {
        this.f59460D = context;
        this.f59459C = list;
        this.f59461E = anonymousClass52W;
        this.f59458B = anonymousClass3Kj;
    }

    /* renamed from: B */
    public final int m25615B() {
        return this.f59459C.size();
    }

    /* renamed from: I */
    public final void m25616I(AnonymousClass0oo anonymousClass0oo, int i) {
        int i2;
        TextView textView;
        AnonymousClass3Kk anonymousClass3Kk = (AnonymousClass3Kk) this.f59459C.get(i);
        if (getItemViewType(i) == 1) {
            AnonymousClass52T anonymousClass52T = (AnonymousClass52T) anonymousClass0oo;
            anonymousClass52T.f59456B.setUrl(anonymousClass3Kk.f40224D);
            anonymousClass52T.f59457C.setText(anonymousClass3Kk.f40225E);
            i2 = 8;
            anonymousClass52T.f59456B.setVisibility(anonymousClass3Kk.f40226F == null ? 8 : 0);
            textView = anonymousClass52T.f59457C;
            if (anonymousClass3Kk.f40227G != null) {
                i2 = 0;
            }
        } else {
            AnonymousClass52S anonymousClass52S = (AnonymousClass52S) anonymousClass0oo;
            AnonymousClass52W anonymousClass52W = this.f59461E;
            anonymousClass52S.f59453C.setUrl(anonymousClass3Kk.f40226F);
            anonymousClass52S.f59455E.setText(anonymousClass3Kk.f40228H);
            anonymousClass52S.f59454D.setText(anonymousClass3Kk.f40227G);
            anonymousClass52S.f59452B.setText(anonymousClass3Kk.f40223C);
            anonymousClass52S.f59452B.setOnClickListener(new AnonymousClass52R(anonymousClass52W, anonymousClass3Kk));
            i2 = 8;
            anonymousClass52S.f59453C.setVisibility(anonymousClass3Kk.f40226F == null ? 8 : 0);
            anonymousClass52S.f59455E.setVisibility(anonymousClass3Kk.f40228H == null ? 8 : 0);
            anonymousClass52S.f59454D.setVisibility(anonymousClass3Kk.f40227G == null ? 8 : 0);
            textView = anonymousClass52S.f59452B;
            if (anonymousClass3Kk.f40223C != null) {
                i2 = 0;
            }
        }
        textView.setVisibility(i2);
    }

    /* renamed from: J */
    public final AnonymousClass0oo m25617J(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f59460D).inflate(C0164R.layout.activators_row_card, viewGroup, false);
        if (i == 1) {
            return new AnonymousClass52T(inflate);
        }
        return new AnonymousClass52S(inflate);
    }

    public final int getItemViewType(int i) {
        return this.f59458B.A(((AnonymousClass3Kk) this.f59459C.get(i)).f40222B) ? 1 : 0;
    }
}
