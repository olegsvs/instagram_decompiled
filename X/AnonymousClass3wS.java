package X;

import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* renamed from: X.3wS */
public abstract class AnonymousClass3wS extends AnonymousClass2y7 {
    /* renamed from: C */
    public abstract Pair mo5282C(AnonymousClass2y2 anonymousClass2y2, int[][][] iArr, int[] iArr2);

    /* renamed from: A */
    public final void mo4637A(Object obj) {
        AnonymousClass2y2 anonymousClass2y2 = (AnonymousClass2y2) obj;
    }

    /* renamed from: B */
    private static int m21625B(AnonymousClass2uZ[] anonymousClass2uZArr, TrackGroup trackGroup) {
        int length = anonymousClass2uZArr.length;
        int i = 0;
        for (int i2 = 0; i2 < anonymousClass2uZArr.length; i2++) {
            AnonymousClass2uZ anonymousClass2uZ = anonymousClass2uZArr[i2];
            for (int i3 = 0; i3 < trackGroup.f36142C; i3++) {
                int JVA = anonymousClass2uZ.JVA(trackGroup.m17885A(i3)) & 7;
                if (JVA > i) {
                    if (JVA == 4) {
                        return i2;
                    }
                    length = i2;
                    i = JVA;
                }
            }
        }
        return length;
    }

    /* renamed from: B */
    public final AnonymousClass2y8 mo4638B(AnonymousClass2uZ[] anonymousClass2uZArr, TrackGroupArray trackGroupArray) {
        int i;
        int[] iArr = new int[(anonymousClass2uZArr.length + 1)];
        TrackGroup[][] trackGroupArr = new TrackGroup[(anonymousClass2uZArr.length + 1)][];
        int[][][] iArr2 = new int[(anonymousClass2uZArr.length + 1)][][];
        for (i = 0; i < trackGroupArr.length; i++) {
            trackGroupArr[i] = new TrackGroup[trackGroupArray.f36145B];
            iArr2[i] = new int[trackGroupArray.f36145B][];
        }
        int[] iArr3 = new int[anonymousClass2uZArr.length];
        for (i = 0; i < iArr3.length; i++) {
            iArr3[i] = anonymousClass2uZArr[i].MVA();
        }
        for (int i2 = 0; i2 < trackGroupArray.f36145B; i2++) {
            int[] iArr4;
            TrackGroup A = trackGroupArray.m17887A(i2);
            int B = AnonymousClass3wS.m21625B(anonymousClass2uZArr, A);
            if (B == anonymousClass2uZArr.length) {
                iArr4 = new int[A.f36142C];
            } else {
                AnonymousClass2uZ anonymousClass2uZ = anonymousClass2uZArr[B];
                iArr4 = new int[A.f36142C];
                for (i = 0; i < A.f36142C; i++) {
                    iArr4[i] = anonymousClass2uZ.JVA(A.m17885A(i));
                }
            }
            i = iArr[B];
            trackGroupArr[B][i] = A;
            iArr2[B][i] = iArr4;
            iArr[B] = iArr[B] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[anonymousClass2uZArr.length];
        int[] iArr5 = new int[anonymousClass2uZArr.length];
        for (int i3 = 0; i3 < anonymousClass2uZArr.length; i3++) {
            B = iArr[i3];
            trackGroupArrayArr[i3] = new TrackGroupArray((TrackGroup[]) Arrays.copyOf(trackGroupArr[i3], B));
            iArr2[i3] = (int[][]) Arrays.copyOf(iArr2[i3], B);
            iArr5[i3] = anonymousClass2uZArr[i3].TT();
        }
        AnonymousClass2y2 anonymousClass2y2 = new AnonymousClass2y2(iArr5, trackGroupArrayArr, iArr3, iArr2, new TrackGroupArray((TrackGroup[]) Arrays.copyOf(trackGroupArr[anonymousClass2uZArr.length], iArr[anonymousClass2uZArr.length])));
        Pair C = mo5282C(anonymousClass2y2, iArr2, iArr3);
        return new AnonymousClass2y8((AnonymousClass2ua[]) C.first, (AnonymousClass2y4[]) C.second, anonymousClass2y2);
    }
}
