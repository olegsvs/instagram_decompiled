package X;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: X.2Hb */
public final class AnonymousClass2Hb implements OnItemClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Sb f28550B;
    /* renamed from: C */
    public final /* synthetic */ OnClickListener f28551C;

    public AnonymousClass2Hb(AnonymousClass0Sb anonymousClass0Sb, OnClickListener onClickListener) {
        this.f28550B = anonymousClass0Sb;
        this.f28551C = onClickListener;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        OnClickListener onClickListener = this.f28551C;
        if (onClickListener != null) {
            onClickListener.onClick(this.f28550B.f4940D, i);
        }
        this.f28550B.f4940D.dismiss();
    }
}
