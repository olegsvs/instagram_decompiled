package X;

import android.content.Context;
import android.view.View;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.1LP */
public final class AnonymousClass1LP {
    /* renamed from: B */
    public final int f17332B;
    /* renamed from: C */
    public final View f17333C;
    /* renamed from: D */
    public final int f17334D;
    /* renamed from: E */
    public final int f17335E;
    /* renamed from: F */
    public final int f17336F;
    /* renamed from: G */
    public final String f17337G;
    /* renamed from: H */
    public final int f17338H;

    public AnonymousClass1LP(int i, int i2, int i3, int i4, int i5, String str, View view) {
        this.f17338H = i;
        this.f17336F = i2;
        this.f17335E = i3;
        this.f17334D = i4;
        this.f17332B = i5;
        this.f17337G = str;
        this.f17333C = view;
    }

    /* renamed from: A */
    public final String m10846A(Context context) {
        int i = this.f17338H;
        if (i != -1) {
            return context.getString(i);
        }
        String str = this.f17337G;
        if (str == null) {
            str = JsonProperty.USE_DEFAULT_NAME;
        }
        return str;
    }

    /* renamed from: B */
    public static AnonymousClass1LP m10843B(View view) {
        return new AnonymousClass1LP(-1, -1, -1, -1, -1, null, view);
    }

    /* renamed from: C */
    public static AnonymousClass1LP m10844C(String str) {
        return new AnonymousClass1LP(-1, -1, -1, -1, -1, str, null);
    }

    /* renamed from: D */
    public static AnonymousClass1LP m10845D(int i) {
        return new AnonymousClass1LP(i, -1, -1, -1, -1, null, null);
    }
}
