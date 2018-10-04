package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.4RO */
public enum AnonymousClass4RO {
    SHORT(C0164R.dimen.music_editor_scrubber_equalizer_bar_height_short),
    TALL(C0164R.dimen.music_editor_scrubber_equalizer_bar_height_tall);
    
    /* renamed from: B */
    private int f54077B;
    /* renamed from: C */
    private final int f54078C;

    private AnonymousClass4RO(int i) {
        this.f54078C = i;
    }

    /* renamed from: A */
    public final float m24219A(Context context) {
        return m24220B(context) * 1.5f;
    }

    /* renamed from: B */
    public final float m24220B(Context context) {
        if (this.f54077B == 0) {
            this.f54077B = context.getResources().getDimensionPixelSize(this.f54078C);
        }
        return (float) this.f54077B;
    }
}
