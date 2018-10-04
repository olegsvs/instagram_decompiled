package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Xd */
public final class AnonymousClass1Xd implements AnonymousClass0RL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2KL f19842B;
    /* renamed from: C */
    public final /* synthetic */ int f19843C;
    /* renamed from: D */
    public final /* synthetic */ boolean[] f19844D;
    /* renamed from: E */
    public final /* synthetic */ int f19845E;
    /* renamed from: F */
    public final /* synthetic */ int f19846F;
    /* renamed from: G */
    public final /* synthetic */ long f19847G;
    /* renamed from: H */
    public final /* synthetic */ AnonymousClass2NV f19848H;

    public AnonymousClass1Xd(AnonymousClass2KL anonymousClass2KL, boolean[] zArr, int i, int i2, long j, AnonymousClass2NV anonymousClass2NV, int i3) {
        this.f19842B = anonymousClass2KL;
        this.f19844D = zArr;
        this.f19846F = i;
        this.f19845E = i2;
        this.f19847G = j;
        this.f19848H = anonymousClass2NV;
        this.f19843C = i3;
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
        AnonymousClass2KL.C(this.f19842B, this.f19846F, this.f19845E);
    }

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
        if (i == 0) {
            this.f19844D[0] = null;
        }
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        long E = AnonymousClass0Gd.m1840E() - this.f19847G;
        AnonymousClass2KL anonymousClass2KL = this.f19842B;
        anonymousClass2KL.f28975C = Math.max(anonymousClass2KL.f28975C, E);
        Bitmap bitmap2 = bitmap;
        Rect B = AnonymousClass2KL.B(bitmap, this.f19848H, this.f19843C);
        double d = (double) this.f19848H.f29683F;
        double d2 = (double) this.f19848H.f29682E;
        Double.isNaN(d);
        Double.isNaN(d2);
        d /= d2;
        if (bitmap != null && B != null) {
            for (AnonymousClass0vX JUA : this.f19842B.f28976D) {
                JUA.JUA(bitmap2, B, this.f19846F, this.f19845E, d);
            }
            int i;
            int i2;
            int C;
            if (this.f19842B.f28974B) {
                String str = this.f19842B.f28977E.f8557G;
                int i3 = this.f19843C;
                i = this.f19848H.f29679B;
                i2 = this.f19846F;
                boolean z = this.f19844D[0];
                C = AnonymousClass1dF.m12187C(str);
                Map hashMap = new HashMap();
                hashMap.put("thumbnail_index", Integer.toString(i3));
                hashMap.put("total_thumbnails", Integer.toString(i));
                hashMap.put("playback_time", Integer.toString(i2));
                hashMap.put("thumbnail_in_cache", Integer.toString(z));
                AnonymousClass1dF.m12186B(1900591, C, hashMap);
                AnonymousClass0Ea.f1980C.m1451Y(1900591, C, "first_thumbnail_shown");
                this.f19842B.f28974B = false;
            } else if (this.f19843C % 10 == 0) {
                String str2 = this.f19842B.f28977E.f8557G;
                i = this.f19843C;
                i2 = this.f19846F;
                C = AnonymousClass1dF.m12187C(str2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(i);
                str2 = ":";
                stringBuilder.append(str2);
                stringBuilder.append(i2);
                stringBuilder.append(str2);
                stringBuilder.append(E);
                Map hashMap2 = new HashMap();
                hashMap2.put(Integer.toString(i), stringBuilder.toString());
                AnonymousClass1dF.m12186B(1900591, C, hashMap2);
            }
        }
    }
}
