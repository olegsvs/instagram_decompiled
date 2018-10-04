package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.common.gallery.GalleryItem;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4J1 */
public final class AnonymousClass4J1 extends AnonymousClass0nJ implements AnonymousClass3B6 {
    /* renamed from: B */
    public final Context f52576B;
    /* renamed from: C */
    public final ArrayList f52577C;
    /* renamed from: D */
    public final AnonymousClass4Ix f52578D = new AnonymousClass4Ix();
    /* renamed from: E */
    public final AnonymousClass24o f52579E;
    /* renamed from: F */
    public final AnonymousClass2Uf f52580F;
    /* renamed from: G */
    public final ArrayList f52581G = new ArrayList();
    /* renamed from: H */
    public final AnonymousClass4Iz f52582H;
    /* renamed from: I */
    public final int f52583I;
    /* renamed from: J */
    public final int f52584J;
    /* renamed from: K */
    public final ArrayList f52585K;
    /* renamed from: L */
    public boolean f52586L;
    /* renamed from: M */
    public GalleryItem f52587M;
    /* renamed from: N */
    public final ArrayList f52588N;
    /* renamed from: O */
    private final HashMap f52589O;
    /* renamed from: P */
    private final AnonymousClass4Ix f52590P = new AnonymousClass4Ix();
    /* renamed from: Q */
    private boolean f52591Q;
    /* renamed from: R */
    private final AnonymousClass3BH f52592R;
    /* renamed from: S */
    private final AnonymousClass3BI f52593S;

