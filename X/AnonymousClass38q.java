package X;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.38q */
public final class AnonymousClass38q extends AnonymousClass0VA {
    /* renamed from: B */
    public AnonymousClass0ts f38288B;
    /* renamed from: C */
    public int f38289C = 0;
    /* renamed from: D */
    public final List f38290D;
    /* renamed from: E */
    private final AnonymousClass0Gv f38291E = new AnonymousClass38o(this);
    /* renamed from: F */
    private RecyclerView f38292F;

    public final void St() {
    }

    public final void ei() {
    }

    public final void gx() {
    }

    public final void oh() {
    }

    public AnonymousClass38q(Context context, RecyclerView recyclerView) {
        this.f38292F = recyclerView;
        List arrayList = new ArrayList();
        this.f38290D = arrayList;
        arrayList.add(new AnonymousClass38p(this, 3, context));
    }

    public final void gi() {
        this.f38288B.A();
        this.f38292F.BA(this.f38291E);
        this.f38288B = null;
    }

    public final void wh(View view) {
        this.f38288B = new AnonymousClass0ts(view.getContext());
        ((ViewGroup) view).addView(this.f38288B, new LayoutParams(1, 1));
        this.f38288B.setVisibility(8);
        this.f38292F.D(this.f38291E);
    }
}
