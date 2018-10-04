package X;

import android.content.res.Resources;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.19B */
public final class AnonymousClass19B {
    /* renamed from: B */
    public static String m9653B(Resources resources, int i) {
        if (i <= 0) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setMaximumFractionDigits(0);
        return resources.getQuantityString(C0164R.plurals.hashtag_posts, i, new Object[]{decimalFormat.format((long) i)});
    }

    /* renamed from: C */
    public static String m9654C(Resources resources, int i) {
        if (i == 1) {
            return resources.getString(C0164R.string.number_of_people_who_like_this_photo_singular, new Object[]{Integer.valueOf(i)});
        }
        return resources.getString(C0164R.string.number_of_people_who_like_this_photo, new Object[]{NumberFormat.getInstance(Locale.getDefault()).format((long) i)});
    }

    /* renamed from: D */
    public static String m9655D(Resources resources, int i) {
        if (i <= 0) {
            return JsonProperty.USE_DEFAULT_NAME;
        }
        if (i == 1) {
            return resources.getString(C0164R.string.posts_singular, new Object[]{Integer.valueOf(i)});
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setMaximumFractionDigits(0);
        return resources.getString(C0164R.string.posts_plural, new Object[]{decimalFormat.format((long) i)});
    }

    /* renamed from: E */
    public static String m9656E(Resources resources, Integer num) {
        if (num == null || num.intValue() < 0) {
            throw new UnsupportedOperationException("Cannot format null view count");
        } else if (num.intValue() == 1) {
            return resources.getString(C0164R.string.view_count_singular, new Object[]{num});
        } else {
            return resources.getString(C0164R.string.view_count_plural, new Object[]{NumberFormat.getInstance().format(num)});
        }
    }

    /* renamed from: F */
    public static String m9657F(int i, Resources resources, Integer num) {
        if (num == null || num.intValue() < 0) {
            throw new UnsupportedOperationException("Cannot format null view count");
        } else if (num.intValue() == 0) {
            return resources.getString(i);
        } else {
            return AnonymousClass19B.m9656E(resources, num);
        }
    }

    /* renamed from: G */
    public static boolean m9658G(java.lang.String r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0005 }
        r0 = 1;	 Catch:{ NumberFormatException -> 0x0005 }
        return r0;	 Catch:{ NumberFormatException -> 0x0005 }
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.19B.G(java.lang.String):boolean");
    }
}
