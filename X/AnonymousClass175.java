package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.175 */
public abstract class AnonymousClass175 implements AnonymousClass176 {
    /* renamed from: A */
    public abstract void mo2164A(AnonymousClass2Zi anonymousClass2Zi, AnonymousClass178 anonymousClass178);

    public final AnonymousClass2Cp AG(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new AnonymousClass2Zi(layoutInflater.inflate(C0164R.layout.tooltip_text, viewGroup, false));
    }

    public /* bridge */ /* synthetic */ void sC(AnonymousClass2Cp anonymousClass2Cp, AnonymousClass178 anonymousClass178) {
        mo2164A((AnonymousClass2Zi) anonymousClass2Cp, anonymousClass178);
    }
}
