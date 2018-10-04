package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.27c */
public final class AnonymousClass27c {
    /* renamed from: B */
    private static final ArrayList f26300B;

    static {
        ArrayList arrayList = new ArrayList();
        f26300B = arrayList;
        arrayList.add(Integer.valueOf(-1));
        arrayList = f26300B;
        arrayList.add(Integer.valueOf(-16777216));
        arrayList.add(Integer.valueOf(Color.parseColor("#ED4956")));
    }

    /* renamed from: B */
    public static AnonymousClass2VC m14502B(Context context, AnonymousClass27l anonymousClass27l, long j) {
        List arrayList = new ArrayList();
        Context context2 = context;
        Resources resources = context.getResources();
        long j2 = j;
        if (AnonymousClass27c.m14503C(j)) {
            int size = f26300B.size();
            for (int i = 0; i < size; i++) {
                int intValue = ((Integer) f26300B.get(i)).intValue();
                Drawable anonymousClass27S = new AnonymousClass27S(context2, resources, 0.5f, j2);
                anonymousClass27S.setColorFilter(AnonymousClass0ca.B(intValue));
                arrayList.add(anonymousClass27S);
            }
        } else {
            for (AnonymousClass27n anonymousClass27n : anonymousClass27l.f26360F) {
                if (anonymousClass27n.f26370G.equals("time_sticker_analog")) {
                    arrayList.add(new AnonymousClass27F(context2, resources, 0.5f, j2));
                } else if (anonymousClass27n.f26370G.equals("time_sticker_digital")) {
                    arrayList.add(new AnonymousClass27G(context2, resources, 0.5f, j2));
                } else if (anonymousClass27n.f26370G.equals("time_sticker_text")) {
                    arrayList.add(new AnonymousClass27S(context2, resources, 0.5f, j2));
                }
            }
        }
        return new AnonymousClass2VC(context2, arrayList);
    }

    /* renamed from: C */
    public static boolean m14503C(long j) {
        return j < System.currentTimeMillis() - 86400000;
    }
}
