package com.facebook.common.dextricks;

public class CorruptedApplicationStateException extends RuntimeException {
    private final Remedy mRemedy;

    /* renamed from: com.facebook.common.dextricks.CorruptedApplicationStateException$1 */
    public /* synthetic */ class C00001 {
        /* renamed from: $SwitchMap$com$facebook$common$dextricks$CorruptedApplicationStateException$Remedy */
        public static final /* synthetic */ int[] f99x830aeb77 = new int[Remedy.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r0 = com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.values();
            r0 = r0.length;
            r0 = new int[r0];
            f99x830aeb77 = r0;
            r2 = f99x830aeb77;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.REBOOT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = f99x830aeb77;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.REINSTALL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.CorruptedApplicationStateException.1.<clinit>():void");
        }
    }

    public enum Remedy {
        REINSTALL,
        REBOOT,
        UNKNOWN
    }

    public CorruptedApplicationStateException(Throwable th) {
        this(th, Remedy.UNKNOWN);
    }

    public CorruptedApplicationStateException(Throwable th, Remedy remedy) {
        super(th);
        this.mRemedy = remedy;
    }

    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application is in corrupt state. ");
        switch (this.mRemedy.ordinal()) {
            case 0:
                stringBuilder.append("Reinstall application.");
                break;
            case 1:
                stringBuilder.append("Reboot device. ");
                break;
            default:
                break;
        }
        stringBuilder.append("[ mRemedy = ");
        stringBuilder.append(this.mRemedy);
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }

    public Remedy getRemedy() {
        return this.mRemedy;
    }
}
