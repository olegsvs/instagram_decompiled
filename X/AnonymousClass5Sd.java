package X;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5Sd */
public final class AnonymousClass5Sd implements AnonymousClass27f {
    /* renamed from: B */
    public final AnonymousClass4Ju f64035B;
    /* renamed from: C */
    public final int f64036C;
    /* renamed from: D */
    private final AnonymousClass4Js f64037D;
    /* renamed from: E */
    private final Set f64038E;
    /* renamed from: F */
    private final int f64039F;
    /* renamed from: G */
    private final AnonymousClass1oG f64040G;
    /* renamed from: H */
    private final AnonymousClass3BD f64041H;
    /* renamed from: I */
    private final RecyclerView f64042I;
    /* renamed from: J */
    private final AnonymousClass2Uf f64043J;

    public final void close() {
    }

    public final String getModuleName() {
        return "story-sticker-gallery";
    }

    public final void hd() {
    }

    public final void id() {
    }

    public final boolean mU() {
        return false;
    }

    public AnonymousClass5Sd(Context context, AnonymousClass0Fz anonymousClass0Fz, ViewGroup viewGroup, AnonymousClass4Ju anonymousClass4Ju, int i) {
        View findViewById = viewGroup.findViewById(C0164R.id.gallery_sticker_grid_container);
        Context context2 = context;
        Resources resources = context.getResources();
        this.f64036C = resources.getDimensionPixelSize(C0164R.dimen.gallery_sticker_grid_item_padding);
        int J = (AnonymousClass0Nm.J(context) - (this.f64036C * 2)) / 3;
        int round = Math.round(((float) J) / AnonymousClass0Nm.H(resources.getDisplayMetrics()));
        this.f64043J = new AnonymousClass2Uf(context2, J, round, AnonymousClass25A.f25726B, false, true);
        AnonymousClass0nJ anonymousClass4Js = new AnonymousClass4Js(this.f64043J, this, round);
        this.f64037D = anonymousClass4Js;
        anonymousClass4Js.O(true);
        this.f64040G = new AnonymousClass1oG(context, 3);
        this.f64041H = new AnonymousClass3BD(new AnonymousClass3BE(anonymousClass0Fz, this.f64043J).A(), this.f64037D, context);
        findViewById.findViewById(C0164R.id.gallery_sticker_grid_empty_text);
        findViewById.findViewById(C0164R.id.gallery_sticker_grid_loading_spinner);
        RecyclerView recyclerView = (RecyclerView) findViewById.findViewById(C0164R.id.gallery_sticker_grid_recycler_view);
        this.f64042I = recyclerView;
        recyclerView.setAdapter(this.f64037D);
        this.f64042I.setLayoutManager(this.f64040G);
        this.f64042I.A(new AnonymousClass4Jt(this));
        this.f64042I.setOverScrollMode(2);
        this.f64035B = anonymousClass4Ju;
        this.f64039F = i;
        Set hashSet = new HashSet();
        this.f64038E = hashSet;
        hashSet.add(findViewById);
    }

    public final boolean UY() {
        return AnonymousClass2MP.B(this.f64040G);
    }

    public final boolean VY() {
        return AnonymousClass2MP.C(this.f64040G);
    }

    public final Set bI() {
        return this.f64038E;
    }

    public final int qI() {
        return this.f64039F;
    }

    public final void vGA() {
        this.f64041H.B();
    }
}
