package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.16I */
public final class AnonymousClass16I {
    /* renamed from: B */
    public final AnonymousClass16K f14519B;
    /* renamed from: C */
    public final Map f14520C = new HashMap();

    public AnonymousClass16I(AnonymousClass16K anonymousClass16K) {
        this.f14519B = anonymousClass16K;
    }

    /* renamed from: A */
    public final void m9387A() {
        this.f14520C.clear();
        AnonymousClass16I.m9386C(this).edit().clear().apply();
    }

    /* renamed from: B */
    public final void m9388B() {
        this.f14520C.clear();
    }

    /* renamed from: B */
    public static void m9385B(AnonymousClass16I anonymousClass16I, Object obj) {
        char toLowerCase = Character.toLowerCase(anonymousClass16I.f14519B.UN(obj).charAt(0));
        if (!anonymousClass16I.f14520C.containsKey(Character.valueOf(toLowerCase))) {
            anonymousClass16I.f14520C.put(Character.valueOf(toLowerCase), new HashSet());
        }
        ((Set) anonymousClass16I.f14520C.get(Character.valueOf(toLowerCase))).add(obj);
    }

    /* renamed from: C */
    public static SharedPreferences m9386C(AnonymousClass16I anonymousClass16I) {
        return AnonymousClass0Mu.m3254C(anonymousClass16I.f14519B.kP());
    }

    /* renamed from: C */
    public final List m9389C(CharSequence charSequence) {
        List arrayList = new ArrayList();
        if (charSequence != null && charSequence.length() > 0) {
            Character valueOf = Character.valueOf(Character.toLowerCase(charSequence.charAt(0)));
            if (this.f14520C.containsKey(valueOf)) {
                for (Object next : (Set) this.f14520C.get(valueOf)) {
                    if (this.f14519B.UN(next).toLowerCase(Locale.getDefault()).startsWith(charSequence.toString().toLowerCase(Locale.getDefault()))) {
                        arrayList.add(next);
                        if (arrayList.size() == Integer.MAX_VALUE) {
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public final void m9390D() {
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
        r3 = this;
        r0 = X.AnonymousClass16I.m9386C(r3);
        r0 = r0.getAll();
        r0 = r0.entrySet();
        r2 = r0.iterator();
    L_0x0010:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x002e;
    L_0x0016:
        r0 = r2.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r3.f14519B;	 Catch:{ IOException -> 0x0010 }
        r0 = r0.getValue();	 Catch:{ IOException -> 0x0010 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0010 }
        r0 = r1.QG(r0);	 Catch:{ IOException -> 0x0010 }
        X.AnonymousClass16I.m9385B(r3, r0);	 Catch:{ IOException -> 0x0010 }
        goto L_0x0010;	 Catch:{ IOException -> 0x0010 }
    L_0x002e:
        return;	 Catch:{ IOException -> 0x0010 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.16I.D():void");
    }
}
