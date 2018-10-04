package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.Collections;

/* renamed from: X.4E2 */
public final class AnonymousClass4E2 implements AnonymousClass0nn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4E3 f51726B;

    public final void Hr(AnonymousClass0fq anonymousClass0fq) {
    }

    public final void Jr() {
    }

    public AnonymousClass4E2(AnonymousClass4E3 anonymousClass4E3) {
        this.f51726B = anonymousClass4E3;
    }

    public final void Gr(AnonymousClass0Q6 anonymousClass0Q6) {
        Toast.makeText(this.f51726B.getActivity(), C0164R.string.could_not_refresh_feed, 0).show();
    }

    public final void Ir() {
        ((RefreshableListView) this.f51726B.getListView()).setIsLoading(false);
    }

    public final /* bridge */ /* synthetic */ void Kr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass0ft anonymousClass0ft = (AnonymousClass0ft) anonymousClass0Pn;
        boolean z = true;
        if (anonymousClass0ft.f8015E.size() != 1) {
            z = false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid number of items in response for PromotionPreviewFragment, size::");
        stringBuilder.append(anonymousClass0ft.f8015E.size());
        AnonymousClass0LH.I(z, stringBuilder.toString());
        AnonymousClass0P7 B = AnonymousClass4E3.m23609B(this.f51726B, (AnonymousClass0P7) anonymousClass0ft.f8015E.get(0));
        AnonymousClass1bN anonymousClass1bN = this.f51726B.f51727B;
        anonymousClass1bN.f20441C.D();
        anonymousClass1bN.f20443E.clear();
        AnonymousClass1bN.B(anonymousClass1bN);
        this.f51726B.f51727B.RO(B).f9715x = AnonymousClass0a4.PROMOTION_PREVIEW;
        this.f51726B.f51727B.F(Collections.singletonList(B));
    }

    public final void Lr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass0ft anonymousClass0ft = (AnonymousClass0ft) anonymousClass0Pn;
    }
}
