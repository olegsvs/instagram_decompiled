package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: X.3hw */
public final class AnonymousClass3hw implements OnItemClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3i1 f43493B;

    public AnonymousClass3hw(AnonymousClass3i1 anonymousClass3i1) {
        this.f43493B = anonymousClass3i1;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if ("TAG_ROW_FOOTER_SEARCH".equals(view.getTag())) {
            AnonymousClass3i1 anonymousClass3i1 = this.f43493B;
            anonymousClass3i1.m20466b(anonymousClass3i1.f43505I.getStrippedText().toString());
            this.f43493B.f43505I.B();
        }
    }
}
