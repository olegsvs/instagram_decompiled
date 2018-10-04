package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.save.model.SavedCollection;
import com.instagram.save.ui.collections.SavedCollectionThumbnailView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5xl */
public final class AnonymousClass5xl extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f70383B;
    /* renamed from: C */
    public final AnonymousClass3dJ f70384C;
    /* renamed from: D */
    public final AnonymousClass0jC f70385D;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5xl(Context context, AnonymousClass3dJ anonymousClass3dJ, AnonymousClass0jC anonymousClass0jC) {
        this.f70383B = context;
        this.f70384C = anonymousClass3dJ;
        this.f70385D = anonymousClass0jC;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int C;
        int i2;
        Object obj3 = obj2;
        View view2 = view;
        Object obj4 = obj;
        int I = AnonymousClass0cQ.I(this, -1770288807);
        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) obj4;
        AnonymousClass5xm anonymousClass5xm = view != null ? (AnonymousClass5xm) view2.getTag() : null;
        if (view == null || anonymousClass5xm.f70386B.length != anonymousClass2MJ.C()) {
            Context context = r2.f70383B;
            C = anonymousClass2MJ.C();
            view2 = new LinearLayout(context);
            AnonymousClass5xm anonymousClass5xm2 = new AnonymousClass5xm(C);
            for (i2 = 0; i2 < C; i2++) {
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(C0164R.layout.save_home_collections_saved_collection, view2, false);
                viewGroup2.setTag(new AnonymousClass5xk(viewGroup2));
                view2.addView(viewGroup2);
                anonymousClass5xm2.f70386B[i2] = (AnonymousClass5xk) viewGroup2.getTag();
            }
            view2.setTag(anonymousClass5xm2);
        }
        AnonymousClass2Gh anonymousClass2Gh = (AnonymousClass2Gh) obj3;
        int I2 = AnonymousClass0cQ.I(r2, 1344773536);
        Context context2 = r2.f70383B;
        AnonymousClass5xm anonymousClass5xm3 = (AnonymousClass5xm) view2.getTag();
        AnonymousClass3dJ anonymousClass3dJ = r2.f70384C;
        AnonymousClass0jC anonymousClass0jC = r2.f70385D;
        i2 = AnonymousClass3dO.F(context2, true);
        int i3 = 0;
        while (i3 < anonymousClass5xm3.f70386B.length) {
            LayoutParams layoutParams = (LayoutParams) anonymousClass5xm3.f70386B[i3].f70382E.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = -2;
            AnonymousClass3dO.D(context2, layoutParams, i3 == 0, anonymousClass2Gh == AnonymousClass2Gh.LAST, true);
            anonymousClass5xm3.f70386B[i3].f70382E.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = (LayoutParams) anonymousClass5xm3.f70386B[i3].f70381D.getLayoutParams();
            layoutParams2.width = i2;
            layoutParams2.height = i2;
            anonymousClass5xm3.f70386B[i3].f70381D.setLayoutParams(layoutParams2);
            AnonymousClass5xk anonymousClass5xk = anonymousClass5xm3.f70386B[i3];
            SavedCollection savedCollection = (SavedCollection) anonymousClass2MJ.A(i3);
            anonymousClass5xk.f70382E.setVisibility(0);
            anonymousClass5xk.f70379B.setText(savedCollection.f12481C);
            SavedCollectionThumbnailView savedCollectionThumbnailView = anonymousClass5xk.f70381D;
            List F;
            int min;
            switch (AnonymousClass5z3.f70609B[savedCollection.f12485G.ordinal()]) {
                case 1:
                    savedCollectionThumbnailView.f70611C.D(8);
                    SavedCollectionThumbnailView.m28711B(savedCollectionThumbnailView);
                    savedCollectionThumbnailView.f70612D.D(0);
                    F = savedCollection.F();
                    AnonymousClass0LH.E(savedCollectionThumbnailView.f70610B);
                    min = Math.min(F.size(), savedCollectionThumbnailView.f70610B.size());
                    for (C = 0; C < min; C++) {
                        SavedCollectionThumbnailView.setImageForMedia(anonymousClass0jC, (AnonymousClass0P7) F.get(C), ((AnonymousClass0P7) F.get(C)).x(context2), (IgImageView) savedCollectionThumbnailView.f70610B.get(C));
                    }
                    break;
                case 2:
                    savedCollectionThumbnailView.f70611C.D(8);
                    SavedCollectionThumbnailView.m28711B(savedCollectionThumbnailView);
                    savedCollectionThumbnailView.f70612D.D(0);
                    F = Collections.unmodifiableList(savedCollection.f12484F);
                    min = Math.min(F.size(), savedCollectionThumbnailView.f70610B.size());
                    for (C = 0; C < min; C++) {
                        ((IgImageView) savedCollectionThumbnailView.f70610B.get(C)).setUrl(((AnonymousClass2EX) F.get(C)).f27873B.C(context2));
                    }
                    break;
                default:
                    savedCollectionThumbnailView.f70612D.D(8);
                    Context context3 = context2;
                    if (savedCollection.G(context3) != null) {
                        SavedCollectionThumbnailView.setImageForMedia(anonymousClass0jC, savedCollection.f12482D, savedCollection.G(context3), (IgImageView) savedCollectionThumbnailView.f70611C.A());
                    } else {
                        IgImageView igImageView = (IgImageView) savedCollectionThumbnailView.f70611C.A();
                        igImageView.setImageURI(null);
                        igImageView.setImageDrawable(null);
                        igImageView.setOnLoadListener(null);
                        igImageView.setOnFallbackListener(null);
                    }
                    savedCollectionThumbnailView.f70611C.D(0);
                    break;
            }
            if (savedCollection.f12485G == AnonymousClass3dX.f42903G) {
                anonymousClass5xk.f70380C.D(0);
                ((IgImageView) anonymousClass5xk.f70380C.A()).setImageResource(C0164R.drawable.instagram_shopping_filled_24);
            } else {
                anonymousClass5xk.f70380C.D(8);
            }
            anonymousClass5xk.f70382E.setOnClickListener(new AnonymousClass5xi(anonymousClass3dJ, savedCollection));
            anonymousClass5xk.f70382E.setOnTouchListener(new AnonymousClass5xj(anonymousClass5xk));
            i3++;
        }
        AnonymousClass0cQ.H(r2, -2018815786, I2);
        AnonymousClass0cQ.H(r2, 1597215250, I);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        anonymousClass0p9.B(0, (AnonymousClass2MJ) obj, (AnonymousClass2Gh) obj2);
    }
}
