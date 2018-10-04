package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;

/* renamed from: X.2oy */
public final class AnonymousClass2oy {
    /* renamed from: B */
    public final AudioManager f34379B;
    /* renamed from: C */
    public BluetoothAdapter f34380C;
    /* renamed from: D */
    public BluetoothHeadset f34381D;
    /* renamed from: E */
    public boolean f34382E;
    /* renamed from: F */
    public AnonymousClass2ox f34383F;
    /* renamed from: G */
    public final Context f34384G;
    /* renamed from: H */
    public AnonymousClass42O f34385H;

    public AnonymousClass2oy(Context context, AudioManager audioManager) {
        this.f34384G = context;
        this.f34379B = audioManager;
    }

    /* renamed from: A */
    public final void m17309A() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r4 = this;
        r3 = 0;
        r4.f34385H = r3;
        r0 = r4.f34382E;
        if (r0 == 0) goto L_0x001c;
    L_0x0007:
        r0 = r4.f34379B;
        r0 = r0.isBluetoothScoOn();
        r1 = 0;
        if (r0 == 0) goto L_0x0015;
    L_0x0010:
        r0 = r4.f34379B;
        r0.setBluetoothScoOn(r1);
    L_0x0015:
        r0 = r4.f34379B;
        r0.stopBluetoothSco();
        r4.f34382E = r1;
    L_0x001c:
        r0 = r4.f34383F;	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 == 0) goto L_0x0029;	 Catch:{ IllegalArgumentException -> 0x0029 }
    L_0x0020:
        r1 = r4.f34384G;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r0 = r4.f34383F;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r1.unregisterReceiver(r0);	 Catch:{ IllegalArgumentException -> 0x0029 }
        r4.f34383F = r3;	 Catch:{ IllegalArgumentException -> 0x0029 }
    L_0x0029:
        r2 = r4.f34380C;
        if (r2 == 0) goto L_0x0035;
    L_0x002d:
        r1 = r4.f34381D;
        if (r1 == 0) goto L_0x0035;
    L_0x0031:
        r0 = 1;
        r2.closeProfileProxy(r0, r1);
    L_0x0035:
        r4.f34381D = r3;
        r4.f34380C = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2oy.A():void");
    }

    /* renamed from: B */
    public final boolean m17310B() {
        if (!(this.f34380C == null || this.f34381D == null)) {
            if ((AnonymousClass0Ca.B(this.f34384G, "android.permission.BLUETOOTH") == 0 ? 1 : null) != null && this.f34381D.getConnectedDevices().size() > 0) {
                return true;
            }
        }
        return false;
    }
}