    public AnonymousClass4J1(Context context, AnonymousClass3BI anonymousClass3BI, AnonymousClass3BH anonymousClass3BH, AnonymousClass4Iz anonymousClass4Iz, AnonymousClass2Uf anonymousClass2Uf, AnonymousClass24o anonymousClass24o, int i, int i2, boolean z) {
        this.f52576B = context;
        this.f52585K = new ArrayList();
        this.f52577C = new ArrayList();
        this.f52588N = new ArrayList();
        this.f52589O = new HashMap();
        this.f52593S = anonymousClass3BI;
        this.f52582H = anonymousClass4Iz;
        this.f52586L = false;
        this.f52579E = anonymousClass24o;
        this.f52580F = anonymousClass2Uf;
        this.f52592R = anonymousClass3BH;
        this.f52583I = i;
        this.f52584J = i2;
        this.f52591Q = z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AnonymousClass0eS.MediaPickerItemView, C0164R.attr.mediaPickerItemStyle, 0);
        obtainStyledAttributes.getColor(2, Color.argb(200, 0, 0, 0));
        obtainStyledAttributes.recycle();
        O(true);
    }

    /* renamed from: B */
    public final int m23807B() {
        return this.f52581G.size();
    }

    /* renamed from: B */
    public static boolean m23800B(List list, String str) {
        for (GalleryItem A : list) {
            if (A.m14350A().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public static AnonymousClass1SE m23801C(AnonymousClass4J1 anonymousClass4J1, GalleryItem galleryItem) {
        AnonymousClass1SE anonymousClass1SE = (AnonymousClass1SE) anonymousClass4J1.f52589O.get(galleryItem.m14350A());
        if (anonymousClass1SE == null) {
            anonymousClass1SE = new AnonymousClass1SE();
            anonymousClass4J1.f52589O.put(galleryItem.m14350A(), anonymousClass1SE);
        }
        anonymousClass1SE.f18738C = anonymousClass4J1.m23812R(galleryItem);
        anonymousClass1SE.f18739D = anonymousClass4J1.m23804F(galleryItem);
        GalleryItem galleryItem2 = anonymousClass4J1.f52587M;
        boolean z = galleryItem2 != null && galleryItem2.equals(galleryItem);
        anonymousClass1SE.f18737B = z;
        return anonymousClass1SE;
    }

    /* renamed from: D */
    public static Map m23802D(List list) {
        Map hashMap = new HashMap();
        for (GalleryItem galleryItem : list) {
            hashMap.put(galleryItem.m14350A(), galleryItem);
        }
        return hashMap;
    }

    /* renamed from: E */
    public static void m23803E(AnonymousClass4J1 anonymousClass4J1) {
        if (anonymousClass4J1.f52591Q) {
            anonymousClass4J1.f52578D.f52573D = anonymousClass4J1.f52577C.size() > anonymousClass4J1.f52583I ? AnonymousClass4Iw.SEE_ALL : AnonymousClass4Iw.HIDE;
        } else if (!anonymousClass4J1.f52586L) {
            anonymousClass4J1.f52578D.f52573D = AnonymousClass4Iw.MANAGE;
        } else if (anonymousClass4J1.f52577C.size() <= anonymousClass4J1.f52583I) {
            anonymousClass4J1.f52578D.f52573D = AnonymousClass4Iw.HIDE;
        } else {
            anonymousClass4J1.f52578D.f52573D = AnonymousClass4Iw.SEE_ALL;
        }
    }

    /* renamed from: F */
    private int m23804F(GalleryItem galleryItem) {
        return galleryItem.m14353D() ? galleryItem.f25665C.isValid() : galleryItem.f25664B.isValid() ? this.f52588N.indexOf(galleryItem) : -1;
    }

    /* renamed from: G */
    private static View m23805G(AnonymousClass4J1 anonymousClass4J1, ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
            case 1:
                return new AnonymousClass3BG(viewGroup.getContext(), anonymousClass4J1.f52592R);
            case 2:
                return AnonymousClass5SV.B(viewGroup, null);
            default:
                throw new IllegalStateException("Invalid view type");
        }
    }

    /* renamed from: H */
    private static int m23806H(AnonymousClass4J1 anonymousClass4J1) {
        if (anonymousClass4J1.f52578D.f52573D == AnonymousClass4Iw.SEE_FEWER) {
            return anonymousClass4J1.f52577C.size();
        }
        return Math.min(anonymousClass4J1.f52577C.size(), anonymousClass4J1.f52583I);
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m23808I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass4J0 anonymousClass4J0 = (AnonymousClass4J0) anonymousClass0oo;
        AnonymousClass4J3 anonymousClass4J3 = (AnonymousClass4J3) this.f52581G.get(i);
        AnonymousClass3BG anonymousClass3BG;
        GalleryItem galleryItem;
        AnonymousClass1SE C;
        boolean z;
        Object obj;
        switch (getItemViewType(i)) {
            case 0:
                anonymousClass3BG = (AnonymousClass3BG) anonymousClass4J0.f10370B;
                galleryItem = anonymousClass4J3.f52598C;
                C = AnonymousClass4J1.m23801C(this, anonymousClass4J3.f52598C);
                z = this.f52586L;
                AnonymousClass2Uf anonymousClass2Uf = this.f52580F;
                obj = galleryItem.f25665C;
                AnonymousClass3BG.m18878B(anonymousClass3BG, galleryItem, C, z, obj);
                anonymousClass2Uf.m16055A(obj, anonymousClass3BG);
                anonymousClass3BG.invalidate();
                return;
            case 1:
                anonymousClass3BG = (AnonymousClass3BG) anonymousClass4J0.f10370B;
                galleryItem = anonymousClass4J3.f52598C;
                C = AnonymousClass4J1.m23801C(this, anonymousClass4J3.f52598C);
                z = this.f52586L;
                AnonymousClass24o anonymousClass24o = this.f52579E;
                obj = galleryItem.f25664B;
                AnonymousClass3BG.m18878B(anonymousClass3BG, galleryItem, C, z, obj);
                anonymousClass24o.m14349A(obj, anonymousClass3BG);
                anonymousClass3BG.invalidate();
                return;
            case 2:
                ((AnonymousClass5SV) anonymousClass4J0).V(anonymousClass4J3.f52597B, this.f52582H);
                return;
            default:
                throw new IllegalStateException("Invalid view type");
        }
    }

    /* renamed from: J */
    public final /* bridge */ /* synthetic */ AnonymousClass0oo m23809J(ViewGroup viewGroup, int i) {
        return m23813S(viewGroup, i);
    }

    /* renamed from: P */
    public final GalleryItem m23810P() {
        return this.f52585K.isEmpty() ? null : (GalleryItem) this.f52585K.get(0);
    }

    /* renamed from: Q */
    public final int m23811Q(GalleryItem galleryItem) {
        if (!this.f52577C.contains(galleryItem) && !this.f52585K.contains(galleryItem)) {
            return -1;
        }
        switch (galleryItem.f25666D.ordinal()) {
            case 0:
                return (this.f52585K.indexOf(galleryItem) + ((this.f52577C.isEmpty() ^ 1) != 0 ? 2 : 0)) + AnonymousClass4J1.m23806H(this);
            case 1:
                return this.f52577C.indexOf(galleryItem) + 1;
            default:
                throw new IllegalStateException("Invalid view type");
        }
    }

    /* renamed from: R */
    public final boolean m23812R(GalleryItem galleryItem) {
        return m23804F(galleryItem) > -1;
    }

    public final void RPA(List list, String str) {
        this.f52585K.clear();
        for (Medium galleryItem : list) {
            this.f52585K.add(new GalleryItem(galleryItem));
        }
        this.f52590P.f52571B = str;
        this.f52590P.f52573D = AnonymousClass4Iw.HIDE;
        m23815U();
    }

    /* renamed from: S */
    public final AnonymousClass4J0 m23813S(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
            case 1:
                return new AnonymousClass4J0(AnonymousClass4J1.m23805G(this, viewGroup, i));
            case 2:
                return new AnonymousClass5SV(AnonymousClass4J1.m23805G(this, viewGroup, i));
            default:
                throw new IllegalStateException("Invalid view type");
        }
    }

    /* renamed from: T */
    public final void m23814T(List list) {
        if (list.size() == 1) {
            TRA((GalleryItem) list.get(0), true, false);
            return;
        }
        for (GalleryItem galleryItem : list) {
            if (!(galleryItem == null || this.f52588N.contains(galleryItem))) {
                this.f52588N.add(galleryItem);
            }
        }
        this.f52593S.Xr(this.f52588N.isEmpty() ? m23810P() : (GalleryItem) this.f52588N.get(0), false);
        AnonymousClass2NY B = AnonymousClass2NY.m15348B();
        B.f29728Y = this.f52588N.size();
        B.f29727X = Math.max(B.f29727X, B.f29728Y);
        AnonymousClass0F4.f2058E.C(new AnonymousClass4Hx(aR().size(), this.f52586L));
    }

    public final void TRA(GalleryItem galleryItem, boolean z, boolean z2) {
        Object obj;
        AnonymousClass2NY B;
        if (!this.f52577C.contains(galleryItem)) {
            if (!this.f52585K.contains(galleryItem)) {
                obj = null;
                if (obj != null) {
                    this.f52588N.remove(galleryItem);
                }
                if (z) {
                    if (!this.f52586L) {
                        this.f52588N.clear();
                    }
                    if (!this.f52588N.contains(galleryItem)) {
                        if ((this.f52588N.size() >= this.f52584J ? 1 : null) == null || !this.f52586L) {
                            this.f52588N.add(galleryItem);
                        } else {
                            return;
                        }
                    }
                    this.f52593S.Xr(galleryItem, z2);
                } else if (m23812R(galleryItem)) {
                    this.f52588N.remove(galleryItem);
                    if (!this.f52588N.isEmpty()) {
                        this.f52593S.Yr(galleryItem, z2);
                    }
                }
                B = AnonymousClass2NY.m15348B();
                B.f29728Y = this.f52588N.size();
                B.f29727X = Math.max(B.f29727X, B.f29728Y);
                if (galleryItem.m14352C()) {
                    B.f29717N = true;
                }
                m23815U();
                return;
            }
        }
        obj = 1;
        if (obj != null) {
            if (z) {
                if (this.f52586L) {
                    this.f52588N.clear();
                }
                if (this.f52588N.contains(galleryItem)) {
                    if (this.f52588N.size() >= this.f52584J) {
                    }
                    if ((this.f52588N.size() >= this.f52584J ? 1 : null) == null) {
                    }
                    this.f52588N.add(galleryItem);
                }
                this.f52593S.Xr(galleryItem, z2);
            } else if (m23812R(galleryItem)) {
                this.f52588N.remove(galleryItem);
                if (this.f52588N.isEmpty()) {
                    this.f52593S.Yr(galleryItem, z2);
                }
            }
            B = AnonymousClass2NY.m15348B();
            B.f29728Y = this.f52588N.size();
            B.f29727X = Math.max(B.f29727X, B.f29728Y);
            if (galleryItem.m14352C()) {
                B.f29717N = true;
            }
            m23815U();
            return;
        }
        this.f52588N.remove(galleryItem);
    }

    /* renamed from: U */
    public final void m23815U() {
        int i;
        this.f52581G.clear();
        if (!this.f52577C.isEmpty()) {
            this.f52581G.add(new AnonymousClass4J3(this.f52578D));
            for (i = 0; i < AnonymousClass4J1.m23806H(this); i++) {
                this.f52581G.add(new AnonymousClass4J3((GalleryItem) this.f52577C.get(i)));
            }
            this.f52581G.add(new AnonymousClass4J3(this.f52590P));
        }
        i = this.f52585K.size();
        for (int i2 = 0; i2 < i; i2++) {
            this.f52581G.add(new AnonymousClass4J3((GalleryItem) this.f52585K.get(i2)));
        }
        notifyDataSetChanged();
    }

    public final List aR() {
        return Collections.unmodifiableList(this.f52588N);
    }

    public final long getItemId(int i) {
        AnonymousClass4J3 anonymousClass4J3 = (AnonymousClass4J3) this.f52581G.get(i);
        switch (getItemViewType(i)) {
            case 0:
            case 1:
                return (long) anonymousClass4J3.f52598C.m14350A().hashCode();
            case 2:
                return (long) anonymousClass4J3.f52597B.hashCode();
            default:
                throw new IllegalStateException("Invalid view type");
        }
    }

    public final int getItemViewType(int i) {
        AnonymousClass4J3 anonymousClass4J3 = (AnonymousClass4J3) this.f52581G.get(i);
        switch (anonymousClass4J3.f52599D.ordinal()) {
            case 0:
                return anonymousClass4J3.f52598C.f25666D == AnonymousClass24q.MEDIUM ? 0 : 1;
            case 1:
                return 2;
            default:
                throw new IllegalStateException("Invalid view type");
        }
    }
}
