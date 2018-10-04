package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.26F */
public final class AnonymousClass26F implements AnonymousClass0RL {
    /* renamed from: B */
    public int f25968B;
    /* renamed from: C */
    public Bitmap f25969C;
    /* renamed from: D */
    public List f25970D = new ArrayList();
    /* renamed from: E */
    public int f25971E;
    /* renamed from: F */
    public AnonymousClass0aa f25972F;
    /* renamed from: G */
    public boolean f25973G;
    /* renamed from: H */
    public Paint f25974H = null;
    /* renamed from: I */
    public String f25975I;
    /* renamed from: J */
    public int f25976J;

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
    }

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public AnonymousClass26F(int i, Paint paint) {
        this.f25974H = paint;
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        List list = this.f25970D;
        this.f25970D = null;
        this.f25969C = bitmap;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0te anonymousClass0te = (AnonymousClass0te) ((WeakReference) list.get(i)).get();
            if (anonymousClass0te != null) {
                anonymousClass0te.invalidateSelf();
            }
        }
        list.clear();
        this.f25970D = list;
    }
}
